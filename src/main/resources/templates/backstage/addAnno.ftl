<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<br>
			<div role="form">
				<div class="form-group">
					 <label>标题</label><input id="title" name="title" type="text" class="form-control"/>
				</div>
				<div class="form-group">
					 <label>来源</label><input id="author" name="author" type="text" class="form-control"/>
				</div>
				<div class="form-group">
					 <label>内容</label><textarea id="content" name="content" class="form-control" style="resize:none;height:300px;resize:none;"></textarea>
				</div>
				<div class="form-group">
					 <label>类别</label>
					 <select id="typeId" name="typeId" class="form-control">
						<option value="0">请选择类别</option>
						<option value="1">招聘公告</option>
						<option value="2">实习岗位</option>
						<option value="3">企业招聘</option>
						<option value="4">校园招聘</option>
						<option value="5">招聘简章</option>
					 </select>
				</div>
				<div type="submit" id="save" class="btn btn-default btn-success">提交</div><br><br>
				<script type="text/javascript">
					$(function(){
						$("#save").click(function(){
							var vTitle = document.getElementById("title");
							var vAuthor = document.getElementById("author");
							var vContent = document.getElementById("content");
							var vTypeId = document.getElementById("typeId");
							if($.trim(vTitle.value)==""){
								$.messager.alert('错误信息','标题不能为空','error');
								return;
							}else if($.trim(vAuthor.value)==""){
								$.messager.alert('错误信息','来源不能为空','error');
								return;
							}else if($.trim(vContent.value)==""){
								$.messager.alert('错误信息','内容不能为空','error');
								return;
							}else if(vTypeId.value==0){
								$.messager.alert('错误信息','请选择类别','error');
								return;
							}else if($.trim(vTitle.value).length>30){
								$.messager.alert('提示信息','标题长度不能大于30个字符','info');
								return;
							}else if($.trim(vAuthor.value).length>20){
								$.messager.alert('提示信息','来源长度不能大于20个字符','info');
								return;
							}
							var url = "/EmpGuid/manager/doAddAnno";
							var args = {
								"title":vTitle.value,
								"author":vAuthor.value,
								"content":vContent.value,
								"typeId":vTypeId.value,
								"time":new Date()
							};
							$.post(url,args,function(data){
					   			$.messager.alert('提示信息','保存成功','info');
					   			openURL('添加信息', '/EmpGuid/manager/addAnno');
							});
						});
					})
				</script>
				
			</div>
		</div>
	</div>
</div>
