package com.zab.designpatterns.proxy;

public class Test {
	public static void main(String[] args) {
		Bird b = new Bird(new Hero());
		b.buyEquipment();
	}
}
