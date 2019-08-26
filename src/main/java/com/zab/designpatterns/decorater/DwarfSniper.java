package com.zab.designpatterns.decorater;

public class DwarfSniper implements Hero{

	@Override
	public void attack() {
		System.out.println("攻击距离800");
	}

	@Override
	public void describe() {
		System.out.println("dota攻击距离最长的英雄，大后期，脆皮，攻击40%眩晕对手");
	}
	
}
