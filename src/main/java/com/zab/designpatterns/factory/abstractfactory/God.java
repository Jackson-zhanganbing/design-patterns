package com.zab.designpatterns.factory.abstractfactory;

public class God {
    public static void main(String[] args) {
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        Human blackHuman = maleHumanFactory.createBlackHuman();
        blackHuman.getColor();
        blackHuman.getSex();
        blackHuman.talk();

        Human whiteHuman = maleHumanFactory.createWhiteHuman();
        whiteHuman.getColor();
        whiteHuman.getSex();
        whiteHuman.talk();

        Human yellowHuman = maleHumanFactory.createYellowHuman();
        yellowHuman.getColor();
        yellowHuman.getSex();
        yellowHuman.talk();

        FeMaleHumanFactory feMaleHumanFactory = new FeMaleHumanFactory();
        Human feBlackHuman = feMaleHumanFactory.createBlackHuman();
        feBlackHuman.getColor();
        feBlackHuman.getSex();
        feBlackHuman.talk();

        Human feWhiteHuman = feMaleHumanFactory.createWhiteHuman();
        feWhiteHuman.getColor();
        feWhiteHuman.getSex();
        feWhiteHuman.talk();

        Human feYellowHuman = feMaleHumanFactory.createYellowHuman();
        feYellowHuman.getColor();
        feYellowHuman.getSex();
        feYellowHuman.talk();

    }
}
