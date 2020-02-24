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
					href="/CarWebPro/backstage/index.jsp" target="index">轮播图管理</a>&nbsp;-</span>&nbsp;新闻修改
			</div>
		</div>
		<div class="page " >
			<!-- 上传广告页面样式 -->
			<div class="banneradd bor">
				<div class="baTop">
					<span>修改图片</span>
				</div>
				<form action="${pageContext.request.contextPath }/NewsUrl?op=updateNews" method="post"  >
					<div class="bbD">
						新闻标题(varchar)：<input type="text" class="input3" name="tiltle" value="${newsEnt.tiltle}"/>
						<input type="hidden" class="input3" name="newsId" value="${newsEnt.newsId}"/>
					</div>
					<div class="bbD">
						新闻内容(varchar)：<input type="text" class="input3" name="countent" value="${newsEnt.countent}"/>
					</div>
					<div class="bbD">
						发布时间(datetime)：<input type="text" class="input3" name="releaseTime"value="${newsEnt.releaseTime}" />
					</div>
					<div class="bbD">
						发布ID (varchar)：<input type="text" class="input3" name="staffId" value="${newsEnt.staffId}"/>
					</div>
					<div class="bbD">
						<p class="bbDP">
							<button class="btn_ok btn_yes" type="submit">提交</button>
							<a class="btn_ok btn_no" href="${pageContext.request.contextPath }/NewsUrl?op=queryNewsInfo" target="main">取消</a>

						</p>
					</div>
				</form>
			</div>
			
			<hr/>
			

			<!-- 上传广告页面样式end -->
		</div>
	</div>
</body>
</html>