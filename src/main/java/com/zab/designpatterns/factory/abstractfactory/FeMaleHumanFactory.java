package com.zab.designpatterns.factory.abstractfactory;

public class FeMaleHumanFactory implements HumanFactory{

    @Override
    public <T extends Human> T createBlackHuman() {
        return (T)new FeMaleBlackHuman();
    }

    @Override
    public <T extends Human> T createWhiteHuman() {
        return (T)new FeMaleWhiteHuman();
    }

    @Override
    public <T extends Human> T createYellowHuman() {
        return (T)new FeMaleYellowHuman();
    }
}
