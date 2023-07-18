package org.ibm.newexample.service;
import org.ibm.newexample.*;
import java.util.*;
public interface AccountService {
	
	public Account openAccount(Account account);
	public List<Account> listAccounts();
	public Account getBalance(int accountNumber);
	public int deposite(int accountNumber,int amount);
//	public int withdraw(int accountNumber,int amount);
	public void closeAccount(int accountNumber);

}
