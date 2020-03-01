<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<% if(session.getAttribute("name")==null || session.getAttribute("name").toString().equals("")){
	
	out.print("<script>");
			out.print("alert('您还没登录！');");
			out.print("location.href='Login.jsp';");
			
			out.print("</script>");
			return;
}
%>


