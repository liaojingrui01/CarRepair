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
				<img src="/CarWebPro/backstage/img/coin02.png" /><span><a href="/CarWebPro/backstage/index.jsp" target="index" >首页</a>&nbsp;-&nbsp;<a
					href="/CarWebPro/backstage/index.jsp" target="index">公共管理</a>&nbsp;-</span>&nbsp;新闻管理
			</div>
		</div>

		<div class="page">
			<!-- vip页面样式 -->
			<div class="vip">
				<div class="conform" >
						<div class="cfD" style="margin-left: 1%">
							<form method="post" action="${pageContext.request.contextPath }/CarUrl?op=query" enctype="multipart/form-data">
								<a class="addA addA1"   style="margin-left: 0.1%" href="/CarWebPro/backstage/newsadd.jsp">新增新闻</a>						
							</form>
							
						</div>
				</div>

				<!-- banner 表格 显示 -->
				<form action="BanUrl?op=banAdd" method="post" style=margin-left:1%> 
				<div class="canShow">
					<table border="1" cellspacing="0" cellpadding="0">
						<tr>
							<td width="66px" class="tdColor tdC">序号</td>
							<td width="315px" class="tdColor">新闻标题</td>
							<td width="600px" class="tdColor">新闻内容</td>
							<td width="125px" class="tdColor">发布时间</td>
							<td width="125px" class="tdColor">发布ID</td>
							<td width="125px" class="tdColor">操作</td>
						</tr>
					<c:forEach items="${list}" var="item">
							<tr>
								<td>${item.newsId }</td>
							    <td>${item.tiltle}</td>
							    <td>${item.countent}</td>
							    <td>${item.releaseTime}</td>
							    <td>${item.staffId}</td>
								<td>
								<a href="NewsUrl?op=queryById&newsId=${item.newsId}">
								 <img class="operation" src="/CarWebPro/backstage/img/update.png">
							    </a> 
							     <img href="NewsUrl?op=deleteNews&newsId=${item.newsId}" class="operation delban"src="/CarWebPro/backstage/img/delete.png" onclick="javascript:return deleteOne();"></td>
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
	<!-- <div class="banDel">
		<div class="delete">
			<div class="close">
				<a><img src="/CarWebPro/backstage/img/shanchu.png" /></a>
			</div>
			<input type="text" id="banid" />
			<p class="delP1">你确定要删除此条记录吗？</p>
			<p class="delP2">
				<a  class="ok yes" id="ban_id" onclick="del()">确定</a><a class="ok no">取消</a>
			</p>
		</div>
	</div> -->
	<!-- 删除弹出框  end-->
</body>

<!-- <script type="text/javascript">

function deleteban(banid){
	//alert(banid);
	$("#banid").val(banid);
	$(".banDel").show();
}
function del(){
	var banid = $("#banid").val();
	
	var adoc = document.getElementById('ban_id');
	
	adoc.href='NewsUrl?op=deleteNews='+banid;
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
});
// 广告弹出框 end

function del(){
    var banid=$("#banid").val();
	var adoc = document.getElementById('ban_id');
	//alert('===>'+banid);弹出窗口
	//给属性 赋值  
	adoc.href='BanUrl?op=deleteBan&bannerId='+banid;
  
}
</script> -->
<script type="text/javascript">
	/* 删除数据 */
	function deleteOne(){
		var msg="你真的要 删除数据吗？\n请确认!!";
		//判断点击操作
		if(confirm(msg)==true){
			return true;
		}else{
			return false;
		}
		
	}
</script>
</html>