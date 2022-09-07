package com.study.io.intput;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream(File file)
 * FileInputStream(String name)
 * FileOutputStream(File file)
 * FileOutputStream(String name)
 *
 *
 */
public class IOTest04 {
    public static void main(String[] args) throws IOException {
        //�����ֽ�������
        FileInputStream fi = new FileInputStream("F:/a/b/c.txt");
        StringBuilder sb = new StringBuilder();
        //3��ʾһ���Զ�ȡ�����ֽ�
        byte[] bytes = new byte[20];
        int len;
        while ((len =fi.read(bytes))!=-1){
            sb.append(new String(bytes,0,len));//��ʾ�ӵ��ζ�ȡ�ĵ�һλ��ʼ��lenλ����������ֻʣ��λ�ˣ��ʹӵ�һλ�����ڶ�λ
        }//��ʽ���Ե�ԭ����ǣ������趨���ζ�ȡ20�ֽڣ�����ʣ���ֻ��15λ��ʣ�µ�5λ�п��ܾͻ�����һ�ζ�ȡ��ֵ����û�б�����
        System.out.println(sb);
    }
}
