package com.zab.designpatterns.factory.simple;

import java.lang.reflect.Constructor;
/**
 * 静态工厂，工厂无法拓展
 *
 * @author anbing.zhang(anbing.zhang@transsion.com)
 * @date 2023/3/9 14:35
 */
public class HumanFactory {
    public <T extends Human> T createHuman(Class<T> tClass) {
        if(tClass == null){
            return null;
        }
        Human human = null;
        try {
            Class<?> aClass = Class.forName(tClass.getName());
            Constructor<?> constructor = aClass.getConstructor();
            human = (T)constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
