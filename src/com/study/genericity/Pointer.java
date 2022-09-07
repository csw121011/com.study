package com.study.genericity;
/**
 * 常见的泛型：
 * 		E(Element)  元素类型，比如123，“abc”
 *		T(Type)     数据类型
 *		K(Key)      键
 *		V(Value)	值	
 *注意：
 *  方法的泛型
 *   1.泛型的上下限
 *   		上限：? extends Number
 *   		下限：? super Number 
 *   2.静态方法要加泛型，必须加在方法上
 *      例如 public static <E> void say(){ }
 */

public class Pointer <T,E>{   //在此添加尖括号，表示支持泛型
	//经度
	private T longitude;	//此处的T表示泛型
	//纬度
	private T latitude;		//此处的T表示泛型
	
	public Pointer() {
	}
	public Pointer(T longitude, T latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public T getLongitude() {
		return longitude;
	}
	public void setLongitude(T longitude) {
		this.longitude = longitude;
	}
	public T getLatitude() {
		return latitude;
	}
	public void setLatitude(T latitude) {
		this.latitude = latitude;
	}
	public void add(E e) {
		
	}
}
