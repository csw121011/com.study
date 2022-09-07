package com.study.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork01 {
	/**
	 * 
	 * ����
	 *   1.ͳ���ַ����ֵĴ���
	 *      a=4
	 *      b=4
	 *      c=3
	 *      d=3
	 *   2.��ȡ���ִ���������һ��
	 *   	a=4
	 *   	b=4
	 *   �漰�ķ�����
	 *   	HashMap:
	 *   		boolean conntainsKey(Object key)  ��ǰmap�������Ƿ����ָ����key
	 *   	String:
	 *   		char[] toCharArray()  ���ַ���ת���ַ�����
	 */
	public static void main(String[] args) {
		String str = "asfsgfhfhadssfgfadagasf";
		// 1.���ַ���ת���ַ�����
		char [] chars = str.toCharArray();
		//����hashmap����
		HashMap map =new HashMap();
		for (char c : chars) {
			//map�Ƿ����ָ����key
			if (map.containsKey(c)) {
				//����������޸�value��������1
				map.put(c, (Integer)map.get(c)+1);
			}else {
				//����������ӵ�һ��
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		Collection values = map.values();		//����vlaue������ȡ����ֵ
//		Object[] array = values.toArray();		//�����е�ֵתΪ���飬ע�ⶼ�ǻ�ȡ��ֵobject��������
//		Integer max = (Integer)array[0];		//�����һ�������ֵ
//		for (Object object : array) {			//ѭ���Ƚϴ�С
//			Integer value = (Integer)object;	//�ѻ�ȡ��ֵ����ǿתΪinteger����
//			if (max<value) {					//�Ƚϴ�С
//				max = value;					//���value���󣬾Ͱ�value��ֵ��max
//			}
//		}
		Object max = Collections.max(values);	//���ϴ����ͬ�ڴ˾� 
		
		Set entrys = map.entrySet();			//��������entry���洢map��������ж���
		for (Object object : entrys) {			
			Entry entry = (Entry)object;		//����ǿת
			if (entry.getValue().equals(max)) {	//��������entry��valueֵ�����ֵmaxƥ�䣬�����ʹ�ӡ���
				System.out.println("���������ǣ�"+entry.getKey()+"  ���ֵĴ����ǣ�"+entry.getValue());
			}
		}
	}
}
