package com.zab.designpatterns.decorater;

public class Test {
    public static void main(String[] args) {
        HolySword dwarfSniper = new HolySword(new Butterfly(new DwarfSniper()));
        dwarfSniper.attack();
    }
}
