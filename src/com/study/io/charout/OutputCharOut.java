package com.study.io.charout;

import java.io.*;

/**
 *    �ַ��������Writer  �̳���ϵ
 *                |
 *                |__InputStreamWriter
 *                        |
 *                        |__FileWriter
 *      ���ù��췽����
 *          FileWriter(File file)                      ��Ŀ���ļ����
 *          FileWriter(File file,boolean append)       ��Ŀ���ļ������append��ʾ�Ƿ�׷������
 *          FileWriter(String fileName)                ��Ŀ���ļ����
 *          FileWriter(String fileName,boolean append) ��Ŀ���ļ������append��ʾ�Ƿ�׷������
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
