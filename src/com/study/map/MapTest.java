package com.study.map;
	/**
	 * @author csw12
	 * @parm
	 */
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		//����hashmap����map1
		HashMap map1 = new HashMap();
		//��������ֵ
		map1.put("csw",30);
		map1.put("zt",29);
		map1.put("ccc",52);
		map1.put("psp",52);
		map1.put("chq",3);
		//�޸�ָ��KEY��ֵ
		map1.put("chq", 4);
		
			System.out.println(map1);
			System.out.println("-------------------------------");
		
		//����hashmap����map2
		HashMap map2 = new HashMap();
		//��������ֵ
		map2.put("gugu",30);
		map2.put("jiajia",29);
		map2.put("cccc",52);
		//��map2������������ӵ�map1
		map1.putAll(map2);
		
			System.out.println(map1);
			System.out.println("������"+map1.size());
		
		//���ݼ�cccɾ��Ԫ��
		map1.remove("csw");
			System.out.println(map1);
			System.out.println("������"+map1.size());
		//�������  
		//	map1.clear();
		
				
	}

}
