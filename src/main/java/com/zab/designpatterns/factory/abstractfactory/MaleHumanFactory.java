package com.zab.designpatterns.factory.abstractfactory;

public class MaleHumanFactory implements HumanFactory{

    @Override
    public <T extends Human> T createBlackHuman() {
        return (T)new MaleBlackHuman();
    }

    @Override
    public <T extends Human> T createWhiteHuman() {
        return (T)new MaleWhiteHuman();
    }

    @Override
    public <T extends Human> T createYellowHuman() {
        return (T)new MaleYellowHuman();
    }
}
