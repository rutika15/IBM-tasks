package org.ibm.newconcept;
import java.util.Random;
import java.util.UUID;

import org.ibm.newconcept.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App3 {
	public static void main(String args[])
	{
	SessionFactory sessionfactory=new Configuration().configure("hibernate.cgf.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
	Session session=sessionfactory.openSession();
	Department d=new Department(1,"CSE","Shegaon");
	Employee e=new Employee(101,"john",300.0,d);
	session.getTransaction().begin();
		
	session.save(e);
	session.save(d);

session.getTransaction().commit();
System.out.println("done");
	
	}

}
