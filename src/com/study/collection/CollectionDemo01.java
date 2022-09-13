package com.study.collection;


import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合:
 *  常用方法：
 *      add:向集合中添加一个元素，此元素可以为引用数据类型的任意类型（不能是abc，123，1.2l，这中基本数据类型）
 *      contains:集合中是否包含某个元素
 *      remove:删除集合中的某个元素
 *    注意：如果不重写集合中的方法equals,则比较的是集合中元素的地址，不是值
 *         所以不是比较地址的情况下，都要重写equals。alt+inset  重写equals和hashcode
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("csw");
        c1.add("ztzt");
        c1.add("chq");

    }

}
