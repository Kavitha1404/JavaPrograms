

package com.gqt.fstraining.arrays;
import java.util.Scanner;

/**
 * @author Kavi
 *description: This is the code for demonstration of 1-dimensional array
 *@requirement To store marks of n student 
 */
public class Array1D {

	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number of students:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Array is ready for operation");
		System.out.println("The length of the given array is :"+arr.length);
		// The code is to collect and store marks of n students
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student - " +(i+1));
			arr[i]=sc.nextInt();
		}
		// The code is to display the marks of students
		for(int i=0;i<arr.length;i++) {
			System.out.println(" The marks of student - "+(i+1)+" is : "+arr[i]);
		}
	}

}
