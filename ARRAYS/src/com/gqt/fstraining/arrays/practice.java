package com.gqt.fstraining.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of students:");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.println("Array is ready for operation");
//		System.out.println("Length of the array is "+arr.length);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter the marks of student - "+(i+1));
//			arr[i]=sc.nextInt();
//			
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("The marks of student - "+(i+1)+" is :"+arr[i]);
//		
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of colleges:");
//		int m =sc.nextInt();
//		System.out.println("Enter the number classrooms inside each college");
//		int n=sc.nextInt();
//		System.out.println("Enter the number students in each classrom");
//		int o=sc.nextInt();
//		
//		int arr[][][]=new int[m][n][o];
//		System.out.println("Array is ready for operation");
//		System.out.println("Length of the  outer array is "+arr.length);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("count no of classrooms in each college -"+(i+1));
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.println("count the number of student inside classroom no-"+(j+1));
//				for(int k=0;k<arr[i][j].length;k++) {
//					System.out.println("Enter the marks of each student-"+(k+1));
//					arr[i][j][k]=sc.nextInt();
//					
//				}
//				
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Inside college no-"+(i+1));
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.println("Inside classroom no-"+(j+1));
//				for(int k=0;k<arr[i][j].length;k++) {
//					System.out.println("The marks of student-"+(k+1)+" is :"+arr[i][j][k]);
//				}
//			}
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the number of your family members:");
//		int n =sc.nextInt();
//		String arr[]=new String[n];
//		System.out.println("Array is ready for operation");
//		System.out.println("Length of the array is "+arr.length);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter the name of member - "+(i+1));
//			arr[i]=sc.next();
//			
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("The name of student - "+(i+1)+" is : "+arr[i]);
//		}
		
		
		
		
//		int arr[]= {12,78,32,26,64,12,90};
//		int temp;
//		System.out.println("Before sorting the array");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
//		//logic for sorting
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//				
//			}
//				
//		}
//		System.out.println("After sorting the array displaying in ascending order");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("After sorting the array displaying  in descending  order");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
//		
		
//		
//		int arr[]= {12,78,32,26,64,12,90};
//		System.out.println("The elements in the  array are :");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		int max=arr[0];
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("The least element in the array is " +min);
//		System.out.println("The max element in the array is " +max);
//		
//		
//		
		
		
//		int arr1[][]= {{2,3}, {3,4}};
//		int arr2[][]= {{4,5}, {6,8}};
//		int res[][]=new int[arr1.length][arr1[0].length];
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				res[i][j]=arr1[i][j]+arr2[i][j];
//			}
//		}
//			for(int i=0;i<arr1.length;i++) {
//				for(int j=0;j<arr2.length;j++) {
//					System.out.println(res[i][j] +" ");
//					
//
//				}
//							
//		}
//			System.out.print(" ");
		
		
		
		
		
