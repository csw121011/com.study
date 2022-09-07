package com.study.map;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Properties使用场景：
 *      主要是解决硬编码问题（写死的编码）
 */
public class PropertiesTest02 {
    //此测试1为写死的硬编码，因为编译后此文件为class文件，后期项目测试难以更改，这就是硬编码问题
    @Test
    public void test1() {
        //创建Properties对象
        Properties p = new Properties();
        p.setProperty("username", "曹仕伟");
        p.setProperty("password", "csw121011");
        p.setProperty("url", "mysql://ab");
        System.out.println(p);
    }

    //解决方式1：这种方法只适用于window系统，其他系统盘符不一样，读取不到文件
    @Test
    public void test2() throws IOException {
        //创建对象
        Properties p = new Properties();
        //void load(InputStream inStream)   该方法把指定的流加载到Properties对象中
        p.load(new FileInputStream("F:\\eclipse\\db.properties"));
        System.out.println(p);

    }

    //解决方式2：此方式若改了当前类名，代码需要跟着改，也不太方便
    @Test
    public void test3() throws IOException {
        //创建对象
        Properties p = new Properties();
        //创建Class对象cls来接收PropertiesTest02.class文件
        Class<PropertiesTest02> cls = PropertiesTest02.class;
        //InputStream getResourceAsStream(String name)  将查找到的指定资源转为io流
        //   /: 表示第一个根代表的是bin目录
        InputStream inputStream = cls.getResourceAsStream("/db.properties");
        p.load(inputStream);
        System.out.println(p);
        inputStream.close();
    }
    //解决方式3：用的最多，最方便
    //使用类加载器（把字节码文件加载到jvm的工具）
    //********以后皆采用此方式**********
    @Test
    public void test4() throws IOException {
        InputStream inputStream = Thread.currentThread()        //获取当前线程对象
                .getContextClassLoader()                        //获取加载类器
                .getResourceAsStream("db.properties");    //根据指定的资源转为io流（注意：类加载的getResourceAsStream方法默认是在bin根目录下读取问价）
        Properties p = new Properties();
        p.load(inputStream);
        System.out.println(p);
    }
}
