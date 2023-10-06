package com.zab.designpatterns.factory.abstractfactory;

public class FeMaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("女性白人");
    }
}
