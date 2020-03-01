<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <%@ include file="IsLogin.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TopicDetails.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="CSS/css.css">
	<script  type="text/javascript" src="JS/topicNull.js"></script>
  </head>
  
  <body style="background:	#87CEFA">
 	  <div>
	<form action="BBSServlet?method=reply&value=${topiclist.tid}" method="post" onSubmit="return isNull()">
	
	<table border="1 solid blue " style="text-align: center;" >
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="4">主贴信息</td></tr>
	<tr><td>帖子标题</td><td>${topiclist.ttitlle}</td></tr>
	<tr><td>帖子内容</td><td>${topiclist.tinfo}</td></tr>
	<tr style="background:blue"><td colspan="4">回帖信息</td></tr>
	
	<c:forEach items="${replys}" var="reply" varStatus="index">
	<tr><td>第${index.count}楼 作者：${reply.bbsUsers.uname}</td><td>${reply.rinfo}</td></tr>
	</c:forEach>
	
	<tr><td>回复帖子</td><td><textarea id="message" name="Postmessage"></textarea></td></tr>
	<tr><td></td><td colspan="2"><input type="submit" value="提交"/><input type="reset" value="重置"/></td></tr>
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="4"><a href="BBSServlet?method=TopicList">返回主贴列表</a></td></tr>
	</table>
	</form>
	</div>
  </body>
</html>
