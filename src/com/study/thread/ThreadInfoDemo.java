package com.study.thread;

/**
 * 线程的一些获取信息方法：
 *
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {

        Thread main = Thread.currentThread();//获取当前线程，赋值给thread类型对象main
        String name = main.getName();//.getName放法，获取main线程的名字
        System.out.println(name);

        long id =main.getId();//.getId方法，获取main线程的id，每个线程都有唯一的id
        System.out.println(id);

        int priority = main.getPriority();//*.getPriority方法，获取main线程的优先级
        System.out.println(priority);

        boolean isInterrupted = main.isInterrupted();//是否被中断
        boolean daemon = main.isDaemon();//是否为守护线程
        boolean alive = main.isAlive();//是否或者
        System.out.println(isInterrupted+"\\n"+daemon+"\\n"+alive);

    }
}
