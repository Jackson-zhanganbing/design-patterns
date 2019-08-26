package com.zab.designpatterns.factory;

public class Circle extends Shape {

	public Circle(double radius) {
		area = PI*radius*radius;
	}
	
	@Override
	public void draw() {
		System.out.println("draw a circle,area is"+area);
	}

	@Override
	public void wipe() {
		System.out.println("wipe a circle");
	}

	
}
