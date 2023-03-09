package com.zab.designpatterns.strategy;

public class HolySword implements Equipment {

    @Override
    public void showProp() {
        System.out.println("增加300点攻击力！");
    }

    @Override
    public void work() {
        System.out.println("+300攻击力！");
    }


}
