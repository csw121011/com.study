package com.study.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * ���һ�����׼��±�����
 *      Ҫ�󣺳��������󣬽��û��ڿ���̨������������ݶ����浽�ļ�
 *          ������exit���˳�����
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("note.txt");
        Scanner s = new Scanner(System.in);
        //����д��
        //while (true) {
        //    System.out.print("�����룺");
        //    String strings = s.nextLine();
        //    if ("exit".equals(strings)) {
        //        break;
        //    }
        //    byte[] bytes = strings.getBytes(StandardCharsets.UTF_8);
        //        fos.write(bytes);
        //}
        //fos.close();
        //��д��
        String l;
        byte[] b;
        while (!("exit".equals((l=s.nextLine())))){
            b = l.getBytes(StandardCharsets.UTF_8);
            fos.write(b);
            System.out.print("��������룺");
        }
        fos.close();
        System.out.println("д����ϣ��ݰ�");
    }
}
