package com.study.thread;

/**
 * ��һ���̵߳���sleep��������˯�������б�interrupt�жϾͻᱨ��
 *
 */
public class ThreadSleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){

          public void run(){
              System.out.println("������ã�˯�����~~~");
              try {
                  Thread.sleep(10000);

              } catch (InterruptedException e) {
                  System.out.println("˭���������أ�Ҫ���˰�");
              }
              System.out.println("˯�Ŀ��������������");
          }
        };
        Thread li = new Thread(){
            public void run() {
                System.out.println("�ϰ��ǽ������80��С��50");
                for (int i = 0; i < 10; i++) {
                    System.out.println("80");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
                System.out.println("���䣡����");
                System.out.println("�ϰ�㶨");
                lin.interrupt();
            }
        };
        lin.start();
        li.start();

    }
}