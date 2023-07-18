package org.ibm.newconcept;
import java.util.Random;
import java.util.UUID;

import org.ibm.newconcept.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App2 {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Order.class).addAnnotatedClass(Shipment.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		Shipment shipment = new Shipment();
		shipment.setCity("Banglore");
		shipment.setZipCode("600564");
		shipment.setId(new Random().nextInt(1000));
		Order order = new Order();
		order.setId("odr1");
		order.setOrderName("Laptop");
		order.setShipment(shipment);
		session.getTransaction().begin();

		session.save(shipment);
		session.save(order);
	
	session.getTransaction().commit();
	System.out.println("done");
	
	

}
}
