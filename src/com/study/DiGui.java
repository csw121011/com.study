package com.study;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 递归案例：
 * 		递归层数不要超过4层，不然性能超级慢
 * @author csw12
 *
 */
public class DiGui {
	public static void main(String[] args) throws IOException {
				searchFile(new File("E:/"), "mp4");
	}
/**
 * 需求：查找指定文件夹下面的MP4文件
 * 			  file   指定文件
 * 			  suffix 指定后缀
 * @throws FileNotFoundException 如果文件或文件夹不存在就报错
 * @throws  NullPointerException 文件或文件后缀为空就报错
 */
	//定义查找文件的方法
	public static void searchFile(File file,String suffix) throws FileNotFoundException,NullPointerException {
		
		if (file == null || suffix == null) {								//先判断输入的文件名或者文件后缀是不是为空，空就抛出异常
			throw new NullPointerException("文件或文件后缀不能为空！！");		//抛出异常
		}
		if (!file.exists()) {												//判断输入的文件或文件夹是否存在，不存在就抛出异常
			throw new FileNotFoundException("文件或文件夹不存在！！");		//抛出异常
		}
		File[] files= file.listFiles();										//获取file文件夹下面的所有文件和文件夹
		if (files != null && files.length != 0) {						//如果文件夹下面是有列表，不为空的，才进行循环
			for (File f : files) {											//循环列表
				if (f.isDirectory()) {										//如果file2是一个文件夹
					searchFile(f, suffix);									//递归继续调用searchFile方法
				}else {
					String name = f.getName();								//获取文件名
					//查找包含指定字符的文件
					/*if (name.contains("苍")) {
						System.out.println(f);
					}*/
					if (name.endsWith(suffix)) {							//查找指定后缀
						System.out.println(f);
					}
				}
			}

		}
	}
}
