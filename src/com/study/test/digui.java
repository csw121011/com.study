package com.study.test;

 class digui{
      public static void main(String []args){
        int i = 5;
		int sum = jiecheng(i);
		  System.out.println(sum);


      
      }
    /*  public static int jiecheng(int i){   //不使用递归
        int result = 0;
		for(int n = 1;n<=i;n++){
		    result += n;
		
		   }
           return result;
      
      }*/
      public static int jiecheng(int i){    //使用递归
		if (i == 1){
		   return 1 ;
		}
	    return i*jiecheng(i-1);
      }


}   


  