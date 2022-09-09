package com.study.thread;

/**
 * �̵߳�һЩ��ȡ��Ϣ������
 *
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {

        Thread main = Thread.currentThread();//��ȡ��ǰ�̣߳���ֵ��thread���Ͷ���main
        String name = main.getName();//.getName�ŷ�����ȡmain�̵߳�����
        System.out.println(name);

        long id =main.getId();//.getId��������ȡmain�̵߳�id��ÿ���̶߳���Ψһ��id
        System.out.println(id);

        int priority = main.getPriority();//*.getPriority��������ȡmain�̵߳����ȼ�
        System.out.println(priority);

        boolean isInterrupted = main.isInterrupted();//�Ƿ��ж�
        boolean daemon = main.isDaemon();//�Ƿ�Ϊ�ػ��߳�
        boolean alive = main.isAlive();//�Ƿ����
        System.out.println(isInterrupted+"\\n"+daemon+"\\n"+alive);

    }
}
