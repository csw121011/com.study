package com.study.io.charout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//���ļ���д���ı�����
public class WriteStringTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        String line = "��������˵���Ĵ�������i�����������Ӷ�isa����";
        byte[] bytes = line.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        fos.close();
    }

}
