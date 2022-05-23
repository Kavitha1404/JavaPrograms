/**
 * 
 */
package com.gqt.fstraining.arrays;

import java.util.Scanner;

/**
 * @author s
 *description: This is the code for demonstration of 2-dimensional  jagged array
 *@requirement To store marks of n student from m classrooms
 *
 *class   : 0	1	2	3
 * student :1	2	3	4
 */
public class Arrays2Djagged {

	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param m
	 * @param n
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of class-rooms: ");
		int m=sc.nextInt();
		int arr[][]=new int[m][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the total number of students in class-rooms: "+(i+1));
			arr[i]=new int[sc.nextInt()];
		}
		System.out.println("Arrays is ready for the operation ");
		System.out.println("The length of outer portion of the array :"+arr.length);
		
		//code to store the marks of n students inside them-classrooms
		for(int i=0;i<arr.length;i++) {
			System.out.println("The  count of students inside class-"+(i+1)+" is:"+arr[i].length);
			for(int j=0;j < arr [i].length;j++) {
				System.out.println("Enter the marks of student -"+(j+1));
				arr[i][j]=sc.nextInt();
				
			}
		}
		//code to display the marks
		for(int i=0; i < arr.length;i++) {
			System.out.println("Inside class -"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of student - "+(j+1)+" is :"+arr[i][j]);
			}
		}

	}

}
