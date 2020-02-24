<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>图片上传</title>
</head>
<body>
	<form method="post" action="UpFileServlet?op=saveImg" enctype="multipart/form-data">
		选择一个文件：<br> 轮播图片名：<input type="text" name="bannerName"><br>
		上传文件图片：<input type="file" name="bannerImg"><br> 
		<br><br>
		<input type="submit" value="上传">
	</form>
</body>
</html>