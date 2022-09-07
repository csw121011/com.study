package com.study.file;
import java.io.File;
import java.io.IOException;
/**
 * File常见的方法：
 * 		1.boolean createNewFile()  创建文件（如果路径不存在则报错）
 * 		2.boolean delete()			删除文件或文件夹
 * 		3.boolean exists()			判断文件或文件夹是否存在
 * 		4.String getName()			获取文件名或文件夹名
 * 		5.File getParentFile()		获取父目录，当前文件或文件夹所在目录
 * 		6.String getPath()			获取文件或文件夹路径，创建是填什么，这里就是什么
 * 		7.boolean mkdirs()			创建文件夹，一次性创建多个比如创建A，然后A下创建B···直到最后一个,注意创建的都是文件夹
 * 		8.boolean  isDirectory      判断是否是文件夹
 * 		9.boolean isFile()			判断是否是文件
 * @author csw12
 */
public class FileTest02 {
	public static void main(String[] args) throws IOException {
		//创建File对象
		File file = new File("F:/a/b/c.txt");
		//创建文件
		boolean createNewFile = file.createNewFile();
		System.out.println("创建文件是否成功："+createNewFile);
		//判断是否是文件夹
		boolean directory = file.isDirectory();
		System.out.println("是否是文件夹："+directory);
		//判断是否是文件
		boolean file2 = file.isFile();
		System.out.println("是否是文件："+file2);
		//删除该文件
		//file.delete();
		//验证文件或文件夹是否存在
		boolean exists = file.exists();
		System.out.println("文件是否存在:"+exists);
		//获取文件名
		String name = file.getName();
		System.out.println("文件名："+name);
		//获取父路径
		File parentFile = file.getParentFile();
		System.out.println("父文件夹："+parentFile);
		//获取路径
		String path = file.getPath();
		System.out.println("文件路径："+path);
		//创建文件夹，一次性创建多个
		boolean mkdirs = file.mkdirs();
		System.out.println("文件夹是否创建成功："+mkdirs);
	}
}
