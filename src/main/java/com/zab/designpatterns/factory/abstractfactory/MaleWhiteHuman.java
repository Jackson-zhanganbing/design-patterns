package com.zab.designpatterns.factory.abstractfactory;

public class MaleWhiteHuman extends AbstractWhiteHuman{
    @Override
    public void getSex() {
        System.out.println("男性白人");
    }
}
