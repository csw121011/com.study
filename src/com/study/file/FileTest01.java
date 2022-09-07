package com.study.file;

import java.io.File;

/**
 *
 * 		File(File parent,String child)
 * 		File(String pathname)
 * 		File(String parent,String child)
 * 
 */

public class FileTest01 {
	public static void main(String[] args) {
		//???????File???????????????????????????????????
		//???1
		File file1 = new File("D:/a/b/c.txt");
		System.out.println(file1);
		
		//???2
		File file2 = new File("D:/a/b","c/d.txt");
		System.out.println(file2);
		
		//???3
		File file3 = new File(new File("D:/a/b/c"),"d/e.txt");
		System.out.println(file3);
		
	}
}
