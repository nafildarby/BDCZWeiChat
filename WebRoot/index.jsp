<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>北斗晨昭停车自助缴费系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
	
	<style>
		#bg{
			width:1200px;
			height:2001px;
			background:url('image/bg.jpeg') no-repeat;
		}
	</style>
  </head>
  
  <body>
     <div id="bg">
     	<div class="form-group">
			<div class="col-sm-10" style="position:absolute; left:400px; top:900px;">
				<input type="text" class="form-control" id="CarNo" style="width:500px;height:100px;"
					   placeholder="请输入车牌"></input>
			</div>
			
			<button type="button" class="btn btn-primary btn-lg btn-block"
			style="position:absolute; top:1100px;">绑定车牌</button>
		</div>
		
     </div>
  </body>
</html>
