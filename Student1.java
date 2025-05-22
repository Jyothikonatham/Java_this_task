package com.constructor;

public class Student1 {
	public int rollNo;
	public String name;
	
	public Student1() {
		rollNo = 6;
		name = "Sandhya";
	}
	public void updateDetails(String name) {
		System.out.println("Student Old Name :" +this.name);
		this.name=name;
		System.out.println("Student New Name :" + name);
	}
	public void display() {
		System.out.println("Student Roll No :" +rollNo);
		System.out.println("Student Name :" + name);
	}
	
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.display();
		stu.updateDetails("Kumari");
	
	}
}
