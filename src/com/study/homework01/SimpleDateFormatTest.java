package com.study.homework01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws ParseException {
		//����ʱ�����date����ȡ��ǰʱ��
		Date date = new Date();
		//������ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a E");
		//��ʽ��ʱ����󣨰�ʱ�����װ��Ϊ�ַ�����
		String dateString = sdf.format(date);
		String dateString2 = sdf2.format(date);
		System.out.println(dateString);
		System.out.println(dateString2);
		//���ַ���ת����ʱ�����
		//ע�⣺paeseת���ĸ�ʽ�����������sdf�ĸ�ʽһ�£���Ȼ�ᱨ��
		String str ="2022-08-27 19:43:04 ���� ����";
		//�½�ʱ������������ַ���strת���ɵĶ���
		Date date3 =sdf.parse(str);
		System.out.println(date3);
		
		
}
}
