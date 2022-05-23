/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;
/**
 * @author s
 *
 */
public class arrays4D {

	/**
	 * @param args
	 * description: This is the code for demonstration of 3-dimensional array
     *@requirement To store marks of n students from m class-rooms and o colleges 
     *
    
     *university :     0                      1
     * college :  0       1              0         1
     * class   : 0	1	0	1	2	0  1  2  3  0  1  2
     * student : 1	2	3	4	2	2  2  1  3  1  2  3  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of University: ");
		int p=sc.nextInt();
		
		int arr[][][][]=new int[p][][][];
		//collecting the college count
				for(int i=0;i<arr.length;i++) {
					System.out.println("Enter the total number of  collleges in universities:"+(i+1));
					arr[i]=new int[sc.nextInt()][][];
					
				}
				//collecting the class  count
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside the university : "+(i+1));
					for(int j=0;j<arr[i].length;j++) {
					     System.out.println("Enter the total number of  classrooms in college:"+(j+1));
					      arr[i][j]=new int[sc.nextInt()][];
					
				}
				}
					//collecting the student count
					for(int i=0;i<arr.length;i++) {
						System.out.println("Inside the college : "+(i+1));
						for(int j=0;j<arr[i].length;j++) {
						     System.out.println("Inside the classroom :"+(j+1));
						     for(int k=0;k<arr[i][j].length;k++) {
						    	 System.out.println("Enter the total number of students in classroom: "+(k+1));
						    	 arr[j][k]=new int[sc.nextInt()][];
					     }
						}
						    	 
						   
						    	 
						     }
						     // code for collecting marks
					for(int i=0;i<arr.length;i++) { //---->university
						System.out.println("Inside the university :"+i);
						for(int j=0;j<arr[i].length;j++) { //-------->college
							System.out.println("Inside the college : +j");
							for(int k=0;k<arr[i][j].length;k++) { //------->class
				              System.out.println("Inside the class : +k");
				              for(int l=0;l<arr[i][j][k].length;l++) {
				            	  System.out.println("Enter the marks of student :"+(l+1));
				            	  arr[i][j][k][l] = sc.nextInt();
				              }
							}
						 }
					     // code for printing  marks
				for(int m=0;m<arr.length;m++) { //---->university
					System.out.println("Inside the university :"+i);
					for(int j=0;j<arr[m].length;j++) { //-------->college
						System.out.println("Inside the college : +j");
						for(int k=0;k<arr[m][j].length;k++) { //------->class
			              System.out.println("Inside the class : +k");
			              for(int l=0;l<arr[m][j][k].length;l++) {
			            	  System.out.println("The marks of student -"+(l+1)+" marks is : "+arr[i][j][k][l]);
			            	  
			              }
						}
					}
				
				
			           
						
					
						
								
								
								
								
	}

}
	}
}