package com.heaven.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.heaven.bean.Announcement;
import com.heaven.bean.General;
import com.heaven.bean.User;
import com.heaven.bean.VideoComment;
import com.heaven.bean.extend.UserVO;
import com.heaven.bean.extend.VideoCommentVO;
import com.heaven.service.IAnnouncementService;
import com.heaven.service.IGeneralService;
import com.heaven.service.IUserService;
import com.heaven.service.IVideoCommentService;
import com.heaven.utils.CookieUtil;

@RestController
@RequestMapping("/recruit")
public class RecruitController {

	@Autowired
	private IAnnouncementService announcementService;
	@Autowired
	private IGeneralService generalService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IVideoCommentService videoCommentService;

	@GetMapping("/more")
	public ModelAndView more(@RequestParam(value = "page", defaultValue = "1") Integer page, HttpServletRequest request,
			Map<String, Object> map) {
		PageHelper.startPage(page, 10);
		String recruitName = request.getParameter("recruitName");
		String recruId = request.getParameter("recruidId");
		List<Announcement> announcementList = announcementService.findByRecruId(Integer.parseInt(recruId));
		PageInfo<Announcement> pageInfo = new PageInfo<>(announcementList);
		List<Announcement> pageList = pageInfo.getList();
		map.put("announcementList", pageList);
		map.put("currentPage", page);
		map.put("totalPage", pageInfo.getPages());
		map.put("recruId", recruId);
		map.put("recruitName", recruitName);
		return new ModelAndView("reception/recruit_more", map);
	}

	@GetMapping("/recruitDetails")
	public ModelAndView recruitDetails(HttpServletRequest request, Map<String, Object> map) {
		String id = request.getParameter("id");
		String recruitName = request.getParameter("recruitName");
		Announcement announcement = announcementService.findById(Integer.parseInt(id));
		map.put("announcement", announcement);
		map.put("recruitName", recruitName);
		return new ModelAndView("reception/recruit_detail", map);
	}

	@GetMapping("/generalMore")
	public ModelAndView generalMore(@RequestParam(value = "page", defaultValue = "1") Integer page,
			Map<String, Object> map) {
		PageHelper.startPage(page, 10);
		List<General> generalList = generalService.selectAll();
		PageInfo<General> pageInfo = new PageInfo<>(generalList);
		List<General> list = pageInfo.getList();
		map.put("generalList", list);
		map.put("currentPage", page);
		map.put("totalPage", pageInfo.getPages());
		return new ModelAndView("reception/general_more", map);
	}

	@GetMapping("/generalDetails")
	public ModelAndView generalDetails(Integer id, Map<String, Object> map) {
		General general = generalService.selectById(id);
		map.put("general", general);
		return new ModelAndView("reception/general_detail", map);
	}
	@GetMapping("/showInfo")
	public ModelAndView showInfo(String username,Map<String,Object> map){
		UserVO userVO = userService.login(username);
		List<VideoCommentVO> VideoCommentVOList = videoCommentService.selectByUserName(username);
		map.put("userVO", userVO);
		map.put("VideoCommentVOList", VideoCommentVOList);
		return new ModelAndView("reception/myinfo",map);
	}
	@PostMapping("/editInfo")
	public String editInfo(User user,HttpServletResponse response) {
		UserVO userVO = userService.login(user.getUsername());
		if (userVO != null && !userVO.getUsername().equals(user.getUsername())) {
			return "用户名已被占用";
		}
		userService.update(user);
		videoCommentService.updateUserName(user);
		CookieUtil.setCookie(response, "username", user.getUsername(), 7200);
		return "信息修改成功";
	}
	@PostMapping("/editComment")
	public String editComment(VideoComment videoComment){
		if(videoComment.getContent().length()<=0){
			return "内容不能为空";
		}
		if(videoComment.getContent().length()>200){
			return "内容不能超过200个字符";
		}
		videoCommentService.updateComment(videoComment);
		return "修改成功";
	}
	@GetMapping("/delComment")
	public void delComment(Integer id){
		videoCommentService.deleteById(id);
	}
}