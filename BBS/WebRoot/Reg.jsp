<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Reg.jsp' starting page</title>
    <script type="text/javascript" src="JS/RegIsNullOrEmpty.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
 div {
          
          margin:0 auto;width:300px;height:100px
        }
</style>
 	<script  type="text/javascript" src="JS/RegIsNullOrEmpty.js"></script>
  </head>
  
  <body style="background:	#87CEFA">
 	  <div>
	<form action="BBSServlet?method=reg" method="post" onSubmit="return isNull()">
	
	<table border="1 solid blue " style="text-align: center;" >
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="2">用户注册</td></tr>
		<tr ><td >用户名：</td><td><input type="text" name="name" id="name"/></td></tr>
			<tr><td>密码：</td><td><input type="text" name="pwd" id="pwd"/></td></tr>
			<tr><td>确认密码：</td><td><input type="text" name="rpwd" id="rpwd"/></td></tr>
			<tr><td>性别：</td><td><input type="radio" value="男" name="sex"/>男<input type="radio" value="女" name="sex"/>女</td></tr>
			<tr><td>电子邮箱：</td><td><input type="text" name="email" id="email"/></td></tr>
			<tr><td></td><td><input type="submit" value="提交"/>&nbsp;<input type="reset" value="重置"/></td></tr>
	</table>
	</form>
	</div>
  </body>
</html>
