package org.ibm.newexample;
import java.util.List;

import org.ibm.newexample.Account;
import org.ibm.newexample.factory.*;
import org.ibm.newexample.service.*;

public class App1 {
	public static void main(String args[])
	{
	
	try {

		AccountService service = new AccountServiceImpl();
		
		 Account i=service.openAccount(new Account(3,"john",100));
		 
		 System.out.println(i);
		
//		 List<Product> i=service.getAllPdroduct(); 
//		 for(Product ii:i) 
//		 {
//			 
//		 System.out.println(ii);
//		 }
		
		
		 
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	

}
