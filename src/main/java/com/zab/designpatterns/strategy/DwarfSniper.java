package com.zab.designpatterns.strategy;


public class DwarfSniper implements Hero {
    Equipment equipment;

    public DwarfSniper(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void attack() {
        equipment.work();
        System.out.println("远程英雄，攻击距离800");
    }

    @Override
    public void describe() {
        System.out.println("dota大后期英雄，前期弱");
        equipment.showProp();
    }

}
