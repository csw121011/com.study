package com.study.test;

public class Rectangle {
	double height;
	double width;
	public double getArea(double a,double b) {
		height = a ;
		width = b ;
		return height*width ;
		
	}
	public Rectangle(double a,double b) {
		height = a ;
		width = b ;
	}
	public double getArea() {
		
		return height*width ;
	}

}
