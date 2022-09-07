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
        //�����ֽ�������
        long start = System.currentTimeMillis();
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        //3��ʾһ���Զ�ȡ�����ֽ�
        byte[] bytes = new byte[3];
        int len =fi.read(bytes);
        System.out.println("��ȡ�����ֽڣ�"+ Arrays.toString(bytes));
        len =fi.read(bytes);
        System.out.println("��ȡ�����ֽڣ�"+new String(bytes)+"��ʱ"+(start-System.currentTimeMillis())+"ms");//String(Byte[] byte)��String�ṩ��һ�����췽������byte����ת��Ϊ�ַ���
    }
}
