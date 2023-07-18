package org.ibm.newconcept;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;


import lombok.ToString;

@Entity
@DiscriminatorValue("CAR")
@ToString
@Table(name = "car_table")
public class Car extends RoadVehicle {

	@Enumerated(EnumType.STRING)
	public final AcclerationType acclerationType=AcclerationType.PADDLE;
	
	
	public Car()
	{
		super();
		numWheels=4;
		numPassengers=5;
		make="Maruti";
		model="Baleno";
	}
	
	
	
}
