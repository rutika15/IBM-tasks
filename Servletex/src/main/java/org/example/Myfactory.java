package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Myfactory {
	
private static SessionFactory sessionFactory=null;
	
	private static Session session=null;
	
	
	public static Session getHibernateSession()throws Exception
	{
		sessionFactory=new Configuration().configure().addAnnotatedClass(Admin.class).buildSessionFactory();
		
		session=sessionFactory.openSession();
		return session;
	}

}
