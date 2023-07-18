package exceptionhandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EmployeeFactory {
	
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	EmployeeService es=new EmployeeServiceimpl();
	Employee e=new Employee();
	public void createEmployee()throws IOException,NumberFormatException, SalaryCheckException 
	{
		System.out.print("Enter Employee Name: ");
		String eName = br.readLine();
		System.out.print("Enter Employee Salary: ");
		int eSalary = Integer.parseInt(br.readLine());

		if (eSalary < 1000) {
			throw new SalaryCheckException("invalid salary...");
		}

		e.setName(eName);
		e.setSal(eSalary);
		Employee e1 = es.createEmployee(e);
		System.out.println("Employee Created: " + e1);

	}
	

}
