package com.study.thread;

import java.util.Scanner;

public class ThreadSleepDemo {
    public static void main(String[] args) {
//        System.out.println("��ʼ��~~~");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("������~~~");
        System.out.println("����ʱ��ʼ");
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
        System.out.println("ʱ�䵽��BANG!!,�����ˣ�����");
    }
}
