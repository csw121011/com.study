package com.study.instancetest;

import org.junit.Test;

public class InstanceTest {
    @Test//����
    public void test1(){
        Instance1.show();
        Instance1.getInstance();
    }
    @Test//����
    public void test2(){
        Instance2.show();
        Instance2.getInstance();
    }
    @Test//ö��
    public void test3(){
        Instance3 instance1= Instance3.INSTANCE;
        Instance3 instance2= Instance3.INSTANCE;
        System.out.println(instance1.equals(instance2)); //��instance1��ַ�Ƿ��instance2��ͬ

    }

}
