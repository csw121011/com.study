package com.study.io.output;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        copy(new File("F:/a/b/c.txt"), new File("F:/a/b/d.txt"));
    }

    public static void copy(File src1, File src2) throws IOException {
        FileInputStream fis = new FileInputStream(src1);    //������������ȡsrc1�ļ�
        FileOutputStream fos = new FileOutputStream(src2);  //���������д��src2�ļ�
        byte[] bytes = new byte[1024];                      //���建������1024�ֽ�
        int len;                                            //����һ����������¼ÿ�ζ�ȡ���ֽڸ���
        while ((len = fis.read(bytes)) != -1) {             //ѭ����ȡ�ֽ�
            fos.write(bytes, 0, len);                   //�����src2�ļ�
        }
        fis.close();                                        //�ر����������
        fos.close();
    }
}