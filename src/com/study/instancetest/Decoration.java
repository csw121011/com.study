package com.study.instancetest;

import org.junit.Test;

import java.io.*;

public class Decoration {
    //�ڲ��ı�ԭ�д����ǰ���£��Դ������װ�Σ�ʵ�ֹ��ܵ���ǿ
    //���ù��Ĵ���
    @Test
    public void test() throws IOException {
    //���´������һ��һ���װ�Σ����ܲ������ٴ����ϰ�װ
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("F:/a/b/a.txt"))));
        StringBuilder sb = new StringBuilder();
        char[] chars = new char[1024];
        int len;
    while ((len = br.read(chars)) != -1){
        sb.append(new String(chars),0,len);
    }
        System.out.println(sb);
        br.close();
    }
}
