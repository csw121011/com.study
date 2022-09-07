package com.study.genericity;
/**
 * 泛型：约束着数据的传入类型，只能存储指定的类型
 * 常见的泛型：
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
