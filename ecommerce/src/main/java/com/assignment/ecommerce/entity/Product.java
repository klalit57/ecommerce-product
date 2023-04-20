package com.assignment.ecommerce.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="products")
public class Product {
	    
	    @Id
	    private String productId;
	    
	    private String name;
	    
	    private String description;
	    
	    private double price;
	    
	    private int quantity;
	    
	    

		public Product() {
		}



		public Product(String name, String description, double price, int quantity) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
			this.quantity = quantity;
		}



		public String getProductId() {
			return productId;
		}



		public void setProductId(String productId) {
			this.productId = productId;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		public int getQuantity() {
			return quantity;
		}



		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}



		@Override
		public String toString() {
			return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
					+ price + ", quantity=" + quantity + "]";
		}
	    

}
