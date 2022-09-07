package com.study.map;

import java.util.Properties;

/**
 * Properties继承体系
 *         Map
 *          |
 *          |__Hashtable
 *                  |
 *                  |__Properties
 *          注意：如果要使用Properties，不要使用父类的方法，Properties操作标准就是key和value都是字符串
 * 常用的方法：
 *      Object setProperty(String key,String value)         添加或修改Properties对象的值
 *      String getProperty(String key)                      根据key获取对应值
 *      String getProperty(String key,String defaultValue)  根据key获取对应值，如果不存在就返回值defaultValue
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("csw","csw121011");
        properties.setProperty("zt","zt123");
        System.out.println(properties);
        properties.getProperty("csw");
        System.out.println("csw的密码为："+properties.getProperty("csw"));
        System.out.println("chq的密码为："+properties.getProperty("chq","对不起，没有此用户"));
    }
}
