package com.shoppersDen.entities;


public class ShoppingCart{
	
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
		return "ShoppingCart [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
public class ShoppingCart {

		public int productId;
		public String productName;
		public double price;
		public int quantity;
		public int getProductId() {
			return productId;
		}
		
		public ShoppingCart(int productId, String productName, double price, int quantity) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
			this.quantity = quantity;
		}


		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
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
		

}




