package com.heaven.dao;

import com.heaven.bean.Video;
import com.heaven.bean.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    long countByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int deleteByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int insert(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int insertSelective(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    List<Video> selectByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    Video selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int updateByPrimaryKeySelective(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Thu May 23 20:59:58 CST 2019
     */
    int updateByPrimaryKey(Video record);
}