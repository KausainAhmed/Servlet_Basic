package com.ahmed.training.servlet.Hidden_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servl2")
public class Servlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1><marquee>servlet2 </marquee></h1>");
		//out.println("<h2 style='color:blue;'>Hello</h1>");
		String name=request.getParameter("name");
		out.println("<h1>Welcome "+name+" to Servlet2</h1>");
		out.println("</body>");
		out.println("</html>");
		

	}
		
		}

