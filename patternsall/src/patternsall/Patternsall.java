package patternsall;
//  1)*****
public class Patternsall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++)
//			System.out.print("*");
		
		
		
//		// 2) *
//			  *
//			  *
//			  *
//			  *
//	for(int i=0;i<10;i++){
//		System.out.println("*");
//	}
//		
		
		
		
//		3) *****
//		   *****
//		   *****
//		   *****
//		   *****
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(" *");
//			}
//			System.out.println(" ");
//		}
//		
//		4) *
//		   **         
//		   ***
//		   ****
//		   *****
		

//		for(int i=0;i<5;i++){
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
//		5) *****
//		   ****
//		   ***
//		   **
//		   *
		   
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
//		6)   1 1 1 1 1
//           2 2 2 2 2
//           3 3 3 3 3
//           4 4 4 4 4
//           5 5 5 5 5
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(i);
//			}
//			System.out.println(" ");
//		}
		
//		7)  1 2 3 4 5
//			1 2 3 4 5
//			1 2 3 4 5
//			1 2 3 4 5
//			1 2 3 4 5
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j);
//				System.out.print(" ");
//			}
//			System.out.println(" ");
//		}
//		
		
		
//		8)   1 2 3 4 5 
//			 6 7 8 9 10
//			 11 12 13 14 15
//			 16 17 18 19 20
//			 21 22 23 24 25
		
		
//		int count=1;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(count);
//				System.out.print(" ");
//				count++;
//			}
//			System.out.println(" ");
//		}
		
		
		
		
//		9)  25 24 23 22 21
//			20 19 18 17 16 
//			15 14 13 12 11 
//			10 9 8 7 6 
//			5 4 3 2 1
		
//		int count=25;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(count);
//				System.out.print(" ");
//				count--;
//			}
//			System.out.println(" ");
//		}
//		10) 1 6 11 16 21 
//			2 7 12 17 22
//			3 8 13 18 23 
//			4 9 14 19 24
//			5 10 15 20 25
//		
	
//	    int count;      
//		for(int i=1;i<=5;i++) {
//			count =i;
//			for(int j=1;j<=5;j++) {
//				System.out.print(count);
//				System.out.print(" ");
//				count=count+5;
//				
//			}
//			
//			System.out.println(" ");
//		}
		
		
		
	
		
//		11)  01 02 03 04 05 
//			 06 07 08 09 10
//			 11 12 13 14 15
//			 16 17 18 19 20
//			 21 22 23 24 25
			 
			 
				
