package com.study.thread;
/**
 * ���߳�
 * �߳���һ������ĵ�һ˳��ִ�����̡������һ����һ�����о��Ƕ��̡߳�
 * ���߳��ǲ���ִ�еġ�
 * �����߳������ַ�ʽ����һ��:�̳�Thread����дrun����
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //1ʵ�����߳�
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        //2�����߳�
        t1.start();
        t2.start();
    }
}
/*
    ��һ�ִ�����ʽ���ŵ�:�ṹ�򵥣����������ڲ��ഴ��
    ȱ��:
    1:����java�ǵ��̳еģ��⵼������̳���Thread���޷��ټ̳���������
    2:�ڶ����߳�ʱ�������߳������⵼���������̴߳����˱�Ȼ����Ϲ�ϵ�������̵߳�����
 */
class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("����˭��?");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println("���ţ���ˮ���!");
        }
    }
}