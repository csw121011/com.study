package com.study.buffered;

import java.io.*;

/**
 * �ַ���������
 *      �ֽڻ������ķ����������á�
 *   ����ע�⣺Ĭ�ϻ����СΪ8192���ַ��������ֽ�
 *      ���з�����
 *             readLine()   ��ȡһ��
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        //�����ַ����뻺����
        BufferedReader br = new BufferedReader(new FileReader("F:\\eclipse\\src\\com\\study\\buffered\\BufferedReaderTest.java"));
        //�����ַ����������
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:/a/b/a.txt"));
        //��API�ĵ�����br.readLine()��ȡ��һ�к󷵻ص���null�����Զ���String�ַ�������line�����շ���ֵ
        String line;
        //ѭ����ȡ
        while ((line = br.readLine()) != null){
             //��ӡһ�н���֮����
            bw.write(line+"\r\n");
        }
        //�ر���
        br.close();
        bw.close();
    }


}
