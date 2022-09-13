package com.study.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo04 {
    public static void main(String[] args) {
       Collection c1 = new ArrayList();
       c1.add("java");
       c1.add("c++");
       c1.add(".net");
       c1.add("android");

       Collection c2 = new HashSet();
       c2.add("android");
       c2.add("ios");
       c2.add("harmoneyOS");

//       c2.addAll(c1);
//       System.out.println("c2:"+c2);
//       c1.addAll(c2);
//       System.out.println("c1:"+c1);
//       boolean contains = c1.containsAll(c2);
//       System.out.println(contains);

       /*
       retainAll  取两个元素的交集
        */
        c2.retainAll(c1);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

        /*
        removeAll 删交集，将C2中与C1的元素相同的删除
         */
        c2.removeAll(c1);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

    }
}
