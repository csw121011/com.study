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
public class IOTest03 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        //3表示一次性读取三个字节
        byte[] bytes = new byte[20];
        int len;
        while ((len =fi.read(bytes))!=-1){
            sb.append(new String(bytes));
        }
        System.out.println(sb);
    }
}
