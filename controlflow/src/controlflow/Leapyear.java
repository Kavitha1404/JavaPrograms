package controlflow;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year to find the leap year or not");
		int n=sc.nextInt();
		if(n%400==0) {
			System.out.printf("%d is leap year\n",n);
		}
		else if(n%100==0) {
			System.out.printf("%d is not a leap year\n",n);
		}
		else if(n%4==0) {
			System.out.printf("%d is a leap year\n",n);
		}
		else {
			System.out.printf("%d is not a leap year");
		}
			
	}

}
