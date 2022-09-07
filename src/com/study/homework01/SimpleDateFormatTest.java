package com.study.homework01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) throws ParseException {
		//创建时间对象date，获取当前时间
		Date date = new Date();
		//创建格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a E");
		//格式化时间对象（把时间对象装华为字符串）
		String dateString = sdf.format(date);
		String dateString2 = sdf2.format(date);
		System.out.println(dateString);
		System.out.println(dateString2);
		//把字符串转化成时间对象
		//注意：paese转化的格式必须和声明的sdf的格式一致，不然会报错
		String str ="2022-08-27 19:43:04 下午 周六";
		//新建时间对象来接收字符串str转化成的对象
		Date date3 =sdf.parse(str);
		System.out.println(date3);
		
		
}
}
