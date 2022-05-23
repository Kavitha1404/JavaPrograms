package controlflow;

import java.util.Scanner;

public class eligibleforvote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println(name +" is eligible for voting");
		}
		else {
			System.out.println(name +" is not eligible for voting");
		}
		
	}

}
