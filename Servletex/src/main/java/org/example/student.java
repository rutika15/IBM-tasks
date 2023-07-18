package org.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;

/**
 * Servlet implementation class student
 */
public class student extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		Session session;
		try {
			session=Myfactory.getHibernateSession();
			String name=request.getParameter("t1");
			String coursename=request.getParameter("t2");
			
			out.println("hello");
			
			List<Admin>l=new ArrayList<>();
			
			
			l=session.createQuery("from Admin",Admin.class).list();
//			out.println(l);
			
			Iterator<Admin>i=l.iterator();
			while(i.hasNext())
			{
				Admin a=i.next();
				out.println(a.getCoursename()+""+a.getCourseprice());
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println("cannot add");
		}
		
		
	}

	

}
