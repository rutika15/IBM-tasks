package org.ibm.newconcept;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="emptable")

@Entity

public class Employee {
	
	@Id
	@Column(name="empid")
	public int empid;
	@Column(name="empname")
	public String empname;
	@Column(name="empsal")
	public double empsal;
	@Column(name="department")
	public Department department;
	
	
	
	
	

}
//public class Employee {
//
//	 
//
//    private int id;
//
//    private String name;
//
//    private double salary;
//
//    private Department department;
//
//}
//public class Department {
//
//	 
//
//    private int id;
//
//    private String deoartmentName;
//
//    private String location;
//
//}