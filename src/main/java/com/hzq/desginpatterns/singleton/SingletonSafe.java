package com.hzq.desginpatterns.singleton;

public class SingletonSafe {

    private static SingletonSafe instance = null;

    private SingletonSafe(){
        // ...逻辑
    }

    /**
     * 懒汉模式，线程不安全
     */
    //线程不安全，因为 当两个线程都执行到 instance == null 时，发现instance都为null
    //此时会执行两次 new SingletonNotSafe(); 如果构造函数中逻辑复杂并且 重复执行会出问题比如重复打印等。
    public static SingletonSafe getInstanceNotSafe(){
        if(instance == null){
            return new SingletonSafe();
        }

        return instance;
    }

    /**
     * 简单解决线程安全问题。 缺点：多个线程每次执行getInstanceSimpleSafe()时，都会进行同步，影响性能。
     */
    public static synchronized SingletonSafe getInstanceSimpleSafe(){
        if(instance == null){
            return new SingletonSafe();
        }

        return instance;
    }

    /**
     * 双重校验锁，必须在同步代码块里进行二次校验 null
     */
    public static SingletonSafe getInstanceSafe(){
        if(instance == null){
            //多个线程在这里block，第一个线程执行成功之后。
            // 其他线程获取锁，进行同步块，如果不判断null，则会再次执行 new SingletonSafe()
            synchronized (SingletonSafe.class){
                if(instance == null){
                    instance = new SingletonSafe();
                }
            }
        }

        return instance;
    }

    /**
     * 使用内部类，线程安全，并且按需加载类
     */
    private static class LazyLoader{
        private static SingletonSafe instance = new SingletonSafe();
    }

    /**
     * 也是使用了jvm加载类、初始化类的机制。但是属于懒加载，也是线程安全。
     */
    public static SingletonSafe getInstanceLazyLoader(){
        return LazyLoader.instance;
    }
}
