package com.study.buffered;
import java.io.*;
/**
 * 缓冲流：
 *      在内存中创建一个缓冲区来存放数据，通过缓冲区，增加了代码的读写能力
 *      从文件读取到缓冲区，在缓冲区操作，然后输出到文件。减少了磁盘和程序的读写次数
 *      常用构造方法：
 *        输入：
 *          BufferedInputStream(InputStream in)             创建一个字节输入缓冲流，默认8kb
 *          BufferedInputStream(InputStream in,int size)    创建一个字节输入缓冲流，自定义size缓冲大小
 *        输出：
 *          BufferedOutputStream(OutputStream in)           创建一个字节输出缓冲流，默认8kb
 *          BufferedOutputStream(OutputStream in,int size)  创建一个字节输出缓冲流，自定义size缓冲大小
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        copy(new File("E:\\文件\\新建文件夹\\桌面.jpg"),new File("F:/a/b/1.jpg"));
    }
    public static void copy(File src1,File src2) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src1));        //创建字节输入缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(src2));    //创建字节输出缓冲流
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
