package com.study.collection;


import java.util.ArrayList;
import java.util.Collection;

/**
 * ����:
 *  ���÷�����
 *      add:�򼯺������һ��Ԫ�أ���Ԫ�ؿ���Ϊ�����������͵��������ͣ�������abc��123��1.2l�����л����������ͣ�
 *      contains:�������Ƿ����ĳ��Ԫ��
 *      remove:ɾ�������е�ĳ��Ԫ��
 *    ע�⣺�������д�����еķ���equals,��Ƚϵ��Ǽ�����Ԫ�صĵ�ַ������ֵ
 *         ���Բ��ǱȽϵ�ַ������£���Ҫ��дequals��alt+inset  ��дequals��hashcode
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
