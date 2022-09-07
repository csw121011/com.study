package com.study.buffered;

import java.io.*;

/**
 * 字符缓冲流：
 *      字节缓冲流的方法都可以用。
 *   ！！注意：默认缓冲大小为8192个字符，不是字节
 *      特有方法：
 *             readLine()   读取一行
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        //创建字符输入缓冲流
        BufferedReader br = new BufferedReader(new FileReader("F:\\eclipse\\src\\com\\study\\buffered\\BufferedReaderTest.java"));
        //创建字符输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:/a/b/a.txt"));
        //查API文档发现br.readLine()读取完一行后返回的是null，所以定义String字符串变量line来接收返回值
        String line;
        //循环读取
        while ((line = br.readLine()) != null){
             //打印一行结束之后换行
            bw.write(line+"\r\n");
        }
        //关闭流
        br.close();
        bw.close();
    }


}
