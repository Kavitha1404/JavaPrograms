//class Dog{
//	String name;
//	String Breed;
//	int cost;
//	String color;
//	void run() {
//		System.out.println("Dog runs");
//	}
//	void eat() {
//		System.out.println("Dog eats");
//	}
//}
//
//public class Encapsulation {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog d=new Dog();
//		d.name="Tommy";
//		d.color="White";
//		d.Breed="GR";
//		d.cost=5000;
//		System.out.println(d.name);
//		System.out.println(d.Breed);
//		System.out.println(d.color);
//		System.out.println(d.color);
//		d.eat();
//		d.run();
//
//	}
//
//}




//class Dog{
//	private String name;
//	private String Breed;
//	private int cost;
//	private String color;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getBreed() {
//		return Breed;
//	}
//	public void setBreed(String breed) {
//		Breed = breed;
//	}
//	public int getCost() {
//		return cost;
//	}
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	void setData(String name, int cost,String color,String Breed) {
//		this.name=name;
//		this.color=color;
//		this.Breed=Breed;
//		this.cost=cost;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(Breed);
//		System.out.println(color);
//	}
//	void run() {
//		System.out.println("Dog runs");
//	}
//	void eat() {
//		System.out.println("Dog eats");
//	}
//}
//
//public class Encapsulation {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog d=new Dog();
//		d.setData("Rocky", 7000, "white", "pug");
//		d.getData();
//		System.out.println("-------------");
//		d.setName("Tommy");
//		d.setBreed("GR");
//		d.setColor("Brown");
//		d.setCost(5000);
//		System.out.println(d.getName());
//		System.out.println(d.getCost());
//		System.out.println(d.getColor());
//		System.out.println(d.getBreed());
//		
//		d.eat();
//		d.run();
//
//	}
//
//}
//class Dog{
//	private String name;
//	private String Breed;
//	private int cost;
//	private String color;
//	void setData(String name, int cost,String color,String Breed) {
//		name=name;
//		color=color;
//		Breed=Breed;
//		cost=cost;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(Breed);
//		System.out.println(color);
//	}
//}
//public class Encapsulation {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog d=new Dog();
//		d.setData("Rocky", 7000, "white", "pug");
//		d.getData();
//
//	}
//}
//class cricketer {
//	private String name;
//	private int age;
//	private int matches;
//	private int avg;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getMatches() {
//		return matches;
//	}
//	public void setMatches(int matches) {
//		this.matches = matches;
//	}
//	public int getAvg() {
//		return avg;
//	}
//	public void setAvg(int avg) {
//		this.avg = avg;
//		
//	}
//	void setData(String name,int age,int matches,int avg) {
//		this.name=name;
//		this.age=age;
//		this.avg=avg;
//		this.matches=matches;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(matches);
//		System.out.println(avg);
//	}
//	void catches() {
//		System.out.println("cricketer catches the ball");
//	}
//	void runs() {
//		System.out.println("cricketer runs along with the bat");
//	}
//	
//}
//public class Encapsulation{
//	public static void main(String[]args) {
//		cricketer c=new cricketer();
//		c.setData("Virat", 21, 40, 25);
//		c.getData();
//		System.out.println("-----------------");
//		c.setName("pavan");
//		c.setAge(22);
//		c.setMatches(50);
//		c.setAvg(15);
//		c.runs();
//		c.catches();
//		
//	}
//}


// Constructors
//class  Dog {
//	private String name;
//	private int cost;
//	private String breed;
//	private String color;
//	
//	public Dog() { //Zero parameterized constructor
//		
//	}
//	public Dog(String name) {
//		this.name=name;
//		
//		
//	}
//	public Dog(String name,int cost) {
//		this.name=name;
//		this.cost=cost;
//	}
//	public Dog(String name,int cost,String breed) {
//		this.name=name;
//		this.cost=cost;
//		this.breed=breed;
//	}
//	public Dog(String name,int cost,String breed,String color) {
//		this.name=name;
//		this.cost=cost;
//		this.breed=breed;
//		this.color=color;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(breed);
//		System.out.println(color);
//	}
//	
//	
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Dog d1=new Dog();
//		Dog d2=new Dog("Rocky");
//		Dog d3=new Dog("Tommy",5000);
//		Dog d4=new Dog("Jimmy",6000,"pug");
//		Dog d5=new Dog("pummy",7000,"GR","white");
//		d1.getData();
//		System.out.println("------------------");
//		d2.getData();
//		System.out.println("-------------------");
//		d3.getData();
//		System.out.println("--------------------");
//		d4.getData();
//		System.out.println("---------------------");
//		d5.getData();
//		System.out.println("--------------------");
//		
//		
//	}
//}
	

//class car{
//	private String name;
//	private int cost;
//	private String color;
//	private String model;
//	
//	//Zero parameterized constructor
//	public car(){
//		
//	}
//	public car(String name) {
//		this.name=name;
//		
//	}
//	public car(String name,int cost) {
//		this.name=name;
//		this.cost=cost;
//	}
//	public car(String name,int cost,String color) {
//		this.name=name;
//		this.cost=cost;
//		this.color=color;
//	}
//	public car(String name,int cost,String color,String model) {
//		this.name=name;
//		this.cost=cost;
//		this.color=color;
//		this.model=model;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(color);
//		System.out.println(model);
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		car c1=new car();
//		car c2=new car("Audi");
//		car c3=new car("Benz",5000);
//		car c4=new car("kia",6000,"White");
//		car c5=new car("Marsures",9000,"Black","lexus");
//		c1.getData();
//		System.out.println("-----------");
//		c2.getData();
//		System.out.println("--------------");
//		c3.getData();
//		System.out.println("-----------");
//		c4.getData();
//		System.out.println("-----------------");
//		c5.getData();
//		
//	}
//}



//class  Dog extends Object {
//	private String name;
//	private int cost;
//	private String breed;
//	private String color;
//	
//	public Dog() { //Zero parameterized constructor
//		super();
//		
//	}
//	public Dog(String name) {
//		super();
//		this.name=name;
//		
//		
//	}
//	public Dog(String name,int cost) {
//		super();
//		this.name=name;
//		this.cost=cost;
//	}
//	public Dog(String name,int cost,String breed) {
//		super();
//		this.name=name;
//		this.cost=cost;
//		this.breed=breed;
//	}
//	public Dog(String name,int cost,String breed,String color) {
//		super();
//		this.name=name;
//		this.cost=cost;
//		this.breed=breed;
//		this.color=color;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(breed);
//		System.out.println(color);
//	}
//	
//	
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Dog d1=new Dog();
//		Dog d2=new Dog("Rocky");
//		Dog d3=new Dog("Tommy",5000);
//		Dog d4=new Dog("Jimmy",6000,"pug");
//		Dog d5=new Dog("pummy",7000,"GR","white");
//		d1.getData();
//		System.out.println("------------------");
//		d2.getData();
//		System.out.println("-------------------");
//		d3.getData();
//		System.out.println("--------------------");
//		d4.getData();
//		System.out.println("---------------------");
//		d5.getData();
//		System.out.println("--------------------");
//		
//		
//	}
//}


//class car{
//	private String name;
//	private int cost;
//	private String color;
//	private String model;
//	
//	//Zero parameterized constructor
//	public car(){
//		
//	}
//	public car(String name) {
//		this.name=name;
//		
//	}
//	public car(String name,int cost) {
//		this.name=name;
//		this.cost=cost;
//	}
//	public car(String name,int cost,String color) {
//		this.name=name;
//		this.cost=cost;
//		this.color=color;
//	}
//	public car(String name,int cost,String color,String model) {
//		this.name=name;
//		this.cost=cost;
//		this.color=color;
//		this.model=model;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(color);
//		System.out.println(model);
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		car c1=new car();
//		car c2=new car("Audi");
//		car c3=new car("Benz",5000);
//		car c4=new car("kia",6000,"White");
//		car c5=new car("Marsures",9000,"Black","lexus");
//		c1.getData();
//		System.out.println("-----------");
//		c2.getData();
//		System.out.println("--------------");
//		c3.getData();
//		System.out.println("-----------");
//		c4.getData();
//		System.out.println("-----------------");
//		c5.getData();
//		
//	}
//}

//class  Dog extends Object {
//	private String name;
//	private int cost;
//	private String breed;
//	private String color;
//	
//	public Dog() { //Zero parameterized constructor
//		this("Rocky");
//		
//	}
//	public Dog(String name) {
//		this("Tommy",5000);
//		this.name=name;
//		
//		
//	}
//	public Dog(String name,int cost) {
//		this("Jimmy",6000,"pug");
//		this.name=name;
//		this.cost=cost;
//	}
//	public Dog(String name,int cost,String breed) {
//		this("pummy",7000,"GR","white");
//		this.name=name;
//		this.cost=cost;
//		this.breed=breed;
//	}
//	public Dog(String name,int cost,String breed,String color) {
//		super();
//		this.name=name;
//		this.cost=cost;
//		this.breed=breed;
//		this.color=color;
//	}
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(breed);
//		System.out.println(color);
//	}
//	
//	
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Dog d1=new Dog();
//				d1.getData();
//		System.out.println("------------------");
//		
//		
//		
//	}
//}
//
//
//




//class Animal extends Object {
//	 String name;
//	 int cost;
//	 String breed;
//	 String color;
//	 
//	 public Animal () {
//		 super();
//		 this.name="Rocky";
//		 this.cost=6000;
//		 this.color="Black";
//		 this.breed="GR";
//		 
//	 }	
//}
//class  Dog extends Animal {
//	
//	
//	public Dog() { //Zero parameterized constructor
//		super();	
//	}
//	
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(breed);
//		System.out.println(color);
//	}
//	
//	
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Dog d1=new Dog();
//				d1.getData();
//		System.out.println("------------------");
//		
//		
//		
//	}
//}


//class Animal extends Object {
//	 String name;
//	 int cost;
//	 String breed;
//	 String color;
//	 
//	 public Animal () {
//		 super();
//		 this.name="Rocky";
//		 this.cost=6000;
//		 this.color="Black";
//		 this.breed="GR";
//		 
//	 }
//
//	public Animal(String name, int cost, String color, String breed) {
//		super();
//		this.name=name;
//		this.color=color;
//		this.cost=cost;
//		this.breed=breed;
//		
//		
//	}	
//}
//class  Dog extends Animal {
//	
//	
//	public Dog() { //Zero parameterized constructor
//		super();	
//	}
//	
//	void getData() {
//		System.out.println(name);
//		System.out.println(cost);
//		System.out.println(breed);
//		System.out.println(color);
//	}
//	
//	
//}
//class Dog2 extends Animal{
//	
//	public Dog2(String name,int cost, String breed, String color) {
//		super(name,cost,color,breed);
//	}
//		     void getData() {
//			System.out.println(name);
//			System.out.println(cost);
//			System.out.println(breed);
//			System.out.println(color);
//
//	}
//}
//public class Encapsulation{
//	public static void main(String[] args) {
//		Dog d1=new Dog();
//				d1.getData();
//		System.out.println("------------------");
//		Dog2 d2=new Dog2("Tommy",8000,"White","GR");
//		d2.getData();
//		
//		
//		
//	}
//}



//class car extends Object{
//	int cost;
//	int yom;
//	int speed;
//	int no_of_headligts;
//	public car(int cost, int yom, int speed, int no_of_headligts) {
//		super();
//		this.cost = cost;
//		this.yom = yom;
//		this.speed = speed;
//		this.no_of_headligts = no_of_headligts;
//	}
//}
//	class Benz extends car{
//		public Benz(int cost, int yom, int speed, int no_of_headligts) {
//			super( cost, yom, speed, no_of_headligts);
//			
//		}
//		public Benz() {
//			this(90000,2022,85,5);
//			
//		}
//		void getData() {
//			System.out.println(cost);
//			System.out.println(yom);
//			System.out.println(speed);
//			System.out.println(no_of_headligts); 
//			
//			
//		}
//		
//	}
//	public class Encapsulation{
//		public static void main(String[] args) {
//			Benz b=new Benz();
//			b.getData();
//		}
//	}

	