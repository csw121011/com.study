package com.study.io.charout;

import java.io.*;

/**
 *    字符输出流：Writer  继承体系
 *                |
 *                |__InputStreamWriter
 *                        |
 *                        |__FileWriter
 *      常用构造方法：
 *          FileWriter(File file)                      向目标文件输出
 *          FileWriter(File file,boolean append)       向目标文件输出，append表示是否追加数据
 *          FileWriter(String fileName)                向目标文件输出
 *          FileWriter(String fileName,boolean append) 向目标文件输出，append表示是否追加数据
 */
public class OutputCharOut {
    public static void main(String[] args) throws IOException {
        copy(new File("F:/a/b/e.txt"),new File("F:/a/b/f.txt"));
    }
    public static void copy(File src1, File src2) throws IOException {
        FileReader fr = new FileReader(src1);
        FileWriter fw = new FileWriter(src2);
        //StringBuilder sb =new StringBuilder();
        char[] chars = new char[10];
        int len;
        while ((len =fr.read(chars))!=-1){
            String strings = new String(chars,0,len);
            fw.append(strings);
        }
        fr.close();
        fw.close();

    }
}
