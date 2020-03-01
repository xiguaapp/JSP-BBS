<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="JS/isNullOrEmpty.js"></script>
	  <style>
        div {
          
          margin:0 auto;width:300px;height:100px
        }
        
html,body{
	width:100%;
	height:100%
}
        body{
        
       
left:0; top:0;
            background: url("Img/微信图片_20200228212029.jpg") no-repeat;
            background-size:cover;
        }
    </style>
  </head>
  
  <body>
  <br/>
    <br/>
      <br/>
      <div>
	<form action="BBSServlet?method=login" method="post"onSubmit="return isNull()" >
	
	<table border="1 solid blue " style="text-align: center;" >
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="2">用户登录</td></tr>
		<tr ><td >用户名：</td><td><input type="text" name="name" id="name"/></td></tr>
			<tr><td>密码：</td><td><input type="password" name="mima" id="pwd"/></td></tr>
			<tr><td></td><td><input type="submit" value="登录" />&nbsp;  <a href="Reg.jsp"><INPUT  name="registerButton" id="Button" type="button" value="注册"></a></td></tr>
	</table>
	</form>
	</div>
  </body>
</html>
