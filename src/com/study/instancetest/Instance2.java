package com.study.instancetest;

/**
 * ����ģʽ2��
 *      ����ģʽ:ֻ��ʹ�õ�ʱ��Żᴴ������
 */
public class Instance2 {
        private Instance2() {
            System.out.println("�����������췽��2");
        }
        private static Instance2 instance;
        public static Instance2 getInstance() {
            if (instance == null) {
                synchronized (Instance2.class) {  //�˴���Ҫ����������ͬʱ�����߳�һ����ã�ǰ�������������ݿ��ܻ��ظ���������
                    if (instance == null) {
                        instance = new Instance2();
                   }
                }
            }
            return instance;
        }
        public static void show(){
            System.out.println("����show show show show 2");
        }

    }
