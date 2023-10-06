package com.zab.designpatterns.factory.normal;

public class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑皮肤");
    }

    @Override
    public void talk() {
        System.out.println("听不懂的黑人话");
    }
}
