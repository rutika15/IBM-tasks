package org.example;

import javax.persistence.*;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name="admin")
@Setter
@Getter

public class Admin {
	
	@Id
	@Column(name="coursename")
	
	public String coursename;
	
	@Column(name="courseprice")
	public int courseprice;
	
	

}
