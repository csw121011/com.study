package com.study.map;

import java.util.HashMap;
import java.util.Set;

public class MapCircleTest {
	public static void main(String[] args) {
		//����hashmap����map1
		HashMap map1 = new HashMap();
		//��������ֵ
		map1.put("csw",30);
		map1.put("zt",29);
		map1.put("ccc",52);
		map1.put("psp",52);
		map1.put("chq",3);
		
		//��keyset������ȡmap�е�keyֵ
		//����keys������������е�KEY
		Set keys = map1.keySet();
		//ѭ��key����ͨ��key��ȡ��Ӧ��value
		for (Object key: keys) {
			System.out.println("key�ǣ�"+key+"��Ӧ��ֵ�ǣ�"+map1.get(key));
		}	
		
	}
}
