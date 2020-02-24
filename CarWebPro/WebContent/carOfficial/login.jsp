<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>最强汽修人员登录页面</title>
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/public.css" />
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/page.css" />
<script type="text/javascript" src="/CarWebPro/backstage/js/jquery.min.js"></script>
<script type="text/javascript" src="/CarWebPro/backstage/js/public.js"></script>
</head>
<body>

	<!-- 登录页面头部 -->
	<div class="logHead">
		<img src="/CarWebPro/backstage/img/logLOGO.png" />
	</div>
	<!-- 登录页面头部结束 -->

	<!-- 登录body -->

	<div class="logDiv">
		<img class="logBanner" src="/CarWebPro/backstage/img/logBanner.png" />
		<div class="logGet">
			<!-- 头部提示信息 -->
			<div class="logD logDtip">
				<p class="p1">welcome</p>
				<p class="p2">你的专属汽修公司</p>
			</div>
			<!-- 输入框 -->
			<form action="${pageContext.request.contextPath }/indexUrl?op=queryBunner" method="post">
				<div class="lgD">
					<img class="img1" src="/CarWebPro/backstage/img/logName.png" />
					
				</div>
				<div class="lgD">
					<img class="img1" src="/CarWebPro/backstage/img/logPwd.png" />
					
				</div>
				<div class="logC">
					<button type="submit">欢迎</button>
					<a class="btn_ok btn_no" href="${pageContext.request.contextPath }/indexUrl?op=queryBunner" target="index">取消</a>
				</div>
			</form>
		</div>
	</div>

	<!-- 登录body  end -->

	<!-- 登录页面底部 -->
	<div class="logFoot">
		<p class="p1">版权所有：最强汽修有限公司</p>
		<p class="p2">最强汽修科技有限公司 登记序号：渝ICP备11003578号-2</p>
	</div>
	<!-- 登录页面底部end -->
</body>
</html>