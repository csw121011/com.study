package com.study.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String e = it.next();
            //使用迭代器遍历的时候，不要通过集合的add,remove操作来增删元素，否则会抛出异常
            //java.util.ConcurrentModificationException
            //可以通过迭代器的remove方法来删除，但是没有add的方法
            if ("#".equals(e)){
//              c.remove(e);
                it.remove();//此处为删除与“#”相同的元素
            }
        }
        System.out.println(c);
    }

}
