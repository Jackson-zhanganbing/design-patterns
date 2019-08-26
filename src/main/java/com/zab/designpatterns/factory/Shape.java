package com.zab.designpatterns.factory;

public abstract class Shape {

	protected String name;
	protected double area;
	public static final double PI = 3.1415926535897932384626;
	
	abstract void draw();
	abstract void wipe();
	
}
