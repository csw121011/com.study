package com.study.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * File过滤相关的方法：
 *		String[] list(FilenameFilter filter)		根据文件名过滤，返回字符串数组（数组里面装的文件名）
 * 		File[] listFile(FileFilter filter)			根据文件过滤，返回的是文件数组（数组里面装的是文件或文件夹）
 * 		File[] listFiles(FilenameFilter filter)		根据文件名过滤，返回的是文件数组（装的文件或者文件夹）
 * 
 * @author csw12
 *
 */
public class filefilter {
	public static void main(String[] args) {
		//创建fiel对象
		File file =new File("F:/a/b");
		
		String[] strings = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith("docx");
			}
		});
		System.out.println("String类FilenameFilter:"+Arrays.toString(strings));
		
		File[] listFiles = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith("docx");
			}
		});
		System.out.println("File类FileFilter:"+Arrays.toString(listFiles));
		
		File[] listFiles2 = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO 自动生成的方法存根
				return name.endsWith("docx");
			}
		});
		System.out.println("File类FilenameFilter:"+Arrays.toString(listFiles2));
	}
}
