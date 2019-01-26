package com.liuzhaocn.designpattern.create.singletone;

/**
 * 懒汉式单例，实现了懒加载
 * 
 * 线程安全
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    // 注意：private类型的构造函数，保证其他类对象不能直接new一个该对象的实例
    private LazySingleton() {
    }

    /**
     * 注意synchronized
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}