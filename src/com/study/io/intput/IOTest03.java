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
public class IOTest03 {
    public static void main(String[] args) throws IOException {
        //�����ֽ�������
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        //3��ʾһ���Զ�ȡ�����ֽ�
        byte[] bytes = new byte[20];
        int len;
        while ((len =fi.read(bytes))!=-1){
            sb.append(new String(bytes));
        }
        System.out.println(sb);
    }
}
