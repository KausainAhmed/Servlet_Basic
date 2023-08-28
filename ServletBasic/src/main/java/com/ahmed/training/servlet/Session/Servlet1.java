package com.ahmed.training.servlet.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servl1")
public class Servlet1 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
PrintWriter out = resp.getWriter();
HttpSession s = req.getSession();  //true for new and default false for not creating new session
out.println("<html>");
out.println("<body>");

String name=req.getParameter("name");

out.println("<h1>Your name is "+ name+"</h1>"); 
//out.println("<a href='serv2?user="+name+"'> Go To 2nd Servlet </a>");
//hidden form field coding

out.println(""
		+"<form action='servl2' >"
		+"<input type='hidden' name='name' value='"+name+"' /> "
		+"<button>Go to 2nd servlet</button>"
		+""
		+""
		+"</form>");

out.println("</body>");
out.println("</html>");
}
}
