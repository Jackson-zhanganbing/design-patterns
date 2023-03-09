package com.zab.designpatterns.factory.abstractfactory;

public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("男性黄人");
    }
}
