package org.example.Employee;

public class Department {
	public int did;

	public Department(int did) {
		super();
		this.did = did;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + "]";
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}
	
	
	

}
