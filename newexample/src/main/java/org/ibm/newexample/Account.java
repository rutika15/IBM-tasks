package org.ibm.newexample;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="account")
@Entity
public class Account {
	@Id
	@Column(name = "accno")
	private int accno;
	@Column(name = "ownername")
	private String ownername;
	@Column(name = "balance")
	private int balance;
	
	
	

}
