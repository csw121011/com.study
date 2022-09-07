package com.study.io.output;


import java.io.*;

/**
 * 字节输出流：FileOutputStream
 *     常用构造方法：
 *          FileOutputStream(File file)                     向指定file文件输出内容
 *          FileOutputStream(File file,boolean append)      向指定file文件输出内容，append表示是否追加输出数据
 *          FileOutputStream(String name)                   向指定file文件输出内容
 *          FileOutputStream(String name,boolean append)    向指定file文件输出内容，append表示是否追加输出数据
 *注意：如果路径不存在会报错，但是如果路径存在，文件不存在，则会创建文件
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fo = new FileOutputStream("F:/a/b/d.txt");//输出到文件里面，注意，会覆盖当前文件内容
//        fo.write(97);
//        fo.write(98);
//        fo.write(99);
//        fo.close();
//        System.out.println("-----------------------------");
        FileOutputStream fo1 = new FileOutputStream("F:/a/b/d.txt", true);//append表示在当前文件内容后面追加输出
//        fo1.write(65);
//        fo1.write(66);
//        fo1.write(67);
//        System.out.println("存储完成");
        byte[] bytes=OutputStreamTest.readToWrite("F:/a/b/c.txt");
        fo1.write(bytes);
        fo1.close();
        System.out.println("写到d完成");

    }

    public static byte[] readToWrite(String name) throws IOException {
        FileInputStream fi = new FileInputStream(name);
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[512];
        int len;
        while ((len = fi.read(bytes)) != -1) {
            sb.append(bytes);
        }
        fi.close();
        return bytes;
    }
}

