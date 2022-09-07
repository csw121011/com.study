package com.study.map;

import java.util.Properties;

/**
 * Properties�̳���ϵ
 *         Map
 *          |
 *          |__Hashtable
 *                  |
 *                  |__Properties
 *          ע�⣺���Ҫʹ��Properties����Ҫʹ�ø���ķ�����Properties������׼����key��value�����ַ���
 * ���õķ�����
 *      Object setProperty(String key,String value)         ��ӻ��޸�Properties�����ֵ
 *      String getProperty(String key)                      ����key��ȡ��Ӧֵ
 *      String getProperty(String key,String defaultValue)  ����key��ȡ��Ӧֵ����������ھͷ���ֵdefaultValue
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("csw","csw121011");
        properties.setProperty("zt","zt123");
        System.out.println(properties);
        properties.getProperty("csw");
        System.out.println("csw������Ϊ��"+properties.getProperty("csw"));
        System.out.println("chq������Ϊ��"+properties.getProperty("chq","�Բ���û�д��û�"));
    }
}
