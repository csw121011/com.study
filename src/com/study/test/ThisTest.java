package com.study.test;

public class ThisTest {
	public static void main(String[] args) {
		Customers c1 = new Customers("csw");
		Customers c2 = new Customers("ztt");
		c1.say();
		c2.say();
	}
}
class Customers{
	String name;
	public Customers() {
	}
	public Customers(String s) {
		 name = s ;
	}
	public  void say() {
		//System.out.println(this.name+"正在买东西");
		  System.out.println(name+"正在买东西");
		 
	}
}