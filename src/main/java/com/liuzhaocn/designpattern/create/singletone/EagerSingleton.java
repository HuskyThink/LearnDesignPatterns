package com.liuzhaocn.designpattern.create.singletone;

/**
 * 饿汉式单例，非懒加载
 * 
 * 以空间换时间
 * 
 * 线程安全
 */
public class EagerSingleton {

    // 注意：类被加载的时候初始化实例
    private static EagerSingleton instance = new EagerSingleton();

    // 注意：private类型的构造函数，保证其他类对象不能直接new一个该对象的实例
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}