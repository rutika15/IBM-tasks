package org.ibm.newexample;

import java.util.List;

import org.ibm.newexample.Inventory;
import org.ibm.newexample.factory.*;
import org.ibm.newexample.service.InventoryService;
import org.ibm.newexample.service.InventoryServiceImpl;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.mysql.cj.xdevapi.SessionFactory;

/**
 * Hello world!
 * 483894143732
 * Gqre7w
 */
public class App 
{
    public static void main( String[] args )
    {
      try {
    	  
//    	  SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").
//    			  addAnnotatedClass(Inventory.class).buildSessionFactory();
//    	  Session session=sessionFactory.openSession();
//    	  session.getTransaction().begin();
//    	  session.save(new Inventory(101, 11, "Pencil", 90));
//    	  session.getTransaction().commit();
//    	  System.out.println("One Item Saved...");
    	  
    	  
    	 
    		  InventoryService service = new InventoryServiceImpl();
    		  Inventory i=new Inventory();
//    		  org.hibernate.SessionFactory sessionFactory=MyFactory.getSessionFactory();
//    		  Session session=sessionFactory.openSession(); 
    		  
    		  String productName="pen";
    		  
  			List<Inventory> list = service.getInventoryByProductName(productName);
//  			Query c=session.createQuery("select count(*) from inventory i JOIN product p ON i.inventory_id=p.pid WHERE i.product_name=:productName");
//				
  			
  			
				int d=i.getProductId();
				System.out.print(d);
			
			
  			if (!list.isEmpty()) {
  				
  				org.hibernate.SessionFactory sessionFactory=MyFactory.getSessionFactory();
  				Session session=sessionFactory.openSession();
  				session.getTransaction().begin();
  				
  				session.save(new Product(d, productName, 10));
  				session.getTransaction().commit();
  			}
  			else
  			{
  				System.out.println("no product found in inventory try again after some time...");
  			}
//    	  List<Inventory> i=service.getAllInventory();
//    	  for(Inventory ii:i)
//    	  {
//    		  System.out.println(ii);
//    	  }
    	  			 
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
    	  
    }
      
}
    
