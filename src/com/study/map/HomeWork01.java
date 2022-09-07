package com.study.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWork01 {
	/**
	 * 
	 * 需求：
	 *   1.统计字符出现的次数
	 *      a=4
	 *      b=4
	 *      c=3
	 *      d=3
	 *   2.获取出现次数最多的那一对
	 *   	a=4
	 *   	b=4
	 *   涉及的方法：
	 *   	HashMap:
	 *   		boolean conntainsKey(Object key)  当前map容器中是否包含指定的key
	 *   	String:
	 *   		char[] toCharArray()  把字符串转成字符数组
	 */
	public static void main(String[] args) {
		String str = "asfsgfhfhadssfgfadagasf";
		// 1.把字符串转成字符数组
		char [] chars = str.toCharArray();
		//创建hashmap容器
		HashMap map =new HashMap();
		for (char c : chars) {
			//map是否包含指定的key
			if (map.containsKey(c)) {
				//如果包含就修改value，次数加1
				map.put(c, (Integer)map.get(c)+1);
			}else {
				//不包含就添加第一次
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		Collection values = map.values();		//创建vlaue容器获取所有值
//		Object[] array = values.toArray();		//把所有的值转为数组，注意都是获取的值object对象类型
//		Integer max = (Integer)array[0];		//假设第一个是最大值
//		for (Object object : array) {			//循环比较大小
//			Integer value = (Integer)object;	//把获取的值进行强转为integer类型
//			if (max<value) {					//比较大小
//				max = value;					//如果value更大，就把value赋值给max
//			}
//		}
		Object max = Collections.max(values);	//以上代码等同于此句 
		
		Set entrys = map.entrySet();			//创建容器entry来存储map里面的所有对象
		for (Object object : entrys) {			
			Entry entry = (Entry)object;		//类型强转
			if (entry.getValue().equals(max)) {	//把容器里entry的value值与最大值max匹配，是最大就打印输出
				System.out.println("次数最多的是："+entry.getKey()+"  出现的次数是："+entry.getValue());
			}
		}
	}
}
