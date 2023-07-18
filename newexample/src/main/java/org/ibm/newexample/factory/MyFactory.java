package org.ibm.newexample.factory;

import org.ibm.newexample.Account;
import org.ibm.newexample.Inventory;
import org.ibm.newexample.Product;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyFactory {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Inventory.class).addAnnotatedClass(Account.class).addAnnotatedClass(Product.class).buildSessionFactory();
		return sessionFactory;
	}

}
