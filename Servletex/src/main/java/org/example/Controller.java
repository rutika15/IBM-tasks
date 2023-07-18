package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class Controller extends HttpServlet {

       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session;

		
		PrintWriter out=response.getWriter();
		
	    try {
			session= Myfactory.getHibernateSession();
			String s=request.getParameter("t1");
			int s1=Integer.parseInt(request.getParameter("t2"));
//			response.setContentType("text/html");
			
			Admin a=new Admin();
			a.setCoursename(s);
			a.setCourseprice(s1);
		
			session.beginTransaction();
			session.save(a);
			session.getTransaction().commit();
			
			out.print("added");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
	e.printStackTrace(out);
//			e.getStackTrace();
		}
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
