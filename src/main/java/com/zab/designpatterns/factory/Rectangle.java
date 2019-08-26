package com.zab.designpatterns.factory;

public class Rectangle extends Shape{

	public Rectangle(double length,double width) {
		area = length*width;
	}
	
	@Override
	public void draw() {
		System.out.println("draw a rectangle ,area is "+area);
	}

	@Override
	public void wipe() {
		System.out.println("wipe a rectangle");
	}
	
}
