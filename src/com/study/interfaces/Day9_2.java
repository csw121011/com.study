package com.study.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Day9_2 {
	public static void main(String[] args) {
		//定义容器
		ArrayList list =  new ArrayList<>();
		//添加元素
		list.add("11"); 
		list.add("22");
		list.add("33");
		//打印数组
		//普通for循环
		for (int i = 0; i < list.size(); i++) {
			System.out.println("元素："+list.get(i));
		}
			System.out.println("-------------------------------1");
		//增强for循环
		for (Object object : list) {
			System.out.println("元素："+object);
		}
			System.out.println("-------------------------------2");
		
		//迭代器方法 iterator()
		Iterator it = list.iterator();
		
		while ( it.hasNext()) {
			System.out.println("正向迭代元素："+it.next());
		}
		
			System.out.println("-------------------------------3");
		
		ListIterator its = list.listIterator();
		while ( its.hasNext()) {
			System.out.println("正向迭代元素："+its.next());
		}
		
		while ( its.hasPrevious()) {
			System.out.println("逆向迭代元素："+its.previous());
			
		}
		
	}
}
