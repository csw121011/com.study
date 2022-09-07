package com.study.io.intput;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream(File file)
 * FileInputStream(String name)
 * FileOutputStream(File file)
 * FileOutputStream(String name)
 *
 *
 */
public class IOTest04 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        //3表示一次性读取三个字节
        byte[] bytes = new byte[20];
        int len;
        while ((len =fi.read(bytes))!=-1){
            sb.append(new String(bytes,0,len));//表示从单次读取的第一位开始，len位结束。比如只剩两位了，就从第一位读到第二位
        }//格式不对的原因就是，比如设定单次读取20字节，但是剩余的只有15位。剩下的5位有可能就还是上一次读取的值，还没有被覆盖
        System.out.println(sb);
    }
}
