package com.study.instancetest;

import org.junit.Test;

public class InstanceTest {
    @Test//饿汉
    public void test1(){
        Instance1.show();
        Instance1.getInstance();
    }
    @Test//懒汉
    public void test2(){
        Instance2.show();
        Instance2.getInstance();
    }
    @Test//枚举
    public void test3(){
        Instance3 instance1= Instance3.INSTANCE;
        Instance3 instance2= Instance3.INSTANCE;
        System.out.println(instance1.equals(instance2)); //看instance1地址是否和instance2相同

    }

}
