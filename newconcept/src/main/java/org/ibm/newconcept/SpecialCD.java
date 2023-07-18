package org.ibm.newconcept;

import javax.persistence.Entity;

import lombok.Setter;

@Setter
@Entity
public class SpecialCD extends CD {

	public SpecialCD(String cdName, String feature) {
		super(cdName);
		// TODO Auto-generated constructor stub
		this.feature = feature;
	}

	private String feature;

}