package com.zab.designpatterns.factory.abstractfactory;

public class FeMaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void getSex() {
        System.out.println("女性黄人");
    }
}
