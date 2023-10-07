package org.example.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Department d=new Department(13);
        Employee e=new Employee("rutika",12,d);
       
       
        System.out.println(e.toString());
        
        
    }
}
