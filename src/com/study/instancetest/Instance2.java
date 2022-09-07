package com.study.instancetest;

/**
 * 单例模式2：
 *      懒汉模式:只有使用的时候才会创建对象。
 */
public class Instance2 {
        private Instance2() {
            System.out.println("我是懒汉构造方法2");
        }
        private static Instance2 instance;
        public static Instance2 getInstance() {
            if (instance == null) {
                synchronized (Instance2.class) {  //此处需要上锁，假如同时几个线程一起调用，前几个进来的数据可能会重复创建对象
                    if (instance == null) {
                        instance = new Instance2();
                   }
                }
            }
            return instance;
        }
        public static void show(){
            System.out.println("懒汉show show show show 2");
        }

    }
