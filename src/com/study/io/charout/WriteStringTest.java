package com.study.io.charout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//向文件中写入文本数据
public class WriteStringTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        String line = "年奶奶奶说按四大你三点i安迪你撒电视顶isa大啊你";
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        fos.close();
    }

}
