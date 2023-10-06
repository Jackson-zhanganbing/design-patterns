package com.zab.designpatterns.observer;


/**
 * 主题类
 *
 * @author zab
 * @date 2023/10/6 19:28
 */
public interface Subject {
    /**
     * 注册一个观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除一个观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
