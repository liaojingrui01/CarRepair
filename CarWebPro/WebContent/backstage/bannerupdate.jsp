<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>轮播图</title>
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/css.css"  />
<script type="text/javascript" src="./js/jquery.min.js"></script>
</head>
<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="/CarWebPro/backstage/img/coin02.png" /><span><a href="/CarWebPro/backstage/index.jsp" target="index">首页</a>&nbsp;-&nbsp;<a
					href="/CarWebPro/backstage/index.jsp" target="index">轮播图管理</a>&nbsp;-</span>&nbsp;图片修改
			</div>
		</div>
		<div class="page " >
			<!-- 上传广告页面样式 -->
			<div class="banneradd bor">
				<div class="baTop">
					<span>修改图片</span>
				</div>
				<form action="${pageContext.request.contextPath }/BanUrl?op=updateBan" method="post"  enctype="multipart/form-data" >
				<div class="baBody" >
					<div class="bbD">
						图片序号：<input type="text" name="bannerId" value="${banEnt.bannerId}">
						图片名称：<input type="text" name="bannerName" value="${banEnt.bannerName}">
					</div>
					<div class="bbD">
						图片：
						<input type="file" name="bannerImg" value="${banEnt.bannerImg}">
						<!-- <div class="bbDd">
							<div class="bbDImg">+</div>
						</div> -->
					</div>
					<div class="bbD">
						
							<button type="submit" class="btn_ok btn_yes" >提交</button>
							<a class="btn_ok btn_no" href="${pageContext.request.contextPath }/BanUrl?op=queryBanner" target="main">取消</a>
						<p class="bbDP"></p>
					</div>
				</div>
				</form>
			</div>
			
			<hr/>
			

			<!-- 上传广告页面样式end -->
		</div>
	</div>
</body>
</html>