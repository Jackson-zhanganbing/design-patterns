package com.zab.designpatterns.observer;

import lombok.Data;

/**
 * 玩家2观察者，只要游戏有更新，就能接收到最新游戏消息
 *
 * @author zab
 * @date 2023/10/6 19:48
 */
@Data
public class PlayerTwoObserver implements Observer{

    private String gameInfo = "玩家2接收到订阅消息：";

    @Override
    public void update(Object... args) {
        for (Object arg : args) {
            this.gameInfo += arg.toString()+"\n";
        }
    }
}
