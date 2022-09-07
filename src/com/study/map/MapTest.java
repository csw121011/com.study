package com.study.map;
	/**
	 * @author csw12
	 * @parm
	 */
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		//创建hashmap容器map1
		HashMap map1 = new HashMap();
		//给容器赋值
		map1.put("csw",30);
		map1.put("zt",29);
		map1.put("ccc",52);
		map1.put("psp",52);
		map1.put("chq",3);
		//修改指定KEY的值
		map1.put("chq", 4);
		
			System.out.println(map1);
			System.out.println("-------------------------------");
		
		//创建hashmap容器map2
		HashMap map2 = new HashMap();
		//给容器赋值
		map2.put("gugu",30);
		map2.put("jiajia",29);
		map2.put("cccc",52);
		//把map2的所有数据添加到map1
		map1.putAll(map2);
		
			System.out.println(map1);
			System.out.println("总数："+map1.size());
		
		//根据键ccc删除元素
		map1.remove("csw");
			System.out.println(map1);
			System.out.println("总数："+map1.size());
		//清空容器  
		//	map1.clear();
		
				
	}

}
