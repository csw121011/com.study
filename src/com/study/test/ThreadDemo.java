package com.study.test;

public class ThreadDemo {

	public static void main(String[] args) {
	    ThreadTest t = new ThreadTest();
	    Thread tt = new Thread(t);
	    Thread ttt = new Thread(t);
	   // tt.setDaemon(true);
	    tt.start();
	    ttt.start();
	    try 
	    {
	    	Thread.sleep(5);
	    }catch(InterruptedException e ) {
	    	e.printStackTrace();
	    }

	}

}
class ThreadTest implements Runnable{
	public void run() {
		for(int i = 0 ;i < 50;i++) {
			System.out.println(i+" "+Thread.currentThread().getName()+" isrunning");
		}
	}
}
