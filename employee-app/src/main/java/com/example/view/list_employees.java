package com.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class list_employees
 */
public class list_employees extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request,response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>list is</h1>");
		out.println("<ul>");
		out.println("<table>List");
		out.println("<br>");
		out.println("<tr>Harry</tr>");
		out.println("<br>");
		
		out.println("<tr>john</tr>");
		out.println("<br>");
		out.println("<tr>Marry</tr>");
out.println("</table>");
out.println("</ul>");

		
		
	}
}


