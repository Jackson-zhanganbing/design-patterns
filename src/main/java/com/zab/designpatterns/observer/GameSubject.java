package com.zab.designpatterns.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 游戏主题，订阅该游戏主题的观察者，在游戏更新时都会收到通知
 *
 * @author zab
 * @date 2023/10/6 19:42
 */
@Data
public class GameSubject implements Subject{
    List<Observer> observerList = new ArrayList<>();

    private String gameUpdateInfo;

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(gameUpdateInfo);
        }
    }
}
