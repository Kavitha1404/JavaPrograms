/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;

/**
 * @author s
 **description: This is the code for demonstration of 3-dimensional  jagged array
 *@requirement To store marks of n students from m class-rooms and o colleges 
 *
 * college :  0         1             2   
 * class   : 0	1	0	1   2	0  1  2  3
 * student : 1	2	3	4	2	2  2  2  3
 */
public class Array3Djagged {

	/**
	 * @param args
	 * @param sc
	 * @param m
	 * @param n
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of college: ");
		int m=sc.nextInt();
		
		int arr[][][] =new int[m][][];
		
		//collecting the class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the total number of class-rooms in colllege:"+(i+1));
			arr[i]=new int[sc.nextInt()][];
			
		}
		//collecting the student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the college : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			     System.out.println("Enter the total number of students in classrooms:"+(j+1));
			      arr[i][j]=new int[sc.nextInt()];
			
		}

	}
		//code for collecting marks 
		for(int i=0;i<arr.length;i++) { //---->college
			System.out.println("Inside the college :"+i);
			for(int j=0;j<arr[i].length;j++) { //-------->class
				System.out.println("Inside the class : +j");
				for(int k=0;k<arr[i][j].length;k++) { //------->students
					System.out.println("Enter the marks of student :"+(k+1));
					arr[i][j][k] = sc.nextInt();
				
			}
		}
		
		}
		//code for printing marks
				for(int i=0;i<arr.length;i++) { //----> college
					System.out.println("Inside the college :"+i);
					for(int j=0;j<arr[i].length;j++) {//------>class
						System.out.println("Inside the class : +j");
						for(int k=0;k<arr[i][j].length;k++) { //-------->students
							System.out.println("The marks of student -"+(k+1)+" marks is : "+arr[i][j][k]);
					
	}
}
}
	}

}
