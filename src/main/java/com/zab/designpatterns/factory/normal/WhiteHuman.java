package com.zab.designpatterns.factory.normal;

public class WhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("说单字节的话");
    }
}
