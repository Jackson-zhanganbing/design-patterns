package com.zab.designpatterns.strategy;

public class Butterfly implements Equipment {
	
	@Override
	public void showProp() {
		System.out.println("蝴蝶，加攻速，加移速，加闪避");
	}
	@Override
	public void work() {
		System.out.println("+35 攻击力" +
				"敏捷+25" +
				"攻速+35%" +
				"攻击力+30");
	}
	
	
}
