package com.zab.designpatterns.factory.normal;

import java.lang.reflect.Constructor;
/**
 * 常规工厂模式，工厂可以拓展
 *
 * @author anbing.zhang(anbing.zhang@transsion.com)
 * @date 2023/3/9 14:36
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
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
