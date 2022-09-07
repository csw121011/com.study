package com.study.io.output;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        copy(new File("F:/a/b/c.txt"), new File("F:/a/b/d.txt"));
    }

    public static void copy(File src1, File src2) throws IOException {
        FileInputStream fis = new FileInputStream(src1);    //创建输入流读取src1文件
        FileOutputStream fos = new FileOutputStream(src2);  //创建输出流写入src2文件
        byte[] bytes = new byte[1024];                      //定义缓冲数组1024字节
        int len;                                            //定义一个变量来记录每次读取的字节个数
        while ((len = fis.read(bytes)) != -1) {             //循环读取字节
            fos.write(bytes, 0, len);                   //输出到src2文件
        }
        fis.close();                                        //关闭输入输出流
        fos.close();
    }
}