package com.study.genericity;
/**
 * �����ķ��ͣ�
 * 		E(Element)  Ԫ�����ͣ�����123����abc��
 *		T(Type)     ��������
 *		K(Key)      ��
 *		V(Value)	ֵ	
 *ע�⣺
 *  �����ķ���
 *   1.���͵�������
 *   		���ޣ�? extends Number
 *   		���ޣ�? super Number 
 *   2.��̬����Ҫ�ӷ��ͣ�������ڷ�����
 *      ���� public static <E> void say(){ }
 */

public class Pointer <T,E>{   //�ڴ���Ӽ����ţ���ʾ֧�ַ���
	//����
	private T longitude;	//�˴���T��ʾ����
	//γ��
	private T latitude;		//�˴���T��ʾ����
	
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
