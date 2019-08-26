package com.zab.designpatterns.proxy;

public class Hero implements Dotaer{

	@Override
	public void buyEquipment() {
		System.out.println("人买装备");
	}
	
}
