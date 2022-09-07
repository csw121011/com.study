package com.study.buffered;
import java.io.*;
/**
 * ��������
 *      ���ڴ��д���һ����������������ݣ�ͨ���������������˴���Ķ�д����
 *      ���ļ���ȡ�����������ڻ�����������Ȼ��������ļ��������˴��̺ͳ���Ķ�д����
 *      ���ù��췽����
 *        ���룺
 *          BufferedInputStream(InputStream in)             ����һ���ֽ����뻺������Ĭ��8kb
 *          BufferedInputStream(InputStream in,int size)    ����һ���ֽ����뻺�������Զ���size�����С
 *        �����
 *          BufferedOutputStream(OutputStream in)           ����һ���ֽ������������Ĭ��8kb
 *          BufferedOutputStream(OutputStream in,int size)  ����һ���ֽ�������������Զ���size�����С
 */
public class BufferedTest {
    public static void main(String[] args) throws IOException {
        copy(new File("E:\\�ļ�\\�½��ļ���\\����.jpg"),new File("F:/a/b/1.jpg"));
    }
    public static void copy(File src1,File src2) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src1));        //�����ֽ����뻺����
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(src2));    //�����ֽ����������
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
