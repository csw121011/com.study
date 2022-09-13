package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Piont p = new Piont(1,2);
        Collection c = new ArrayList();
        p.setX(2);
        c.add(p);
        System.out.println("p:"+p);
        System.out.println("c:"+c);
    }
}
