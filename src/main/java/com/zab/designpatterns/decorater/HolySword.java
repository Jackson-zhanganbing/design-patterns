package com.zab.designpatterns.decorater;

public class HolySword implements Hero{
	Hero hero;
	public HolySword(Hero hero) {
		this.hero = hero;
	}
	@Override
	public void attack() {
		hero.attack();
		System.out.println("攻击力+300");
	}
	@Override
	public void describe() {
		System.out.println("DOTA翻盘神器!");
	}
	
	
}
