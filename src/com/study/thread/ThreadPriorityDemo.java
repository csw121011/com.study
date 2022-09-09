package com.study.thread;

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        Thread max = new Thread("max") {
           public void run(){
               for (int i = 1; i <= 1000; i++) {
                   System.out.println(getName()+i);
               }
           }
        };
        Thread nor = new Thread("nor") {
           public void run(){
               for (int i = 1; i <= 1000; i++) {
                   System.out.println(getName()+i);
               }
           }
        };
        Thread min = new Thread("min") {
           public void run(){
               for (int i = 1; i <= 1000; i++) {
                   System.out.println(getName()+i);
               }
           }
        };
        max.setPriority(Thread.MAX_PRIORITY);
        //max.setPriority(10);上面的写法也表示设置值为10，最大有限级
        min.setPriority(1);

        max.start();
        nor.start();
        min.start();
    }
}
