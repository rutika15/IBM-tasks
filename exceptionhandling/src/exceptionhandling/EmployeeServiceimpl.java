package exceptionhandling;
import java.util.*;
public class EmployeeServiceimpl implements EmployeeService{
ArrayList<Employee>a=new ArrayList<>();
	@Override
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		e.setId(2);
		a.add(e);
		return e;
	}

}
