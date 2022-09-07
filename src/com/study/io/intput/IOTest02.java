package com.study.io.intput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * FileInputStream(File file)
 * FileInputStream(String name)
 * FileOutputStream(File file)
 * FileOutputStream(String name)
 *
 *
 */
public class IOTest02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        long start = System.currentTimeMillis();
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        //3表示一次性读取三个字节
        byte[] bytes = new byte[3];
        int len =fi.read(bytes);
        System.out.println("读取到的字节："+ Arrays.toString(bytes));
        len =fi.read(bytes);
        System.out.println("读取到的字节："+new String(bytes)+"耗时"+(start-System.currentTimeMillis())+"ms");//String(Byte[] byte)，String提供了一个构造方法，把byte数组转化为字符串
    }
}
