package org.mapping.hibernatemapping;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.jaxb.mapping.spi.NamedQuery;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;


public class Operations extends Employee {
	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).
			addAnnotatedClass(Company.class).buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	public List<Employee> findempbyname(String name)
	{
		session = sessionFactory.openSession();
		TypedQuery<Employee> query=session.createQuery("FROM Employee I where I.firstName=:name",Employee.class);
		query.setParameter("name", firstName);
		return query.getResultList();
	}

}
