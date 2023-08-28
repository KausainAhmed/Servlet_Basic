package com.ahmed.training.servlet.URL_Rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h1><marquee>servlet1 </marquee></h1>");
	out.println("</body>");
	out.println("</html>");
	
	String name=request.getParameter("name");
	out.println("<h1>Your name is "+ name+"</h1>"); 
	out.println("<a href='serv2?user="+name+"'> Go To 2nd Servlet </a>");
}

}
