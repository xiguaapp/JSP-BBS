<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <%@ include file="IsLogin.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Topic.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="CSS/css.css">
	<script  type="text/javascript" src="JS/Posted.js"></script>

  </head>
  
  <body>
   <div>
   <form action="BBSServlet?method=Posted" method="post"  onSubmit="return isNull()">
   <table border="1 solid blue " style="text-align: center;" >
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="4">发帖</td></tr>
		<tr ><td >标题：</td><td><input id="tittle" type="text" name="tittle"/></td></tr>
		<tr ><td >内容：</td><td><textarea  id="tinfo" name="tinfo"></textarea></td></tr>	
		<tr><td></td><td colspan="2"><input type="submit" value="提交"/><input type="reset" value="重置"/></td></tr>
	<tr style="background:#87CEFF" ><td style="text-align:center; " colspan="4"><a href="BBSServlet?method=TopicList">返回主贴列表</a></td></tr>
	
	</table>
   
   </form>
   
   </div>
  </body>
</html>
