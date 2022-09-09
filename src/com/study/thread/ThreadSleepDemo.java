package com.study.thread;

import java.util.Scanner;

public class ThreadSleepDemo {
    public static void main(String[] args) {
//        System.out.println("开始了~~~");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("结束了~~~");
        System.out.println("倒计时开始");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        while (i != 0){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }
        System.out.println("时间到，BANG!!,你死了！！！");
    }
}
