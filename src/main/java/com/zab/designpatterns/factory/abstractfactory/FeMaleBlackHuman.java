package com.zab.designpatterns.factory.abstractfactory;

public class FeMaleBlackHuman extends AbstractBlackHuman{
    @Override
    public void getSex() {
        System.out.println("女性黑人");
    }
}
