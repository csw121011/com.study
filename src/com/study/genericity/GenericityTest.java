package com.study.genericity;
/**
 * ���ͣ�Լ�������ݵĴ������ͣ�ֻ�ܴ洢ָ��������
 * �����ķ��ͣ�
 * 		E(Element)
 *		T(Type)
 *		K(Key)
 *		V(Value)
 *		 
 * @author csw12
 *
 */
public class GenericityTest {
	public static void main(String[] args) {
		 Pointer<String,Integer> p1 = new Pointer<>();
		 p1.setLatitude("a");
		 p1.setLongitude("b");
		 p1.add(99);
	}
}
