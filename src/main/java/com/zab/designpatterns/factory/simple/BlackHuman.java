package com.zab.designpatterns.factory.simple;

public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑皮肤");
    }

    @Override
    public void talk() {
        System.out.println("听不懂的黑人话");
    }
}
