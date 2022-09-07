package com.study.instancetest;

import org.junit.Test;

import java.io.*;

public class Decoration {
    //在不改变原有代码的前提下，对代码进行装饰，实现功能的增强
    //曾用过的代码
    @Test
    public void test() throws IOException {
    //以下代码就是一层一层的装饰，功能不够就再次往上包装
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
