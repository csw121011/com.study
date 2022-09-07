package com.study.test;

class isSuShu 
{
	public static void main(String[] args){
	
	
	
	   int count = 0;
	    for (int i = 2;i <= 100;i++ ){
	
			boolean num = true;
			

			for (int j = 2;j < i ;j++ ){
			
				if (i % j == 0){
					num = false;
					break;
				}
			}
				if (num){
			       System.out.print(i+"  ");
                   count = count + 1 ;
				   if (count % 5 == 0)
				   {System.out.println();
				   }
			    }
				
			
		}
		
		
	}

		
		
		
}