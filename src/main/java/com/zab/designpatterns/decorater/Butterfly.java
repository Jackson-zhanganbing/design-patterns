package com.zab.designpatterns.decorater;

public class Butterfly implements Hero{
	Hero hero;
	public Butterfly(Hero hero) {
		this.hero = hero;
	}
	@Override
	public void attack() {
		hero.attack();
		System.out.println("+30%敏捷+30攻击力+30%闪避");
	}
	@Override
	public void describe() {
		System.out.println("敏捷神装，加攻速，加物理闪避，加敏捷");
	}
	
	
}
