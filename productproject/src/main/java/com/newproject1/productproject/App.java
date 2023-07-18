package com.newproject1.productproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	DriverManager.registerDriver(new Driver());
    	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
    	 Statement statement=connection.createStatement();
    	 ResultSet rs=statement.executeQuery("select * from emp");
    	
    	 while(rs.next())
    	 {
    	 try
    	 {
    	 System.out.println(rs.getInt("id")+","+rs.getString("name"));
    	 }
    	 catch(Exception e)
    	 {
    	 e.printStackTrace();
    	 }
    }
    }
}
