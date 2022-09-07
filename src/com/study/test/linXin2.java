package com.study.test;

import java.util.Scanner;
public class linXin2{
    
	public static void main(String []args){
	  System.out.println("欢迎使用菱形打印系统");
	    System.out.print("请问你要打印多少行的菱形？请输入单数：");
		
	  Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i=1;i<=(n+1)/2;i++){
        for(int j = 1;j <= (n+1)/2-i+1;j ++){
            System.out.print("*");
		}
		for(int k = 1;k <= 2*i-1 ;k++){
		    System.out.print(" ");
		}
		 for(int m = 1;m <= (n+1)/2-i+1;m ++){
            System.out.print("*");
		}
	    System.out.println();
	  	     
	  }
	  for(int i = 0;i <(n-1)/2 ;i++){
	    for(int j = 0;j <= i+1;j++){
	        System.out.print("*");
		}
		for(int k = 0;k < n-2-2*i ;k++){
		    System.out.print(" ");
		}
		for(int l = 0;l <= i+1;l++){
	        System.out.print("*");
		}
		  System.out.println();
	  }





    }
}