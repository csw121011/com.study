package com.study.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections工具类：该工具专门用来操作集合的
 * 		static Object max(Collections coll)  		获取集合中最大元素
 * 		static void sort (List list) 				对list集合进行排序，只能进行简单排序
 * 		static void sort (List list,Comparator c)	根据指定比较器c进行排序
 * 		
 */

public class CollectionsTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(4);
		System.out.println(list);
		
		//获取集合中最大的元素
		Object max = Collections.max(list);
		System.out.println(max); 				//打印最大值
		
		Collections.sort(list);
		System.out.println("排序后效果："+list);
		System.out.println("---------------完美分割线---------------");
		
		//对集合进行指定比较器排序
	List <Student>students = Arrays.asList(
				new Student("ccc",12),
				new Student("ztt",11),
				new Student("csw",18),
				new Student("psp",14)
				);
	Collections.sort(students, new Comparator<Student>() {		//使用方法sort排序，使用匿名内部类创建比较方法comparator

		@Override
		public int compare(Student o1, Student o2) {
			int value =o1.getAge().compareTo(o2.getAge());
			if (value == 0) {
				return o1.getName().compareTo(o2.getName());
			}
			return value;
		}
	});
	for (Student student : students) {					//遍历打印集合
		System.out.println(student);
	}
	}
}
