package com.study.thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable r1 = new Myrunnable1();
        Runnable r2 = new MyRunnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println("收电费"+i);
        }
    }
}
class Myrunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("开门开门"+i);

        }

    }

}
