package org.ibm.newexample.service;

import java.util.List;

import org.ibm.newexample.Account;

import java.util.Optional;

import javax.persistence.TypedQuery;

import org.ibm.newexample.factory.MyFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AccountServiceImpl implements AccountService {

	
	private SessionFactory sessionFactory;

	private Session session = null;
	{
		sessionFactory = MyFactory.getSessionFactory();

	}
	Account a=new Account();
	@Override
	public Account openAccount(Account ownerName) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(ownerName);
		session.getTransaction().commit();
		return ownerName;
		
	}

	@Override
	public List<Account> listAccounts() {
		// TODO Auto-generated method stub
		
		session = sessionFactory.openSession();
		TypedQuery<Account> query = session.createQuery("FROM Inventory I", Account.class);
		List<Account> list = query.getResultList();
		return list;
		
	}

	@Override
	public Account getBalance(int accountNumber) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		Account i= session.find(Account.class, accountNumber);
		return i;
	}

	@Override
	public int deposite(int accountNumber, int amount) {
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Account i=session.get(Account.class, accountNumber);
		session.getTransaction().commit();
		if(i==null)
		{
			System.out.println("no such id found to update..");
			
		}
		else
		{
		
		
			
			int b=a.getBalance();
			b=b+amount;
			amount=b;
			
			
			
		}
		return amount;
		
	
		
	}

//	@Override
//	public int withdraw(int accountNumber, int amount) {
//		// TODO Auto-generated method stub
//		
//		
//		
//	}

	@Override
	public void closeAccount(int accountNumber) {
		session = sessionFactory.openSession();
		session.getTransaction().begin();
		Account i=session.get(Account.class, accountNumber);
		session.getTransaction().commit();
		if(i==null)
		{
			System.out.println("no such id found to update..");
			
		}
		else
		{
			
			session.getTransaction().begin();
			session.remove(i);
			session.getTransaction().commit();
			System.out.println("done...");
		}
		
	}

}
