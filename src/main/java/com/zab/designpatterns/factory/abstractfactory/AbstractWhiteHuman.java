package com.zab.designpatterns.factory.abstractfactory;

public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("说单字节的话");
    }
}