//		int arr1[][]= { {1,2},{4,7}};
//		int arr2[][]= { {14,12},{62,57}};
//		int res[][]=new int[arr1.length][arr1[0].length];
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//			 res[i][j]=arr2[i][j]+arr1[i][j];
//			}
//			
//		}
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//			 System.out.println(res[i][j]+" ");
//			}
//		}
//		System.out.println();
		
		
//		int arr1[][]= { {1,0,0} ,{0,1,0} ,{0,0,1} };
//		boolean res=true;
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				if(i==j && arr1[i][j]!=1) {
//					res=false;
//					break;
//				}
//				if(i!=j && arr1[i][j]!=0) {
//					res=false;
//					break;
//				}
//				
//					
//			}
//			
//		}
//		if(res==true) {
//			System.out.println("Given matrix is an identity matrix");
//		}
//		else {
//			System.out.println("Given matrix is not  an identity matrix");
//		}
//		
		
		
		
//		int arr1[][]= { {21,23},{12,14} };
//		int arr2[][]= { {21,13},{11,14} };
//		int r1,r2,c1,c2;
//		r1=arr1.length;
//		r2=arr2.length;
//		c1=arr1[0].length;
//		c2=arr2[0].length;
//		boolean res=true;
//		if(r1!=r2 ||c1!=c2) {
//			res=false;
//			System.out.println("Matrices are not equal");
//			System.exit(0);
//		}
//		else {
//			for(int i=0;i<arr2.length;i++) {
//				for (int j=0;j<arr2[i].length;j++) {
//					if(arr1[i][j]!=arr2[i][j]) {
//						res=false;
//						System.out.println("Matrices are not equal");
//						System.exit(0);
//						
//					}
//				}
//			}
//		}
//		if(res==true) {
//			System.out.println("Matrices are equal");
//		}
		
//		
//		float n[]= {1f,2f,3f,4f,5f};
//		System.out.println("Sum="+sum(n));		
//	}
//
//	public static float sum(float numbers[]) {
//		// TODO Auto-generated method stub
//		float sum=0;
//		for(float number:numbers) {
//			sum+=number;
//		}
//		return sum;
		
		
	//2) 
//	 int arr[]= {1,2,3,4,5,7,7};
//	 int sum=0;
//	 int size=arr.length;
//	 if(size%2!=0) {
//		 sum=arr[0]+arr[size/2]+arr[size-1];
//	 }
//	 else {
//		 sum=arr[0]+arr[size-1];
//	 }
//	 System.out.println("Sum = "+sum);
//		
		
		
		//3) 
//		int arr[]= {1 ,2 ,3 ,4, 5};
//		for(int i =arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]);
//		}
		
//		int arr1[]= {1,2,3,4};
//		int arr2[]= {3,4,6,7};
//		findcommon(arr1,arr2);
//		
//	}
//
//	public static void findcommon(int[] arr1, int[] arr2) {
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					System.out.println(arr2[j]);
//					
//				}
//			}
//		}
		
		
		// sorting
		
//	int [] arr= {12,15,7,6,9,12};
//	System.out.println(Arrays.toString(arr));
//	int temp;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++)
//			if(arr[i]>arr[j]) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		//swapping in an array:
//		int [] arr= {1,3,4,6,5,7};
//		swap(arr,1,3);
//	System.out.println(Arrays.toString(arr));
//		
//		
//	}
//
//	private static void swap(int[] arr, int index0, int index1) {
//		
//		int temp=arr[index0];
//		arr[index0]=arr[index1];
//		arr[index1]=temp;
//		
//		
//	}
		
//}
//		int [] arr= {1,3,4,6,5,7};
//		System.out.println(max(arr));
//		
//		
//	}
//
//	static int max(int[] arr) {
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//	
//	return max;
		
		
		
		
		
//		int [] arr= {1,3,4,6,5,7};
//		System.out.println(maxRange(arr, 1,3));
//		
//		
//	}
//
//	static int maxRange(int[] arr,int start,int end) {
//		int maxval=arr[start];
//		for(int i=start;i<end;i++) {
//			if(arr[i]>maxval) {
//				maxval=arr[i];
//			}
//		}
//	
//	return maxval;
		
		
		
		// Matrix addition

//		int [][]arr1= { {1,2,3},{4,5,6},{7,8,9}};
//		int [][]arr2= { {3,5,8,} ,{6,5,4},{4,6,8}};
//		int[][]res=new int[arr1.length][arr1[0].length];
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				res[i][j]=arr1[i][j]+arr2[i][j];
//			}
//		}
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				System.out.print(res[i][j]+" ");
//		
//			}
//			System.out.println();
//			
//		}
		
		
		
		
		
		//Identity matrix
//		int [][]arr= { {1,0,0},{0,1,0},{0,0,1}};
//		boolean res=true;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				if(i==j && arr[i][j]!=1)
//				 {
//					res=false;
//					break;
//					
//				}
//				if(i!=j && arr[i][j]!=0) {
//					res=false;
//					break;
//				}
//			}
//		}
//		if(res==true) {
//			System.out.println("Identity matrix");
//			
//		}
//		else {
//			System.out.println("Not an Identity matrix");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		// Equality of matrices
//		int arr1[][]= {{21,23},{24,25}};
//		int arr2[][]= {{21,22},{24,25}};
//		boolean res=true;
//		int r1,r2,c1,c2;
//		r1=arr1.length;
//		r2=arr2.length;
//		c1=arr1[0].length;
//		c2=arr2[0].length;
//		if(r1!=r2 ||c1!=c2) {
//			res=false;
//			System.out.println("Matrices are not equal");
//			System.exit(0);
//			
//		}
//		else {
//			for(int i=0;i<arr1.length;i++) {
//				for(int j=0;j<arr1[0].length;j++) {
//					if(arr1[i][j]!=arr2[i][j]) {
//						System.out.println("Matrices are not equal");
//						System.exit(0);
//					}
//				}
//			}
//		}
//		if(res==true) {
//			System.out.println("Matrices are equal");
//		}
//		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
	}	
}