package com.study.instancetest;

/**
 * ���ģʽ������ģʽ���������еĶ���ֻ�ܴ���һ����
 * ����һ��    ����ʵ��     ģʽ��һ�ֽṹ
 * ��������ģʽ���ַ�����
 *              1.����ģʽ
 *              2.����ģʽ
 *              3.ö�ٴ���
 *        ȱ�㣺��Ϊ��static����  ���Գ��ڴ棬ռ���ڴ�ռ�
 */
public class Instance1 {
    //����һ������
    private static Instance1 instance = new Instance1();
    // ���췽������˽�л�,��ֹ�ⲿ���ⴴ��
    private Instance1(){
        System.out.println("���Ƕ������췽��");
    }
    public static Instance1 getInstance(){
        return instance;
    }
    public static void show(){
        System.out.println("����show show show !!!");
    }

}
