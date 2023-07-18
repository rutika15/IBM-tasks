package org.mapping.hibernatemapping;


import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	@Id
	@Column(name = "company_id")
	private String companyId;
	@Column(name = "company_name")
	private String companyName;
	@Embedded
	private Address companyAddress;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "company")

	private Collection<Employee> employees;
	
	

}