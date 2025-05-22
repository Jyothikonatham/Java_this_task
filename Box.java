package com.constructor;

public class Box {
	public int length;
	
	public Box(int length) {
		this.length=length;
	}
	public Box setLength(int length) {
		this.length=length;
		return this;
	}
	public void display() {
		System.out.println("Length of the Box :" +length);
	}
	public static void main(String[] args) {
		Box box = new Box(9);
		box.setLength(5).display();
	}
}
