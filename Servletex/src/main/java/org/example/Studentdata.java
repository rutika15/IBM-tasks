package org.example;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
@Entity
@Table(name="studentdata")
@Getter
@Setter

public class Studentdata {
	
	@Id
	@Column(name="name")
	public String name;
	@Column(name="coursename")
	public String coursename;

}
