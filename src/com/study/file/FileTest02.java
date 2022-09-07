package com.study.file;
import java.io.File;
import java.io.IOException;
/**
 * File�����ķ�����
 * 		1.boolean createNewFile()  �����ļ������·���������򱨴�
 * 		2.boolean delete()			ɾ���ļ����ļ���
 * 		3.boolean exists()			�ж��ļ����ļ����Ƿ����
 * 		4.String getName()			��ȡ�ļ������ļ�����
 * 		5.File getParentFile()		��ȡ��Ŀ¼����ǰ�ļ����ļ�������Ŀ¼
 * 		6.String getPath()			��ȡ�ļ����ļ���·������������ʲô���������ʲô
 * 		7.boolean mkdirs()			�����ļ��У�һ���Դ���������紴��A��Ȼ��A�´���B������ֱ�����һ��,ע�ⴴ���Ķ����ļ���
 * 		8.boolean  isDirectory      �ж��Ƿ����ļ���
 * 		9.boolean isFile()			�ж��Ƿ����ļ�
 * @author csw12
 */
public class FileTest02 {
	public static void main(String[] args) throws IOException {
		//����File����
		File file = new File("F:/a/b/c.txt");
		//�����ļ�
		boolean createNewFile = file.createNewFile();
		System.out.println("�����ļ��Ƿ�ɹ���"+createNewFile);
		//�ж��Ƿ����ļ���
		boolean directory = file.isDirectory();
		System.out.println("�Ƿ����ļ��У�"+directory);
		//�ж��Ƿ����ļ�
		boolean file2 = file.isFile();
		System.out.println("�Ƿ����ļ���"+file2);
		//ɾ�����ļ�
		//file.delete();
		//��֤�ļ����ļ����Ƿ����
		boolean exists = file.exists();
		System.out.println("�ļ��Ƿ����:"+exists);
		//��ȡ�ļ���
		String name = file.getName();
		System.out.println("�ļ�����"+name);
		//��ȡ��·��
		File parentFile = file.getParentFile();
		System.out.println("���ļ��У�"+parentFile);
		//��ȡ·��
		String path = file.getPath();
		System.out.println("�ļ�·����"+path);
		//�����ļ��У�һ���Դ������
		boolean mkdirs = file.mkdirs();
		System.out.println("�ļ����Ƿ񴴽��ɹ���"+mkdirs);
	}
}
