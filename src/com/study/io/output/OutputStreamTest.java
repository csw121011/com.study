package com.study.io.output;


import java.io.*;

/**
 * �ֽ��������FileOutputStream
 *     ���ù��췽����
 *          FileOutputStream(File file)                     ��ָ��file�ļ��������
 *          FileOutputStream(File file,boolean append)      ��ָ��file�ļ�������ݣ�append��ʾ�Ƿ�׷���������
 *          FileOutputStream(String name)                   ��ָ��file�ļ��������
 *          FileOutputStream(String name,boolean append)    ��ָ��file�ļ�������ݣ�append��ʾ�Ƿ�׷���������
 *ע�⣺���·�������ڻᱨ���������·�����ڣ��ļ������ڣ���ᴴ���ļ�
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fo = new FileOutputStream("F:/a/b/d.txt");//������ļ����棬ע�⣬�Ḳ�ǵ�ǰ�ļ�����
//        fo.write(97);
//        fo.write(98);
//        fo.write(99);
//        fo.close();
//        System.out.println("-----------------------------");
        FileOutputStream fo1 = new FileOutputStream("F:/a/b/d.txt", true);//append��ʾ�ڵ�ǰ�ļ����ݺ���׷�����
//        fo1.write(65);
//        fo1.write(66);
//        fo1.write(67);
//        System.out.println("�洢���");
        byte[] bytes=OutputStreamTest.readToWrite("F:/a/b/c.txt");
        fo1.write(bytes);
        fo1.close();
        System.out.println("д��d���");

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

