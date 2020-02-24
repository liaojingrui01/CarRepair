<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员管理-有点</title>
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/css.css" />
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/manhuaDate.1.0.css">
	<script type="text/javascript" src="/CarWebPro/backstage/js/jquery.min.js"></script>
	<script type="text/javascript" src="/CarWebPro/backstage/js/manhuaDate.1.0.js"></script>
	<script type="text/javascript" src="/CarWebPro/backstage/js/jquery-1.7.2.min.js"></script>
	<!-- <script type="text/javascript" src="./js/page.js" ></script> -->
	<script type="text/javascript">
$(function (){
  $("input.mh_date").manhuaDate({
    Event : "click",//可选               
    Left : 0,//弹出时间停靠的左边位置
    Top : -16,//弹出时间停靠的顶部边位置
    fuhao : "-",//日期连接符默认为-
    isTime : false,//是否开启时间值默认为false
    beginY : 1949,//年份的开始默认为1949
    endY :2100//年份的结束默认为2049
  });

  document.getElementById("my_time_id").addEventListener("input", function(){
    alert("sssss");
	});
});
</script>
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="/CarWebPro/backstage/img/coin02.png" /><span><a href="/CarWebPro/backstage/index.jsp" target="index" >首页</a>&nbsp;-&nbsp;<a
					href="/CarWebPro/backstage/index.jsp" target="index">公共管理</a>&nbsp;-</span>&nbsp;车型管理
			</div>
		</div>

		<div class="page">
			<!-- vip页面样式 -->
			<div class="vip">
				<div class="conform">
						<div class="cfD">
							<form method="post" action="${pageContext.request.contextPath }/CarUrl?op=query" enctype="multipart/form-data">
								<a class="addA addA1"  href="/CarWebPro/backstage/vipadd.jsp">新增车型</a>						
							</form>
							
						</div>
				</div>

			
				<!-- vip 表格 显示 -->
				<div class="conShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC" >序号</td>
							<td width="550px" class="tdColor">车型图片</td>
							<td width="588px" class="tdColor">车型名称</td>
							<td width="330px" class="tdColor">操作</td>
						</tr>
						<c:forEach items="${list}" var="item">
						<tr>
							<td>${item.carId}</td>
							<td><div class="onsImg onsImgv">
							<img src="uploadFile/${item.carImg}">
							</div></td>
							<td>${item.carName}</td>
							<td>
								<a href="${pageContext.request.contextPath }/CarUrl?op=findbyid&carId=${item.carId}">
									<img class="operation" src="/CarWebPro/backstage/img/update.png">
								</a>
								 <img class="operation delban" src="/CarWebPro/backstage/img/delete.png" onclick="deleteid('${item.carId}')">
							</td>
						</tr>
						</c:forEach>
					</table>
				</div>
				<!-- vip 表格 显示 end-->
			</div>
			<!-- vip页面样式end -->
		</div>

	</div>


	<!-- 删除弹出框 -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="/CarWebPro/backstage/img/shanchu.png" /></a>
			</div>
			<input type="hidden" id="car_num_id"/>
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a id="carId" onclick="hrefUrl();" class="ok yes">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->
</body>

<script type="text/javascript">
// 广告弹出框 CarUrl?op=delete&carId='+carId
function deleteid(carId){
	$("#car_num_id").val(carId);
	$(".banDel").show();
}


function hrefUrl(){
	var carId = $("#car_num_id").val();
	
	var adoc = document.getElementById('carId');
	
	adoc.href='CarUrl?op=delete&carId='+carId;
	
}


$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
});
// 广告弹出框 end
</script>
</html>