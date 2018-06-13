package com.hzq.desginpatterns.singleton;

/**
 * 饿汉模式，在『类初始化』时，创建实例。(并非加载类时)。
 * 缺点：并非按需加载，如果 new SingletonHungry() 逻辑很多，会导致启动很慢。
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){
        // ...逻辑
    }

    /**
     * 初始化的几种条件
     * new getstatic putstatic invokestatic等几条指令会触发初始化。
     * Class.forName()、初始化子类会初始化父类、反射创建实例、main方法所在类
     */
    public static SingletonHungry getInstance(){
        return instance;//getstatic获取静态成员，会初始化类
    }

}
