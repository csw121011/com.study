package com.study.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 完成一个简易记事本工具
 *      要求：程序启动后，将用户在控制台输入的所有数据都保存到文件
 *          当输入exit是退出程序
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("note.txt");
        Scanner s = new Scanner(System.in);
        //常规写法
        //while (true) {
        //    System.out.print("请输入：");
        //    String strings = s.nextLine();
        //    if ("exit".equals(strings)) {
        //        break;
        //    }
        //    byte[] bytes = strings.getBytes(StandardCharsets.UTF_8);
        //        fos.write(bytes);
        //}
        //fos.close();
        //简单写法
        String l;
        byte[] b;
        while (!("exit".equals((l=s.nextLine())))){
            b = l.getBytes(StandardCharsets.UTF_8);
            fos.write(b);
            System.out.print("请继续输入：");
        }
        fos.close();
        System.out.println("写入完毕，拜拜");
    }
}
