package com.study.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Day9_2 {
	public static void main(String[] args) {
		//��������
		ArrayList list =  new ArrayList<>();
		//���Ԫ��
		list.add("11"); 
		list.add("22");
		list.add("33");
		//��ӡ����
		//��ͨforѭ��
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Ԫ�أ�"+list.get(i));
		}
			System.out.println("-------------------------------1");
		//��ǿforѭ��
		for (Object object : list) {
			System.out.println("Ԫ�أ�"+object);
		}
			System.out.println("-------------------------------2");
		
		//���������� iterator()
		Iterator it = list.iterator();
		
		while ( it.hasNext()) {
			System.out.println("�������Ԫ�أ�"+it.next());
		}
		
			System.out.println("-------------------------------3");
		
		ListIterator its = list.listIterator();
		while ( its.hasNext()) {
			System.out.println("�������Ԫ�أ�"+its.next());
		}
		
		while ( its.hasPrevious()) {
			System.out.println("�������Ԫ�أ�"+its.previous());
			
		}
		
	}
}
