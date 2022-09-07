package com.study.file;

import java.io.File;

/**
 * File列表相关的方法：
 * 1.String [] list()				获取当前文件夹下面所有的文件或者文件夹，以String的形式表示
 * 2.File[] listFile()				获取当前文件夹下面所有的文件或者文件夹，以File对象的形式表示
 * 3.static File[] listRoots()		获取当前电脑所有的根盘符，比如C D E
 *
 * @author csw12
 */
public class FileTest03 {
    public static void main(String[] args) {
        File[] listRoots = File.listRoots();    //获取当前电脑盘符

        for (File file1 : listRoots) {            //遍历打印盘符
            System.out.println(file1);
        }
        System.out.println("---------------------------");
        //创建File对象
        File file2 = new File("F:/a/b");
        //获取当前目录下的所有文件和文件夹
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
