package com.study.io.intput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream(File file)
 * FileInputStream(String name)
 * FileOutputStream(File file)
 * FileOutputStream(String name)
 *
 *
 */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        int num;
        while ((num = fi.read())!=-1){
            sb.append((char) num);
        }
        System.out.println(sb);
    }
}
