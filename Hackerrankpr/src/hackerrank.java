
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;


 //public class hackerrankpr {
//	private static final  Scanner scanner = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		System.out.println("Hello, World.");
////	     System.out.println("Hello, Java.");
////	     
////	     
////	     //2) 
////	     Scanner scan = new Scanner(System.in);
////	        int a = scan.nextInt();
////	        int b = scan.nextInt();
////	        int c = scan.nextInt();
////	        
////	        scan.close();
////	        
////	        System.out.println(a);
////	        System.out.println(b);
////	        System.out.println(c);
//	        //3)
//		
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//	        
//	        int n = scanner.nextInt();
//	        
//	        if(n%2!=0){
//	            System.out.println("Weird");
//	        }
//	        else if(n>=2 && n<=5){
//	            System.out.println("Not Weird");
//	            
//	        }
//	        else if(n>=6 &&n<=20){
//	            System.out.println("Weird");
//	            
//	        }
//	        else{
//	            System.out.println("Not Weird");
//	        }   
////	}
//
//}

//12)
// public class DaysOfWeekFromDate{
//	public String daysofweek(int day,int month,int year) {
//		Calendar c=Calendar.getInstance();
//		c.set(year, month-1,day);
//		String[]days=new String[] {"Sunday" ,"Monday" ,"Tuesday","Wednesday" , "Thursday" , "Friday"  ,"Saturday"};
//		int n=c.get(c.DAY_OF_WEEK);
//		return (days[n-1]);
//		
//	}
//	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the date(dd:mm:yyyy- ");
//		String str=sc.nextLine();
//		int day=Integer.parseInt(str.substring(0, 2));
//		int month=Integer.parseInt(str.substring(3, 5));
//		int year=Integer.parseInt(str.substring(6, 10));
//		 DaysOfWeekFromDate obj=new   DaysOfWeekFromDate();
//		 System.out.println(obj.daysofweek(day,month,year));
//		
//	}
//}


public class hackerrank {
	

public static void main(String[]args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Double to convert into currency:");
//	double payment = sc.nextDouble();
//	sc.close();
//	String us = NumberFormat.getInstance(Locale.US).format(payment);
//	String india=NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(payment);
//	String china = NumberFormat.getInstance(Locale.CHINA).format(payment);
//	String france= NumberFormat.getInstance(Locale.FRANCE).format(payment);
//	System.out.println("Us: " +us);
//	System.out.println("India: " +india);
//	System.out.println("China: "+china);
//	System.out.println("France: "+france);
	
	
	
	// 14)
	
//	Scanner sc=new Scanner(System.in);
//	 String A=sc.next();
//	 String B=sc.next();
//	 System.out.println(A.length()+B.length());  // addition of lengths of 2 strings
//	 System.out.println(A.compareTo(B)<=0 ? "No" : "Yes"); // string B is greater than String A print yes otherwise print No
//	 System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+' '+ B.substring(0,1).toUpperCase()+B.substring(1));
	
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a string:");
//	String S=sc.nextLine();
//	int start=sc.nextInt();
//	int end=sc.nextInt();
//	System.out.println(S.substring(start, end));
//	 
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	if(n%2!=0){
        System.out.println("Weird");
    }
    else if(n>=2 && n<=5){
        System.out.println("Not Weird");
        
    }
    else if(n>=6 &&n<=20){
        System.out.println("Weird");
        
    }
    else{
        System.out.println("Not Weird");
    }   
  }
}




