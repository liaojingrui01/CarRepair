<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>首页左侧导航</title>
		<link rel="stylesheet" type="text/css" href="../css/public.css" />
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		<script type="text/javascript" src="../js/public.js"></script>

		<head></head>

		<body id="bg">
			<!-- 左边节点 -->
			<div class="container">

				<div class="leftsidebar_box">
					<a href="../main.jsp" target="main">
						<div class="line">
							<img src="../img/coin01.png" />&nbsp;&nbsp;首页
						</div>
					</a>
					<!-- <dl class="system_log">
			<dt><img class="icon1" src="../img/coin01.png" /><img class="icon2"src="../img/coin02.png" />
				首页<img class="icon3" src="../img/coin19.png" /><img class="icon4" src="../img/coin20.png" /></dt>
		</dl> -->
					<dl class="system_log">
						<dt>
					<img class="icon1" src="../img/coin03.png" /><img class="icon2"
						src="../img/coin04.png" /> 轮播图管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
						<dd>
							<img class="coin11" src="../img/coin111.png" /><img class="coin22" src="../img/coin222.png" />
							<a class="cks" href="${pageContext.request.contextPath }/BanUrl?op=queryBanner" target="main" >图片列表</a><img class="icon5" src="../img/coin21.png" />
						</dd>
					</dl>

					<dl class="system_log">
						<dt>
					<img class="icon1" src="../img/coin07.png" /><img class="icon2"
						src="../img/coin08.png" />汽车类型管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
						</dt>
						<dd>
							<img class="coin11" src="../img/coin111.png" />
							<img class="coin22" src="../img/coin222.png" />
							<a href="${pageContext.request.contextPath }/CarUrl?op=findall&name" target="main"  class="cks">汽车列表</a>
							<img class="icon5" src="../img/coin21.png" />
						</dd>
					</dl>
					
					<dl class="system_log">
						<dt>
					<img class="icon1" src="../img/coin05.png" /><img class="icon2"
						src="../img/coin06.png" />库存配件管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
						<dd>
							<img class="coin11" src="../img/coin111.png" /><img class="coin22" src="../img/coin222.png" />
							<a class="cks" href="${pageContext.request.contextPath }/StoUrl?op=queryList" target="main" >库存物品</a><img class="icon5" src="../img/coin21.png" />
						</dd>
					</dl>


					</dl>
					<dl class="system_log">
						<dt>
					<img class="icon1" src="../img/coin11.png" /><img class="icon2"
						src="../img/coin12.png" />预约管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				</dt>
						<dd>
							<img class="coin11" src="../img/coin111.png" /><img class="coin22" src="../img/coin222.png" />
							<a href="${pageContext.request.contextPath }/AppUrl?op=queryCusInfo" target="main" class="cks">预约列表</a><img class="icon5" src="../img/coin21.png" />
						</dd>
					</dl>
					
					
					<dl class="system_log">
						<dt>
					<img class="icon1" src="../img/coin07.png" /><img class="icon2"
						src="../img/coin08.png" />新闻管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
						</dt>
						<dd>
							<img class="coin11" src="../img/coin111.png" />
							<img class="coin22" src="../img/coin222.png" />
							<a href="${pageContext.request.contextPath }/NewsUrl?op=queryNewsInfo" target="main"  class="cks">新闻列表</a>
							<img class="icon5" src="../img/coin21.png" />
						</dd>
					</dl>
					

					<dl class="system_log">
						<dt>
					<img class="icon1" src="../img/coinL1.png" /><img class="icon2"
						src="../img/coinL2.png" /> 系统管理<img class="icon3"
						src="../img/coin19.png" /><img class="icon4"
						src="../img/coin20.png" />
				       </dt>
						<dd>
							<img class="coin11" src="../img/coin111.png" /><img class="coin22" src="../img/coin222.png" />
							<a href="${pageContext.request.contextPath}/admUrl?op=exit" onclick="exit();" class="cks" target="login">退出</a><img class="icon5" src="../img/coin21.png" />
						</dd>
					</dl>

				</div>

			</div>
				<script type="text/javascript">
	function exit(){
		alert("确定退出？！");
	}

	</script>
		</body>

</html>