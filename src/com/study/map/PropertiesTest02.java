package com.study.map;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Propertiesʹ�ó�����
 *      ��Ҫ�ǽ��Ӳ�������⣨д���ı��룩
 */
public class PropertiesTest02 {
    //�˲���1Ϊд����Ӳ���룬��Ϊ�������ļ�Ϊclass�ļ���������Ŀ�������Ը��ģ������Ӳ��������
    @Test
    public void test1() {
        //����Properties����
        Properties p = new Properties();
        p.setProperty("username", "����ΰ");
        p.setProperty("password", "csw121011");
        p.setProperty("url", "mysql://ab");
        System.out.println(p);
    }

    //�����ʽ1�����ַ���ֻ������windowϵͳ������ϵͳ�̷���һ������ȡ�����ļ�
    @Test
    public void test2() throws IOException {
        //��������
        Properties p = new Properties();
        //void load(InputStream inStream)   �÷�����ָ���������ص�Properties������
        p.load(new FileInputStream("F:\\eclipse\\db.properties"));
        System.out.println(p);

    }

    //�����ʽ2���˷�ʽ�����˵�ǰ������������Ҫ���Ÿģ�Ҳ��̫����
    @Test
    public void test3() throws IOException {
        //��������
        Properties p = new Properties();
        //����Class����cls������PropertiesTest02.class�ļ�
        Class<PropertiesTest02> cls = PropertiesTest02.class;
        //InputStream getResourceAsStream(String name)  �����ҵ���ָ����ԴתΪio��
        //   /: ��ʾ��һ�����������binĿ¼
        InputStream inputStream = cls.getResourceAsStream("/db.properties");
        p.load(inputStream);
        System.out.println(p);
        inputStream.close();
    }
    //�����ʽ3���õ���࣬���
    //ʹ��������������ֽ����ļ����ص�jvm�Ĺ��ߣ�
    //********�Ժ�Բ��ô˷�ʽ**********
    @Test
    public void test4() throws IOException {
        InputStream inputStream = Thread.currentThread()        //��ȡ��ǰ�̶߳���
                .getContextClassLoader()                        //��ȡ��������
                .getResourceAsStream("db.properties");    //����ָ������ԴתΪio����ע�⣺����ص�getResourceAsStream����Ĭ������bin��Ŀ¼�¶�ȡ�ʼۣ�
        Properties p = new Properties();
        p.load(inputStream);
        System.out.println(p);
    }
}