//			 int count=1;
//				for(int i=1;i<=5;i++) {
//					for(int j=1;j<=5;j++) {
//						if(count<10) {
//							System.out.print("0");
//							System.out.print(count);
//							System.out.print(" ");
//							count++;
//							
//						}
//						else {
//							System.out.print(count);
//							System.out.print(" ");
//							count++;
//						}
//						
//						
//					}
//					System.out.println(" ");
//				}
//		12) 1 1 1 1 1
//			0 0 0 0 0 
//			1 1 1 1 1
//			0 0 0 0 0 
//			1 1 1 1 1 
			
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(i%2==0) {
//					System.out.print("0");
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("1");
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();	
//		}
		
//	       13) 1 0 1 0 1
//			   1 0 1 0 1
//			   1 0 1 0 1
//			   1 0 1 0 1
//			   1 0 1 0 1
//		
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j%2==0) {
//					System.out.print("0");
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("1");
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();	
//		}
//		
		
//	  14)	$ $ $ $ $ * * * * * 
//		    $ $ $ $ $ * * * * * 
//		    $ $ $ $ $ * * * * * 
//		    $ $ $ $ $ * * * * * 
//		    $ $ $ $ $ * * * * * 

		
	
//			for(int i=0;i<5;i++) {
//				for(int j=0;j<5;j++) {
//					System.out.print("$");
//					System.out.print(" ");
//				}
//				for(int j=0;j<5;j++) {
//					System.out.print("*");
//					System.out.print(" ");
//				}
//				System.out.println();
//					
//			}
//	15)	$ $ $ $ $ * * * * * 
//		$ $ $ $ * * * * *
//		$ $ $ * * * * *
//		$ $ * * * * *
//		$ * * * * *
		
		
		
//		for(int i=0;i<5;i++) {
//			for(int j=5;j>i;j--) {
//				System.out.print("$");
//				System.out.print(" ");
//			}
//			for(int j=0;j<5;j++) {
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println();
//		
//	}
		
		
		
//		16)   $ * * * * *
//            $ $ * * * * * 
//            $ $ $ * * * * *
//            $ $ $ $ * * * * *
//            $ $ $ $ $ * * * * *
		
		
		
//            for(int i=0;i<5;i++) {
//    			for(int j=0;j<=i;j++) {
//    				System.out.print("$");
//    				System.out.print(" ");
//    			}
//    			for(int j=0;j<5;j++) {
//    				System.out.print("*");
//    				System.out.print(" ");
//    			}
//    			System.out.println();
//    		
//
//	}
//	    17) * * * * * 
//			* - - - *
//			* - - - *
//			* - - - *
//			* * * * *
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				if(i==0||j==0||i==4||j==4) {
//					System.out.print("*");
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("-");
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		18)  *
//			 * *
//			 * @ *
//			 * @ @ *
//			 * * * * *
         
		
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<=i;j++) {
//				if(j==0 ||i==4 || i==j ) {
//					System.out.print("*");
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("@");
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
		
//  19)	01 
//		02 07 
//		03 08 13 
//		04 09 14 19 
//		05 10 15 20 25 
		
//		int count;
//		for(int i=1;i<=5;i++) {
//			count=i;
//			for(int j=1;j<=i;j++) {
//				if(count<10) {
//					System.out.print("0");
//					System.out.print(count);
//					System.out.print(" ");
//					count=count+5;
//				}
//				else {
//				   System.out.print(count);
//				   System.out.print(" ");
//				   count=count+5;
//				}
//			}
//			System.out.println();
//		}
		
		
//		
//		20) 
//	          * 
//	        * * * 
//	      * * * * * 
//	    * * * * * * * 
//	  * * * * * * * * * 
//
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println();
//		
//		}
//		 
		
		
		
//	21)	 * * * * * * * * * 
//		    * * * * * * * 
//		      * * * * * 
//		        * * * 
//		          * 
		
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//				System.out.print(" ");
//			}
//			for(int j=1;j<=11-2*i;j++) {
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println();
//		
//		}
		
//	22)	- - - - - * 
//		- - - - * - * 
//		- - - * - - - * 
//		- - * - - - - - * 
//		- * * * * * * * * * 
//		
//		
		
		

//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("-");
//				System.out.print(" ");
//				
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				if(i==1||i==5 || j==1 ||j==(2*i-1)) {
//					System.out.print("*");
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("-");
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	
		
//	23)	-  -  -  -  -  * 
//		-  -  -  -  * * * 
//		-  -  -  * * * * * 
//		-  -  * * * * * * * 
//		-  * * * * * * * * * 
//		- * * * * * * * * * 
//		- - * * * * * * * 
//		- - - * * * * * 
//		- - - - * * * 
//		- - - - - * 
//      for(int i=1;i<=5;i++) {
//    	  for(int j=5;j>=i;j--) {
//    		  System.out.print("- ");
//    		  System.out.print(" ");
//    	  }
//    	  for(int j=1;j<=2*i-1;j++) {
//    		  System.out.print("*");
//    		  System.out.print(" ");
//    	  }
//    	  System.out.println();
// 
//      }
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("-");
//				System.out.print(" ");
//			}
//			for(int j=1;j<=11-2*i;j++) {
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

  }
}

