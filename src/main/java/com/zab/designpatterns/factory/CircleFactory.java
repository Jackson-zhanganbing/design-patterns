package com.zab.designpatterns.factory;

public class CircleFactory extends ShapeFactory{
	
	double radius;

	public CircleFactory(double radius) {
		this.radius = radius;
	}
	
	@Override
	public Shape getShape(String name) {
		if(name.equals("Circle")) {
			return new Circle(radius);
		}else {
			return null;
		}
	}

}
