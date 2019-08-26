package com.zab.designpatterns.strategy;

public class Test {
    public static void main(String[] args) {
        DwarfSniper dwarfSniper = new DwarfSniper(new Butterfly());
        dwarfSniper.attack();
    }
}
