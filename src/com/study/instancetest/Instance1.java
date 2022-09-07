package com.study.instancetest;

/**
 * 设计模式：单例模式（整个类中的对象只能创建一个）
 * 单：一个    例：实例     模式：一种结构
 * 创建单例模式三种方法：
 *              1.饿汉模式
 *              2.懒汉模式
 *              3.枚举创建
 *        缺点：因为是static修饰  所以吃内存，占用内存空间
 */
public class Instance1 {
    //创建一个对象
    private static Instance1 instance = new Instance1();
    // 构造方法必须私有化,防止外部随意创建
    private Instance1(){
        System.out.println("我是饿汉构造方法");
    }
    public static Instance1 getInstance(){
        return instance;
    }
    public static void show(){
        System.out.println("饿汉show show show !!!");
    }

}
