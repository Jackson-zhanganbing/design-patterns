package com.zab.designpatterns.factory;

public class RectangleFactory extends ShapeFactory{

	double length;
	double width;
	
	public RectangleFactory(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public Shape getShape(String name) {
		if(name.equals("Rectangle")) {
			return new Rectangle(length, width);
		}else {
			return null;
		}
		
	}

	

}
