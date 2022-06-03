package m;
import java.util.Scanner;

class car{
	 int cost;
		int yom;
		int speed;
		int no_of_Headlights;
	
}
class bus{
	 int cost;
	  int speed;
	  int No_of_tyres;
	  int bus_No;
	  
}
class truck{
	int capacity;
	int tyres;
	int Noofmotors;
	String type;
	
}
class Bike{
	String type;
	int Mileage;
	int wheels;
	String model;
	
}
class Laptop{
	String gen ="i3";
	int cost=50000;
	int guarantee=2;
	int batterycapacity=100000;
	
}
 class smartphone{
	 String model="Redmi notepro";
	 int cost=80000;
	 String ram="4GB";
	 String os="Android";
	
}
  class smartwatch{
	  String company="sonica";
	  String brand="Joker";
	  int cost=10000;
	  String dialtype="Rounddial";
	 
 }
  class sarees{
	  String type="Benaras";
	  int cost=20000;
	  String model="1Minute";
	  String  work="Emriding";
  }
  class Nightwear{
	  String type="suit";
	  int costRange=500;
	  String model="Kurti";
	  
  }
  class kidswear{
	  String type="Anarkali";
	  int cost=200;
	  
  }
  class pulses{
	  String protein="Rich";
	  String fat="Less";
	  int cost=50;
  }
  class oils{
	  String color="golden";
	  int cost=100;
	  String type="Cooking oil";
	  String fatcontent="less";
  }
  class soaps{
	  String name="saregama";
	  int cost=50;
	  String purpose="washing";
  }
public class javapro {

