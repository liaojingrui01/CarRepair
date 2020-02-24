<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>配件修改</title>
<link rel="stylesheet" type="text/css" href="/CarWebPro/backstage/css/css.css" />
<script type="text/javascript" src="./js/jquery.min.js"></script>
</head>
<body>
	<div id="pageAll">
		<div class="pageTop">
			<div class="page">
				<img src="/CarWebPro/backstage/img/coin02.png" /><span><a href="/CarWebPro/backstage/index.jsp" target="index">首页</a>&nbsp;-&nbsp;<a
					href="/CarWebPro/backstage/index.jsp" target="index">配件管理</a>&nbsp;-</span>&nbsp;配件修改
			</div>
		</div>
		<div class="page ">
			<!-- 上传广告页面样式 -->
			<div class="banneradd bor">
				<div class="baTopNo">
					<span>重新编辑</span>
				</div>
				<div class="baBody">
				    <form action="${pageContext.request.contextPath }/StoUrl?op=updateBan" method="post" enctype="multipart/form-data">
				    <div class="bbD">
						序号：<input type="text" class="input3" name="partsId" value="${stoEnt.partsId}"/>
					</div>
					<div class="bbD">
						配件名(varchar)：<input type="text" class="input3" name="partsName" value="${stoEnt.partsName}"/>
					</div>
					<div class="bbD">
						商标(varchar)：<input type="text" class="input3" name="brand" value="${stoEnt.brand}"/>
					</div>
					<div class="bbD">
						进价(double)：<input type="text" class="input3" name="enterprise" value="${stoEnt.enterprise}"/>
					</div>
					<div class="bbD">
						上传图片(varchar)：<input type="file"  name="imge" value="${stoEnt.imge}"/>
					</div>
					<div class="bbD">
						汽车类型 (varchar) ：<input type="text" class="input3" name="carType" value="${stoEnt.carType}"/>
					</div>
					<div class="bbD">
						型号(varchar)：<input type="text" class="input3" name="typeNum" value="${stoEnt.typeNum}"/>
					</div>
					<div class="bbD">
						价格(double) ：<input type="text" class="input3" name="price" value="${stoEnt.price}"/>
					</div>
					<div class="bbD">
						作用 (varchar) ：<input type="text" class="input3" name="effect" value="${stoEnt.effect}"/>
					</div>
					<div class="bbD">
						参数 (int)：<input type="text" class="input3" name="num" value="${stoEnt.num}"/>
					</div>
					
					<div class="bbD">
						<p class="bbDP">
							<button class="btn_ok btn_yes" type="submit">提交</button>
							<a class="btn_ok btn_no" href="${pageContext.request.contextPath }/StoUrl?op=queryList" target="main">取消</a>

						</p>
					</div>
					</form>
				</div>
			</div>

			<!-- 上传广告页面样式end -->
		</div>
	</div>
</body>
</html>