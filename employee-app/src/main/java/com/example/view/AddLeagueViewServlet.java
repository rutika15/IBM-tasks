package com.example.view;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddLeagueViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processesRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processesRequest(request, response);

	}

	protected void processesRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String str=getServletConfig().getInitParameter("seasons");
		String[] seasons=str.split(",");
		out.println("<html><head><title>Add Leage</title></head><body>");
		out.println("<p><h2>Add A New League</h2></p><hr/>");
		
		out.println("<center><table><tr><td>Year</td><td><input type='text' name='year'></td></tr>");
		
		out.println("<tr><td>Season</td><td><select name='season'><option value='Unknown'>Select</option>");
		
		for(String s:seasons)
		{
			out.println("<option value='"+s+"'>"+s+"</option>");
		}
		out.println("</select></td></tr>");
		out.println("<tr><td>Title</td><td><input type='text' name='title'></td></tr>");
		out.println("<tr><td><input type='submit' value='Add New League'></table></body></html>");

	}

}
