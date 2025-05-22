package com.constructor;

public class Employee1 {
	public String name;
	public double salary;
	
	public Employee1(String name,double salary) {
		this.name=name;
		this.salary=salary;
		System.out.println("Name :" + name+ "\nSalary :" +salary);
	}
	public void setSalary(String name,double salary) {
		this.salary=salary+6000;
	}
	public void display() {
		System.out.println("Name of the Student :" + name);
		System.out.println("Salary of the Salary :" + salary);
	}
	public static void main(String[] args) {
		Employee1 emp = new Employee1("Sourab",60000.00);
		emp.setSalary("karthik", 45000.00);
		emp.display();
	}
}
