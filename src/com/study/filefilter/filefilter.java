package com.study.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * File������صķ�����
 *		String[] list(FilenameFilter filter)		�����ļ������ˣ������ַ������飨��������װ���ļ�����
 * 		File[] listFile(FileFilter filter)			�����ļ����ˣ����ص����ļ����飨��������װ�����ļ����ļ��У�
 * 		File[] listFiles(FilenameFilter filter)		�����ļ������ˣ����ص����ļ����飨װ���ļ������ļ��У�
 * 
 * @author csw12
 *
 */
public class filefilter {
	public static void main(String[] args) {
		//����fiel����
		File file =new File("F:/a/b");
		
		String[] strings = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith("docx");
			}
		});
		System.out.println("String��FilenameFilter:"+Arrays.toString(strings));
		
		File[] listFiles = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith("docx");
			}
		});
		System.out.println("File��FileFilter:"+Arrays.toString(listFiles));
		
		File[] listFiles2 = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO �Զ����ɵķ������
				return name.endsWith("docx");
			}
		});
		System.out.println("File��FilenameFilter:"+Arrays.toString(listFiles2));
	}
}
