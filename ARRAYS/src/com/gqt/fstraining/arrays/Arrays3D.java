/**
 * 
 */
package com.gqt.fstraining.arrays;
import java.util.Scanner;

/**
 * @author Kavi
 *description: This is the code for demonstration of 3-dimensional array
 *@requirement To store marks of n students from m class-rooms and o colleges 
 *
 * college :  0       1       2
 * class   : 0	1	0	1	0	1
 * student : 2	2	2	2	2	2
 */
public class Arrays3D {

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
		System.out.println("Enter the count of classes in each college: ");
		int n=sc.nextInt();
		System.out.println("Enter the count of students in each classes of each college: ");
		int o=sc.nextInt();
		
		int arr[][][] =new int [m][n][o];
		
		//code for collecting marks
		for(int i=0;i<arr.length;i++) { //---->college
			System.out.println("Inside the college :"+i);
			for(int j=0;j<arr[i].length;j++) { //-------->class
				System.out.println("Inside the class : "+j);
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
