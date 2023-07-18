package org.ibm.newexample;
import lombok.Getter;
import lombok.ToString;
import lombok.Setter;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;
@Getter
@Setter
@ToString


@Table(name="product")
@Entity
public class Product {
	
	public Product(int pid, String pname, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	@Id
	@Column(name = "pid")
	private int pid;
	@Column(name = "pname")
	private String pname;
	@Column(name = "pprice")
	private int pprice;
	
	
	
	

}