	public static void main(String[] args) {
		shopping();	
		
	}
	 static void shopping() {
		 
		 System.out.println("                     *****Welcome to GQT Shopping Mart*****               ");
			System.out.println("Available Product Categories are:" );
			System.out.println("1. Automobile Acessories  2.Electronics Gadgets 3.Clothing  4.HouseHold Items");
			System.out.println("Enter your choice: ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Welcome to the world of Automobiles");
				Automobiles();
			}
				if(choice==2) {
					System.out.println("Welcome to the world of Electronics Gadgets");
					Electronics();
				}
				if(choice==3) {
					System.out.println("Welcome to the world of Clothing");
					clothing();
				}
				if(choice==4) {
					System.out.println("Welcome to the World of HousHold Items");
					Household();
				
			}
			
			
			
		}
			
	 
	 static void Household() {
		 System.out.println("The available items are :");
		  System.out.println("1.Pulses  2.Masala's & oils 3.Soaps");
		  System.out.println("What do you want  ");
		  Scanner sc=new Scanner(System.in);
		  int choice=sc.nextInt();
		  if(choice==1) {
			  System.out.println("Here are the  Details of  pulses are:");
			  pulses p=new pulses();
			  System.out.println("protein content -"+p.protein);
			  System.out.println("fat content -"+p.fat);
			  System.out.println("cost perKg -"+p.cost);
			  
			  payment();
		  }
		  if(choice==2) {
			  System.out.println("The  Details of  oils  are:");
			  oils o=new oils();
			  System.out.println("oil color -"+o.color);
			  System.out.println("cost perlitre -"+o.cost);
			  System.out.println("Type -"+o.type);
			  System.out.println("fat content -"+o.fatcontent);
			  payment();
		  }
		  if(choice==3) {
			  System.out.println("The Details of the soaps are :");
			  soaps s=new soaps();
			  System.out.println("Name -"+s.name);
			  System.out.println("cost -"+s.cost);
			  System.out.println("purpose -"+s.purpose);
		  }
		 
		
		
	}
	 static void clothing() {
		 System.out.println("The available clothings are:");
		 System.out.println("1.sarees 2.Nightware 3.Kidswear");
		 System.out.println("Enter your choice");
		 Scanner sc=new Scanner(System.in);
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("The Details of the sarees are as follows:");
			 sarees s=new sarees();
			 System.out.println("Type "+s.type);
			 System.out.println("model type -"+s.model);
			 System.out.println("Work type -"+s.work);
			 System.out.println("cost Range -"+s.cost);
			 payment();
			 	 
		 }
		 if(choice==2) {
			 System.out.println("The Details of the Nightwear are as follows:");
			 Nightwear n=new Nightwear();
			 System.out.println("cost Range -"+n.costRange);
			 System.out.println("model -"+n.model);
			 System.out.println("type -"+n.type);
			 payment();
			 
			 	 
		 }
		 if(choice==3) {
			 System.out.println("The Details of the kidswear are as follows:");
			 kidswear k=new kidswear();
			 System.out.println("cost -"+k.cost);
			 System.out.println("Type -"+k.type);
			 payment();
			 
		 }
		 
		
		
	}
	 static void Electronics() {
		 System.out.println("The available Electronic gadgets are:");
		 System.out.println("1.laptops 2.smartphones 3.smart watch");
		 System.out.println("Enter your choice:");
		 Scanner sc=new Scanner(System.in);
		 int choice =sc.nextInt();
		 if(choice==1) {
			 System.out.println("The Details of the Laptops are as follows:");
			 Laptop l=new Laptop();
			 System.out.println("Generation -"+l.gen);
			 System.out.println("Battery capacity -"+l.batterycapacity);
			 System.out.println(" cost -"+l.cost);
			 System.out.println("warranty in years-"+l.guarantee);
			 payment();
			
			 
		 }
		 if(choice==2) {
			 System.out.println("The Details of Smartphone are as follows");
			 smartphone s=new smartphone();
			 System.out.println("model -"+s.model);
			 System.out.println("Ram -"+s.ram);
			 System.out.println("cost -"+s.cost);
			 System.out.println("operating system -"+s.os);
			 payment();
			 
		 }
		 if(choice==3) {
			 System.out.println("The Deails of the smartwatch are as follows:");
			 smartwatch w=new smartwatch();
			 System.out.println("Brand -"+w.brand);
			 System.out.println("company -"+w.company);
			 System.out.println("cost -"+w.cost);
			 System.out.println("dialtype -"+w.dialtype);
			 payment();
			 
			 
		 }
		
		
	}
	static void Automobiles() {
		System.out.println("The available Automobile Acessories are:");
		 System.out.println("1.cars  2.buses  3.trucks  4.bikes");
		 System.out.println("Enter your choice of these Acessories :");
		 Scanner sc=new Scanner(System.in);
		 int choice=sc.nextInt();
		 if(choice==1) {
			 System.out.println("The Details of cars are as follows:");
			 car c1=new car();
			 c1.cost=600000;
			 c1.speed=150;
			 c1.no_of_Headlights=2;
			 c1.yom=2002;
			 System.out.println("year of Manfacturing -"+c1.yom);
			 System.out.println(" speed -" +c1.speed);
			 System.out.println("No_of_Headlights -"+c1.no_of_Headlights);
			 System.out.println("cost -"+c1.cost);
			 payment();
			 
			 
		 
		 }
		 if(choice==2) {
			 System.out.println("The Details of the buses are as follows:");
			 bus b=new bus();
			 b.bus_No=12348;
			 b.No_of_tyres=8;
			 b.speed=120;
			 b.cost=800000;
			 System.out.println(" Bus_No -"+b.bus_No);
			 System.out.println("No_of_tyres  -"+b.No_of_tyres);
			 System.out.println("speed -"+b.speed);
			 System.out.println("cost -"+b.cost);
			 payment();
			 
			 
		 } 
		 if(choice==3) {
			 System.out.println("The Details of the trucks are as follows:");
			 truck t=new truck();
			 t.type="Bolero";
			 t.Noofmotors=3;
			 t.capacity=1000;
			 t.tyres=6;
			 System.out.println("Type -" +t.type);
			 System.out.println(" No of motors -"+t.Noofmotors);
			 System.out.println("No of tyres -" +t.tyres);
			 System.out.println("capacity -"+t.capacity);
			 payment();
		 }
		if(choice==4) {
			System.out.println("The Details of the bikes are as follows:");
			Bike bik=new Bike();
			bik.model="TVS";
			bik.wheels=2;
			bik.type="motorcycle";
			bik.Mileage=160;
			System.out.println("model -"+bik.model);
			System.out.println("No of wheels -"+bik.wheels);
			System.out.println("Type -"+bik.type);
			System.out.println("Mileage -"+bik.Mileage);
			 payment();
			
			
			
		}
		
		
	}
	static void payment() {
		System.out.println("Do you want to buy? yes/No" );
		 String str1="yes";
		 String str2="No";
		 Scanner sc=new Scanner(System.in);
		 String str=sc.next();
			if(str1.equalsIgnoreCase(str)) {
				paymentmode();
				
				System.out.println("Make the payment");
				System.out.println("payment sucessful Item purchased");
				System.out.println("Do you wish continue shopping ? yes/no");
				 String string=sc.next();
				if(str1.equalsIgnoreCase(string)) {
					System.out.println("what do you want");
					shopping();	
				}
				else {
					System.out.println("Thank you for Visiting!!! Have a nice day");
				}
				
			}
			else {
				System.out.println("Thank you for Visiting!!! Have a nice day");
			}
			 
		
	}
	static void paymentmode() {
		System.out.println("In much mode are you going to pay");
		System.out.println("1.credit card 2.Digital payment 3.Liquid cash");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		if(choice==1){
			System.out.println("Please tell your Card details:");
			System.out.println("Name of the card Holder :");
			String s1=scan.next();
			System.out.println(" Enter the cvv");
			int n=scan.nextInt();
		}
		if(choice==2) {
			System.out.println("please provide a valid mobile number");
			long l=scan.nextLong();
			System.out.println("Enter the OTP ");
			int m=scan.nextInt();
		}
		if(choice==3) {
			System.out.println("Here is your bill");
		}
		
	}

}


	


