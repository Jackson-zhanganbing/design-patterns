package com.zab.designpatterns.factory;

public class TriangleFactory extends ShapeFactory{

	double length;
	double width;
	
	public TriangleFactory(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public Shape getShape(String name) {
		if(name.equals("Triangle")) {
			return new Triangle(length, width);
		}else {
			return null;
		}
	}

}
