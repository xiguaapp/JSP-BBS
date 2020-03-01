<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ include file="IsLogin.jsp" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TopicList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="CSS/css.css">
  </head>
  
  <body style="background:	#87CEFA">
 	  <div>
	<form action="Topic.jsp" method="post" >
	
	<table border="1 solid blue " style="text-align: center;" >
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="4">主题列表</td></tr>
		<tr style="background:#87CEFF"><td >标题</td><td>内容</td><td>发帖时间</td><td>用户</td></tr>
			<c:forEach items="${list}" var="topic">
			<tr ><td ><a href="BBSServlet?method=TopicDetails&value=${topic.tid}">${topic.ttitlle}</a></td><td>${topic.tinfo} </td><td>${topic.ttime} </td><td>${topic.bbsUsers.uname} </td></tr>
			</c:forEach>
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="4"><input type="submit" value="发帖"/></td></tr>
	</table>
	</form>
	</div>
  </body>
</html>
