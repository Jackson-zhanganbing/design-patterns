package com.zab.designpatterns.factory.abstractfactory;

public interface HumanFactory {
     <T extends Human> T createBlackHuman();
     <T extends Human> T createWhiteHuman();
     <T extends Human> T createYellowHuman();
}
