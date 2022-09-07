package com.study.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections�����ࣺ�ù���ר�������������ϵ�
 * 		static Object max(Collections coll)  		��ȡ���������Ԫ��
 * 		static void sort (List list) 				��list���Ͻ�������ֻ�ܽ��м�����
 * 		static void sort (List list,Comparator c)	����ָ���Ƚ���c��������
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
		
		//��ȡ����������Ԫ��
		Object max = Collections.max(list);
		System.out.println(max); 				//��ӡ���ֵ
		
		Collections.sort(list);
		System.out.println("�����Ч����"+list);
		System.out.println("---------------�����ָ���---------------");
		
		//�Լ��Ͻ���ָ���Ƚ�������
	List <Student>students = Arrays.asList(
				new Student("ccc",12),
				new Student("ztt",11),
				new Student("csw",18),
				new Student("psp",14)
				);
	Collections.sort(students, new Comparator<Student>() {		//ʹ�÷���sort����ʹ�������ڲ��ഴ���ȽϷ���comparator

		@Override
		public int compare(Student o1, Student o2) {
			int value =o1.getAge().compareTo(o2.getAge());
			if (value == 0) {
				return o1.getName().compareTo(o2.getName());
			}
			return value;
		}
	});
	for (Student student : students) {					//������ӡ����
		System.out.println(student);
	}
	}
}
