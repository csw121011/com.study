package com.study;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * �ݹ鰸����
 * 		�ݹ������Ҫ����4�㣬��Ȼ���ܳ�����
 * @author csw12
 *
 */
public class DiGui {
	public static void main(String[] args) throws IOException {
				searchFile(new File("E:/"), "mp4");
	}
/**
 * ���󣺲���ָ���ļ��������MP4�ļ�
 * 			  file   ָ���ļ�
 * 			  suffix ָ����׺
 * @throws FileNotFoundException ����ļ����ļ��в����ھͱ���
 * @throws  NullPointerException �ļ����ļ���׺Ϊ�վͱ���
 */
	//��������ļ��ķ���
	public static void searchFile(File file,String suffix) throws FileNotFoundException,NullPointerException {
		
		if (file == null || suffix == null) {								//���ж�������ļ��������ļ���׺�ǲ���Ϊ�գ��վ��׳��쳣
			throw new NullPointerException("�ļ����ļ���׺����Ϊ�գ���");		//�׳��쳣
		}
		if (!file.exists()) {												//�ж�������ļ����ļ����Ƿ���ڣ������ھ��׳��쳣
			throw new FileNotFoundException("�ļ����ļ��в����ڣ���");		//�׳��쳣
		}
		File[] files= file.listFiles();										//��ȡfile�ļ�������������ļ����ļ���
		if (files != null && files.length != 0) {						//����ļ������������б���Ϊ�յģ��Ž���ѭ��
			for (File f : files) {											//ѭ���б�
				if (f.isDirectory()) {										//���file2��һ���ļ���
					searchFile(f, suffix);									//�ݹ��������searchFile����
				}else {
					String name = f.getName();								//��ȡ�ļ���
					//���Ұ���ָ���ַ����ļ�
					/*if (name.contains("��")) {
						System.out.println(f);
					}*/
					if (name.endsWith(suffix)) {							//����ָ����׺
						System.out.println(f);
					}
				}
			}

		}
	}
}
