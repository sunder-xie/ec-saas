<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>顾氏erp系统</title>
	<%@ include file="../header.jsp" %>
	<script type="text/javascript" src="${ctx}/resources/plugin/jquery.validate.min.js"></script>
	<script type="text/javascript" src="${ctx}/resources/js/job/job_edit.js"></script>
</head>

<body>
<div class="place">
	<span>位置：</span>
	<ul class="placeul">
		<li>权限系统</li>
		<li>职位管理</li>
	</ul>
</div>
<div class="rightinfo">
	<div class="tipinfo">
		<form id="form" method="post">
			<div class="tipinfo">
				<dl>
					<dt>职位编号：</dt>
					<dd><input type="text" name="code" id="code" value="${erpJob.code}" maxlength="20"></dd>
				</dl>
				<dl>
					<dt>职位名称：</dt>
					<dd><input type="text" name="job_name" id="job_name" value="${erpJob.job_name}" maxlength="20"></dd>
				</dl>
				<dl>
					<dt>备注：</dt>
					<dd><textarea id="description" name="description" rows="3" cols="25">${erpJob.description}</textarea></dd>
				</dl>
			</div>
			<input type="hidden" id="job_id" name="id" value="${erpJob.id}"/>

			<div class="tipbtn">
				<input id="sub_but" type="button" class="sure" value="确定" />&nbsp;
				<input id="back_but" type="button" class="cancel" value="返回" onclick="history.go(-1);"/>
			</div>
		</form>
	</div>
</div>
</body>
</html>
