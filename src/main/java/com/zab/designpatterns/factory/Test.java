package com.zab.designpatterns.factory;

public class Test {
	public static void main(String[] args) {
		CircleFactory circleFactory = new CircleFactory(5);
		Shape shape = circleFactory.getShape("Circle");
		shape.draw();
	}
}
