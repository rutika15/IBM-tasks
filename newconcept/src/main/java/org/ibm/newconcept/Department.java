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
@Table(name="depttable")

@Entity
public class Department {
	@Id
	@Column(name="deptid")
	private int deptid;
	@Column(name="deptname")
	private String deptname;
	@Column(name="location")
	private String location;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	public Employee employee;

	public Department(int deptid, String deptname, String location) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.location = location;
	}
	
	

}
