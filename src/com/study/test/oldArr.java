package com.study.test;

public class oldArr {
	
	    public static void main (String []args){
	    	int  oldArr [] ={1,3,4,5,0,0,6,6,5,4,7,6,7,0,5};
            int count = 0 ;
	            for(int i = 0;i < oldArr.length;i++)
	            {
	                if(oldArr[i] != 0)
	                {
	                   count += 1;
	                }
	            }
	          int[] newArr = new int[count];
	          int k = 0;
	          for(int j = 0;j < oldArr.length;j++) {
	        	  if(oldArr[j] != 0) {
	        		  newArr[k] = oldArr[j];
	        		  k++;
	        	  }
	          }
	          System.out.print("newArr{");
	          for(int m = 0;m<newArr.length;m++) {
	        	  System.out.print(+newArr[m]+",");
	          }
	          System.out.println("}");
	    }
}
	           


