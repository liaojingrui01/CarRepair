<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>上传轮播图</title>
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/css.css" />
<script type="text/javascript" src="./js/jquery.min.js"></script>
</head>
<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="/CarWebPro/backstage/img/coin02.png" /><span><a href="/CarWebPro/backstage/index.jsp" target="index">首页</a>&nbsp;-&nbsp;<a
					href="/CarWebPro/backstage/index.jsp" target="index">轮播图管理</a>&nbsp;-</span>&nbsp;图片添加
			</div>
		</div>
		<div class="page " >
			<!-- 上传广告页面样式 -->
			<div class="banneradd bor">
				<div class="baTop">
					<span>上传图片</span>
				</div>
				<form action="${pageContext.request.contextPath }/BanUrl?op=saveBanner" method="post"  enctype="multipart/form-data" >
				<div class="baBody" >
					<div class="bbD">
						图片名称：<input type="text" name="bannerName">
					</div><br />
					<div class="bbD">
						上传图片：
						<input type="file" name="bannerImg">
					</div><br />
					<div class="bbD">
						<p class="bbDP">
							<button type="submit" class="btn_ok btn_yes">提交</button>
							<a class="btn_ok btn_no" href="${pageContext.request.contextPath }/BanUrl?op=queryBanner" target="main" >取消</a>
						</p>
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