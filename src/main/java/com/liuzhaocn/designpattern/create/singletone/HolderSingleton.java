package com.liuzhaocn.designpattern.create.singletone;

/**
 * 线程安全
 * 
 * 懒加载
 */
public class HolderSingleton {

    private HolderSingleton() {
    }

    // 内部类前面加static，表示类级内部类
    // 类级内部类特点：使用时才会被加载
    public static class InstanceHolder {
        // 类/静态变量的初始化是由JVM保证线程安全的
        private static HolderSingleton instance = new HolderSingleton();
    }

    /**
     * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，导致SingletonHolder类得到初始化；
     * 而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例;
     * 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
     * 这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
     */
    public static HolderSingleton getInstance() {
        return InstanceHolder.instance;
    }
}