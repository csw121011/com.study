package com.study.map;

import java.util.HashMap;
import java.util.Set;

public class MapCircleTest {
	public static void main(String[] args) {
		//创建hashmap容器map1
		HashMap map1 = new HashMap();
		//给容器赋值
		map1.put("csw",30);
		map1.put("zt",29);
		map1.put("ccc",52);
		map1.put("psp",52);
		map1.put("chq",3);
		
		//用keyset方法获取map中的key值
		//创建keys容器来存放所有的KEY
		Set keys = map1.keySet();
		//循环key，并通过key获取对应的value
		for (Object key: keys) {
			System.out.println("key是："+key+"对应的值是："+map1.get(key));
		}	
		
	}
}
