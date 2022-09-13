package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection c =new ArrayList();
        c.add(new Piont(1,2));
        c.add(new Piont(3,4));
        c.add(new Piont(5,6));
        c.add(new Piont(7,8));
        Piont p=new Piont(1,2);
        boolean contains = c.contains(p);//Piont中重写了equals方法，所不重写，此处为false
        System.out.println(contains);
    }
}
