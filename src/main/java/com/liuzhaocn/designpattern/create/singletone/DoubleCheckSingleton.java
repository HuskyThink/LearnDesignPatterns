package com.liuzhaocn.designpattern.create.singletone;

public class DoubleCheckSingleton {

    // 注意：这里必须加volatile，否则其他线程可能因为线程缓存，再次判断到实例为null
    private volatile static DoubleCheckSingleton instance = null;

    // 注意：private类型的构造函数，保证其他类对象不能直接new一个该对象的实例
    private DoubleCheckSingleton() {
    }

    /**
     * 优点： <br/>
     * 1、先检查实例是否存在，如果存在，直接返回，不用线程同步<br/>
     * 2、如果实例不存在，再进入同步代码块，同时再判断一下是否已经存在，如果不存在，则确实不存在，可以在当前线程中初始化<br/>
     * 3、这里instance必须结合volatile关键字使用，否则其他线程可能因为线程缓存，再次判断到实例为null
     */
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}