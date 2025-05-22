package com.constructor;

public class Product {
	public int id;
	public double price;
	
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	
	public boolean isSame(Product p) {
		 return this.id==p.id;
	}
	public void test() {
		System.out.println("Product Id :" + id + "\nProduct Price :" + price);
	}
	
	public static void main(String[] args) {
		Product p1 = new Product(1,4000.00);
		Product p2 = new Product(2,6000.00);
		p2.test();
		p1.test();
		if(p1.isSame(p2)) {
			System.out.println("Both ids are same:");
		}
		else {
			System.out.println("Both ids are not same");
		}
	}
}
