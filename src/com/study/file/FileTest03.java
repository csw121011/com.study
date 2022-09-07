package com.study.file;

import java.io.File;

/**
 * File�б���صķ�����
 * 1.String [] list()				��ȡ��ǰ�ļ����������е��ļ������ļ��У���String����ʽ��ʾ
 * 2.File[] listFile()				��ȡ��ǰ�ļ����������е��ļ������ļ��У���File�������ʽ��ʾ
 * 3.static File[] listRoots()		��ȡ��ǰ�������еĸ��̷�������C D E
 *
 * @author csw12
 */
public class FileTest03 {
    public static void main(String[] args) {
        File[] listRoots = File.listRoots();    //��ȡ��ǰ�����̷�

        for (File file1 : listRoots) {            //������ӡ�̷�
            System.out.println(file1);
        }
        System.out.println("---------------------------");
        //����File����
        File file2 = new File("F:/a/b");
        //��ȡ��ǰĿ¼�µ������ļ����ļ���
        File[] listFiles = file2.listFiles();
        for (File file : listFiles) {
            System.out.println(file);
        }
        System.out.println("---------------------------------");
        String[] list = file2.list();
        for (String string : list) {
            System.out.println(string);
        }
    }

}
