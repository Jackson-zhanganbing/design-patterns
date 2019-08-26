package com.zab.designpatterns.factory;

public class Triangle extends Shape{
	
	public Triangle(double length,double width) {
		area = length*width/2;
	}

	@Override
	public void draw() {
		System.out.println("draw a triangle , area is "+area);
	}

	@Override
	public void wipe() {
		System.out.println("wipe a triangle");
	}

	
	
}
