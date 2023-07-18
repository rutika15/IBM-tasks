package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class addview extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			processRequest(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	PrintWriter out=response.getWriter();
		try {
		Session session;
		session=Myfactory.getHibernateSession();
		response.setContentType("text/html");
		
		List<Admin>l=new ArrayList<>();
		
		
		l=session.createQuery("from Admin",Admin.class).list();
//		out.println(l);
		
		Iterator<Admin>i=l.iterator();
		while(i.hasNext())
		{
			Admin a=i.next();
			out.println(a.getCoursename()+""+a.getCourseprice());
		}
		}
		catch(Exception e)
		{
			e.printStackTrace(out);
		}
		
	}

}
