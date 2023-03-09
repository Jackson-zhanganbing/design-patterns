package com.zab.designpatterns.proxy;

public class Bird implements Dotaer {

    Dotaer dotaer;

    public Bird(Dotaer dotaer) {
        this.dotaer = dotaer;
    }

    @Override
    public void buyEquipment() {
        System.out.println("鸟买装备");
        dotaer.buyEquipment();
    }

}
