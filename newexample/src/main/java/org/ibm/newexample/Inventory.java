package org.ibm.newexample;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;
	@ToString
	@NoArgsConstructor
	@AllArgsConstructor
	
	@Setter
	@Table(name = "inventory")
	@Entity
	public class Inventory {
		
		public int getProductId() {
			return productId;
		}
		public int getInventId() {
			return inventId;
		}
		public String getProductName() {
			return productName;
		}
		public int getAavailable() {
			return aavailable;
		}
		@Id
		@Column(name = "inventory_id")
		private int inventId;
		@Column(name = "product_id")
		private int productId;
		@Column(name = "product_name")
		private String productName;
		@Column(name = "available")
		private int aavailable;

	}

