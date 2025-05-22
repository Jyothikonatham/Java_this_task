package com.constructor;

public class Point {
	public int x;
	public int y;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
		public void print() {
			System.out.println("X value :" +this.x);
			System.out.println("Y value :" +this.y);
			System.out.println(this);
		}
		public static void main(String[] args) {
			Point p1 = new Point(60,30);
			p1.print();
		}
	}
