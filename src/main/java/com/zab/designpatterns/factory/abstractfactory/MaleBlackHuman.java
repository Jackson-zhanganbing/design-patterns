package com.zab.designpatterns.factory.abstractfactory;

public class MaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
        System.out.println("男性黑人");
    }
}
