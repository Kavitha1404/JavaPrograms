package controlflow;

import java.util.Scanner;

public class greatestofthree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.printf("%d is largest number",n1);
		}
		else if(n2>n3) {
			System.out.printf("%d is the largest number",n2);
		}
		else {
			System.out.printf("%d is largest number",n3);
		}
	}

}
