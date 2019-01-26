package com.liuzhaocn.designpattern.create.singletone;

/**
 * 1、枚举本身构造方法是private，也就是枚举本身就是单例的
 * 2、枚举是线程安全的
 * 3、枚举实现了序列化，其他几种方式序列化都有问题
 */
public enum EnumSingleton {
    instance;
}