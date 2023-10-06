package com.zab.designpatterns.factory.normal;

public class God {
    public static void main(String[] args) {
        HumanFactory humanFactory = new HumanFactory();
        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        YelloHuman yelloHuman = humanFactory.createHuman(YelloHuman.class);
        yelloHuman.getColor();
        yelloHuman.talk();
    }
}
