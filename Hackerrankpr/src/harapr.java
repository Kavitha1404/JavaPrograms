import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;

public class harapr {

private static final String pattern = null;

//	private static final String pattern = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		if(n%2!=0){
//	        System.out.println("Weird");
//	    }
//	    else if(n>=2 && n<=5){
//	        System.out.println("Not Weird");
//	        
//	    }
//	    else if(n>=6 &&n<=20){
//	        System.out.println("Weird");
//	        
//	    }
//	    else{
//	        System.out.println("Not Weird");
//	    }   
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int i=sc.nextInt();
//		Double d=sc.nextDouble();
//		String s=sc.next();
//		System.out.println("String: ="+s);
//		System.out.println("Double: ="+d);
//		System.out.println("Integer: ="+i);
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("-----------------------");
//		for(int i=0;i<3;i++) {
//			String s1=sc.next();
//			int n=sc.nextInt();
//			System.out.printf("%-15s%03d\n",s1,n);
//	}
//		System.out.println("-------------------------");
//		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int res;
//		
//		for(int i=1;i<=10;i++) {
//			res=n*i;
//			System.out.printf("%d x %d =%d\n",n,i,res);
//		}
		
		
//		Scanner sc=new Scanner(System.in);
//		int x=sc.nextInt();
//		for(int i=0;i<x;i++) {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			int n=sc.nextInt();
//			for(int j=0;j<n;j++) {
//				a=a+((int)Math.pow(2, j)*b);
//				System.out.print(a+" ");
//			}
//			System.out.println(" ");
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			try {
//			Long x= sc.nextLong();
//			System.out.println(x+"can be fitted in:");
//			if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) 
//				System.out.println("* byte");
//			if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
//				System.out.println("* Short");
//			if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
//				System.out.println("* int");
//			if(x>=Long.MIN_VALUE && x<= Long.MAX_VALUE)
//				System.out.println("* long");	
//		}
//			catch(Exception e) {
//				System.out.println(sc.next()+"cannot be fitted anywhere");
//				
//			}
//		}
//		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.next();
//		int i=1;
//		while(sc.hasNext()) {
//			System.out.println(i+" "+sc.nextLine());
//			i++;
//			
//		}
//		
		
		// Static block initializer
//		
//		Scanner sc=new Scanner(System.in);
//		int B= sc.nextInt();
//		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		String s=Integer.toString(n);
//		if(n==Integer.parseInt(s)) {
//			System.out.println("Good Job");
//			
//		}
//		else {
//			System.out.println("Wrong answer");
//			
//		}
		
		
		
		
		
// 	  public class DaysOfWeekFromDate {
//		public String daysofweek(int day,int month,int year) {
//			Calendar c=Calendar.getInstance();
//			c.set(year, month-1, day);
//			String[]days=new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//			int n=c.get(c.DAY_OF_WEEK);
//			return(days[n-1]);
//			
//			
//		}
//		public static void main(String[]args) {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter the day:");
//			String str=sc.nextLine();
//			int day=Integer.parseInt(str.substring(0, 2));
//			int month=Integer.parseInt(str.substring(3, 5));
//			int year=Integer.parseInt(str.substring(6, 10));
//			 DaysOfWeekFromDate obj=new  DaysOfWeekFromDate();
//			 System.out.println(obj.daysofweek(day, month, year));
//			
//		}
	//}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		double payment=sc.nextDouble();
//		String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//		String india=NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(payment);
//		String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//		String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//		System.out.println("Us "+us);
//		System.out.println("India "+india);
//		System.out.println("china "+china);
//		System.out.println("France "+france);
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		String A=sc.next();
//		String B=sc.next();
//		System.out.println(A.length()+B.length());
//		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+' '+B.substring(0, 1).toUpperCase()+B.substring(1));
//		System.out.println(A.compareTo(B)<=0 ? "No" :"yes");
		
		
		
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		int start=sc.nextInt();
//		int end =sc.nextInt();
//		System.out.println(str.substring(start,end));
		
		
		// Substring comparisions
		
		
		
		
		
		
		
//	Scanner sc=new Scanner(System.in);
//	String A=sc.next();
//	String B="";
//	for(int i=A.length()-1;i>=0;i--) {
//		B=B+A.charAt(i);
//	}
//		if(A.equals(B)==true) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("Not a palindrome");
//		}
//	
	
		
		
//		Scanner sc=new Scanner(System.in);
//		String s1=sc.next();
//		String s2=sc.next();
//		s1=s1.replace(" ", "").toLowerCase();
//		s2=s2.replace(" ", "").toLowerCase();
//		char[]c=s1.toCharArray();
//		char[]d=s2.toCharArray();
//		Arrays.sort(c);
//		Arrays.sort(d);
//		Boolean res=Arrays.equals(c, d);
//		if(res==true)
//		{
//			System.out.println("Strings are Anagrams");
//		}
//		else {
//			System.out.println("Strings are not anagrams");
//		}
//		
		
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		s=s.trim();
//		if(s.length()==0) {
//			System.out.println(0);
//			return;
//		}
//		String[] words =s.split("[^A-Za-z]");
//		System.out.println(words.length);
//		for(String word :words)
//			System.out.println(word);
		
		
		
		
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		while(testCases>0){
//			String pattern = in.nextLine();
//          	//Write your code
//              try{
//                 Pattern.compile(pattern);
//                  System.out.println("Valid");
//                  
//                  
//              }
//              catch(Exception ex)
//              {
//                System.out.println("Invalid");  
//              }
//              testCases--;
//		}
//		
		
		
		
		
		
		
     }
}

		
		
		
		
		
		
	
	



