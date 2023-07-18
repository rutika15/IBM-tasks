package exceptionhandling;

import java.io.IOException;

public class App {
	public static void main(String args[])
	{
		EmployeeFactory factory = new EmployeeFactory();
		try {
			factory.createEmployee();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("error occured...!"+e.getMessage());
		} catch (SalaryCheckException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getEmsg());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
