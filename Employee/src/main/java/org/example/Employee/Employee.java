package org.example.Employee;


public class Employee {
	
	
	public Employee(String name, int eid, Department dept) {
		super();
		this.name = name;
		this.eid = eid;
		this.dept = dept;
	}
	public String name;
	public int eid;
	public Department dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", dept=" + dept + "]";
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	
	

}
