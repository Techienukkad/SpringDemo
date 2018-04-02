package com.techienukkad.spring.beans;

public class Product {
	private String productName;
	private int productId;
	private double productPrice;
	
	public Product() {}
	
	/*public Product(String productName, int productId, double productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
	}*/
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void confirm() {
		System.out.println("Product Details--");
		System.out.println("Name: "+productName);
		System.out.println("Id: "+productId);
		System.out.println("Price: "+productPrice);
	}
}
