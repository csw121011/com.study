package com.study.thread;

/**
 * 当一个线程调用sleep方法处于睡眠阻塞中被interrupt中断就会报错
 *
 */
public class ThreadSleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){

          public void run(){
              System.out.println("天气真好，睡个午觉~~~");
              try {
                  Thread.sleep(10000);

              } catch (InterruptedException e) {
                  System.out.println("谁啊，干嘛呢，要死了啊");
              }
              System.out.println("睡的可真舒服啊！！！");
          }
        };
        Thread li = new Thread(){
            public void run() {
                System.out.println("老板打墙不，大锤80，小锤50");
                for (int i = 0; i < 10; i++) {
                    System.out.println("80");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("轰轰轰！！！");
                System.out.println("老板搞定");
                lin.interrupt();
            }
        };
        lin.start();
        li.start();

    }
}