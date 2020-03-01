package com.xiguaapp.Srevlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.prefs.BackingStoreException;

import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiguaapp.Srevice.BBSReplysSrevice;
import com.xiguaapp.Srevice.BBSTopicsService;
import com.xiguaapp.Srevice.BBSUserService;
import com.xiguaapp.Srevice.Impl.BBSReplysSreviceImpl;
import com.xiguaapp.Srevice.Impl.BBSTopicsServiceImpl;
import com.xiguaapp.Srevice.Impl.BBSUserServiceImpl;
import com.xiguaapp.javaBean.BBSReplys;
import com.xiguaapp.javaBean.BBSTopics;
import com.xiguaapp.javaBean.BBSUsers;

public class BBSServlet extends HttpServlet {

	/**
		 * Constructor of the object.
		 */
	public BBSServlet() {
		super();
	}

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		doPost(request, response);
		out.flush();
		out.close();
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String method=request.getParameter("method");
		if("login".equals(method)) {
			BBSUserService bs=new BBSUserServiceImpl();
			String name=request.getParameter("name");
			System.out.println(name);
			String pwd=request.getParameter("mima");
			System.out.println(pwd);
			List<BBSUsers> list=bs.hasOne(new BBSUsers(name,pwd));
			request.getSession().setAttribute("ruid", list.get(0).getUid());
			if(list.size()>0) {
				request.getSession().setAttribute("name", name);
				request.getSession().setAttribute("id", list.get(0).getUid());
				out.print("<script>");
				out.print("alert('登录成功');");
				out.print("location.href='BBSServlet?method=TopicList';");
				out.print("</script>");
			}
			
		}
		if("reg".equals(method)) {
			BBSUserService bService=new BBSUserServiceImpl();
			String  nameString=request.getParameter("name");
			String pwdString=request.getParameter("pwd");
			Boolean sexBoolean=request.getParameter("sex")=="男"?true:false;
			String emailString=request.getParameter("email");
			int num=bService.reg(new BBSUsers(emailString,nameString,pwdString,sexBoolean));
			if(num>0) {
				out.print("<script>");
				out.print("alert('注册成功');");
				out.print("location.href='Login.jsp';");
				out.print("</script>");
			}else {
				out.print("<script>");
				out.print("alert('注册失败');");
				out.print("location.href='Login.jsp';");
				out.print("</script>");
			}
		}
		if("TopicList".equals(method)) {
			BBSTopicsService bTopicsService=new BBSTopicsServiceImpl();
			List<BBSTopics> list=bTopicsService.getAll();
			System.out.println(list.size());
			request.setAttribute("list",list);
			request.getRequestDispatcher("TopicList.jsp").forward(request, response);
		}
		if("Posted".equals(method)) {
			String tittleString=request.getParameter("tittle");
			String tinfoString=request.getParameter("tinfo");
			int tuid= Integer.valueOf(request.getSession().getAttribute("id").toString());
			BBSTopicsService bService=new BBSTopicsServiceImpl();
			int num= bService.addTopic(new BBSTopics(tuid,tittleString,tinfoString));
			if(num>0) {
				out.print("<script>");
				out.print("alert('发帖成功');");
				out.print("location.href='BBSServlet?method=TopicList';");
				out.print("</script>");
			}else {
				out.print("<script>");
				out.print("alert('发帖失败');");
				out.print("location.href='BBSServlet?method=TopicList';");
				out.print("</script>");
			}
		
		}
		if("TopicDetails".equals(method)) {
			int tid=Integer.valueOf(request.getParameter("value"));
			BBSTopicsService bService=new BBSTopicsServiceImpl();
			List<BBSTopics> list=bService.getOne(tid);
			System.out.println(list.size());
			request.setAttribute("topiclist",list.get(0));
			BBSReplysSrevice replysSrevice=new BBSReplysSreviceImpl();
			List<BBSReplys> listbbsTopics=replysSrevice.getReplys(tid);
			System.out.println(listbbsTopics.size());
			request.setAttribute("replys", listbbsTopics);
			request.getRequestDispatcher("TopicDetails.jsp").forward(request, response);
		}
		if("reply".equals(method)) {
			int rtid=Integer.valueOf(request.getParameter("value"));
			int ruid=Integer.valueOf(request.getSession().getAttribute("ruid").toString());
			String rinfo=request.getParameter("Postmessage");
			BBSReplysSrevice bSrevice=new BBSReplysSreviceImpl();
			int num=bSrevice.replys(new BBSReplys(rtid,ruid,rinfo));
			if(num>0) {
				out.print("<script>");
				out.print("alert('回复成功');");
				out.print("location.href='BBSServlet?method=TopicDetails&value='+"+rtid+";");
				out.print("</script>");
			}else {
				out.print("<script>");
				out.print("alert('回复失败');");
				out.print("location.href='BBSServlet?method=TopicDetails&value='+"+rtid+";");
				out.print("</script>");
			}
			
		}
		out.flush();
		out.close();
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
