<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>轮播图</title>
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/css.css" />
<script type="text/javascript" src="/CarWebPro/backstage/js/jquery.min.js"></script>
<!-- <script type="text/javascript" src="./js/page.js" ></script> -->
</head>

<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="/CarWebPro/backstage/img/coin02.png" /><span><a href="/CarWebPro/backstage/index.jsp" target="index">首页</a>&nbsp;-&nbsp;<a
					href="/CarWebPro/backstage/index.jsp" target="index">轮播图管理</a>&nbsp;-</span>&nbsp;图片管理
			</div>
		</div>
		<div class="page">
			<!-- banner页面样式 -->
			<div class="banner">
				<div class="add">
					<a class="addA" href="/CarWebPro/backstage/banneradd.jsp">上传图片&nbsp;&nbsp;+</a>
				</div>
				<!-- banner 表格 显示 -->
				<form action="BanUrl?op=banAdd" method="post" style=margin-left:19%> 
				<div class="banShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="315px" class="tdColor">图片</td>
							<td width="308px" class="tdColor">名称</td>
							<td width="125px" class="tdColor">操作</td>
						</tr>
						<c:forEach items="${list}" var="item">
						<tr>
							<td>${item.bannerId }</td>
							<td><div class="bsImg">
									<img src="uploadFile/${item.bannerImg}">
								</div></td>
							<td>${item.bannerName}</td>
							<td>
							<a href="BanUrl?op=queryById&bannerId=${item.bannerId}">
								<img class="operation" src="/CarWebPro/backstage/img/update.png">
							</a> 
							<img class="operation delban"src="/CarWebPro/backstage/img/delete.png" onclick="deleteban(${item.bannerId})"></td>
						</tr>
						</c:forEach>
					</table>
				
				</div>
				</form>
				<!-- banner 表格 显示 end-->
			</div>
			<!-- banner页面样式end -->
		</div>

	</div>


	<!-- 删除弹出框 -->
	<div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="/CarWebPro/backstage/img/shanchu.png" /></a>
			</div>
			<input type="hidden" id="banid" />
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a href="javascript:;" class="ok yes" id="ban_id" onclick="del()">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div>
	<!-- 删除弹出框  end-->
</body>

<script type="text/javascript">

function deleteban(banid){
	//alert(banid);
	$("#banid").val(banid);
	$(".banDel").show();
}
// 广告弹出框
$(".delban").click(function(){
  $(".banDel").show();
});
$(".close").click(function(){
  $(".banDel").hide();
});
$(".no").click(function(){
  $(".banDel").hide();
});s
// 广告弹出框 end

function del(){
    var banid=$("#banid").val();
	var adoc = document.getElementById('ban_id');
	//alert('===>'+banid);弹出窗口
	//给属性 赋值  
	adoc.href='BanUrl?op=deleteBan&bannerId='+banid;
  
}
</script>
</html>