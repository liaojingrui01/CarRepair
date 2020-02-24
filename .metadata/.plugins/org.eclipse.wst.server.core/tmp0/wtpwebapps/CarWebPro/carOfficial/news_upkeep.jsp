<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>

	<head>
		<meta name="renderer" content="webkit">
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>恒达汽修有限公司</title>

		<link rel="stylesheet" type="text/css" href="css/meteinfo_ui.css" id="metuimodule" data-module="1" />
		<link rel="stylesheet" type="text/css" href="css/metinfo.css" />
		<script src="js/jQuery1.7.2.js" type="text/javascript"></script>
		<script src="js/metinfo_ui.js" type="text/javascript"></script>
		<script src="js/ch.js" type="text/javascript"></script>
		<!--[if IE]>
<script src="public/js/html5.js" type="text/javascript"></script>
<![endif]-->
	</head>

	<body>
		<div class="m-nav">
			<nav class="inner">
				<ul class="list-none">
					<li id="nav_10001" style='width:123px;' class='navdown'><a href='index.html' title='网站首页' class='nav'><span>网站首页</span></a></li>
					<li id='nav_1' style='width:123px;'><a href='about.html' 0 title='关于我们' class='hover-none nav'><span>关于我们</span></a></li>
					<li id='nav_2' style='width:123px;'><a href='news.html' title='信息中心' class='hover-none nav'><span>信息中心</span></a></li>
					<li id='nav_3' style='width:123px;'><a href='product.html' title='恒达汽修产品' class='hover-none nav'><span>恒达汽修产品</span></a></li>
					<li id='nav_4' style='width:122px;'><a href='cases.html' title='服务车型' class='hover-none nav'><span>服务车型</span></a></li>
					<li id='nav_34' style='width:122px;'><a href='joinUs.html' title='在线招聘' class='hover-none nav'><span>在线招聘</span></a></li>
					<li id='nav_11' style='width:122px;'><a href='booking.html' title='在线预约' class='hover-none nav'><span>在线预约</span></a></li>
					<li id='nav_18' style='width:122px;'><a href='contact.html' title='联系我们' class='hover-none nav'><span>联系我们</span></a></li>
				</ul>
			</nav>
		</div>

		
		<header>
			<div class="inner top">

				<a href="../" title="汽配公司" id="web_logo">
					<img src="img/1363847903.png" style="width: 210px; height: 55px;" alt="汽配公司" title="汽配公司" style="margin:0px 0px 0px 10px;" />
				</a>

				<div class="top-seo">
					<div class="tpseotxt">
						<p>
							&nbsp;020-5856-1762</p>
					</div>
				</div>
			</div>
		</header>

		<div class="inner met_flash">
			<div class="flash">
				<img src='img/1363850250.jpg' width='980' alt='' height='300'></div>
		</div>

		<div class="sidebar inner">

			<div class="sb_nav">

				<h3 class='title'>信息中心</h3>
				<div class="active b-r" id="sidebar" data-csnow="19" data-class3="0" data-jsok="2">
					<dl class="list-none navnow"><dt id='part2_19' class='on'><a href='../new/new_19_1.html'  title='汽车保养' class="zm"><span>汽车保养</span></a></dt></dl>
					<dl class="list-none navnow"><dt id='part2_20'><a href='../new/new_20_1.html'  title='行业新闻' class="zm"><span>行业新闻</span></a></dt></dl>
					<div class="clear"></div>
				</div>

				<h3 class='title line'>联系方式</h3>
				<div class="active editor b-r">
					<div> 电话：020-5856-1762</div>
					<div> 手机：15521389512</div>
					<div> QQ：913405314</div>
					<div> 联系人：谭先生</div>
					<div> 邮箱：hengdaqixiu@163.com</div>
					<div> 邮编：404100</div>
					<div class="clear"></div>
				</div>

			</div>

			<div class='sb_box b-r'>
				<h3 class="title">
			<div class="position">当前位置：<a href="../" title="网站首页">网站首页</a> &gt; <a href=../new/ >信息中心</a> > <a href=../new/new_19_1.html >汽车保养</a></div>
			<span>汽车保养</span>
		</h3>
				<div class="clear"></div>

				<div class="active" id="newslist">
					<ul class='list-none metlist'>
					<c:forEach items="${list}" var="item">
						<li class='list top'><span>${item.releaseTime}</span><a href='new6.html' title='${item.tiltle}' target='_self'>${item.tiltle}</a>
							<p>${item.countent}</p>
						</li>
						</c:forEach >
					</ul>
					<div id="flip">
						<div class='digg4 metpager_8'><span class='disabled disabledfy'><b>«</b></span><span class='disabled disabledfy'>‹</span><span class='current'>1</span><span class='disabled disabledfy'>›</span><span class='disabled disabledfy'><b>»</b></span></div>
					</div>
				</div>

			</div>
			<div class="clear"></div>
		</div>

		<footer class="inner" >
			<div class="foot-nav">
				<a href="about.html" 0 title='关于我们'>关于我们</a><span>
					|</span><a href='feedback.html' title='客户留言'>客户留言</a><span>|
						<span><a href='booking.html' title='在线预约'>在线预约</a><span>|
						</span><a href='joinUs.html' title='人才招聘'>人才招聘</a><span>|
				<a href='contact.html' title='网站地图'>联系我们</a>
			</div>
			<div class="foot-text">
				<p>恒达汽修有限公司版权所有     2017-2018    备案号：渝ICP备13004606
				</p>
				<p>电话：020-5856-1762</p>
			</div>
		</footer>
	</body>

</html>