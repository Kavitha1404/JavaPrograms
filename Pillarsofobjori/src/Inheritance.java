//class parent{
//	String name;
//	int age;
//	void cook() {
//		System.out.println("cooking");
//	}
//}
//class child extends parent{
//}
//	public class Inheritance{
//		public static void main(String[]args) {
//			child c=new child();
//			c.name="pavanvennapusa";
//			c.age=22;
//			System.out.println(c.name+" "+c.age);
//			c.cook();
//				
//			
//		}
//	}





//class plane{
//	void takeoff() {
//		System.out.println("Plane took-off");
//	}
//	void fly() {
//		System.out.println("Plane flies");
//	}
//	void lands() {
//		System.out.println("Plane Lands");
//	}
//	
//}
//class cargoplane extends plane{
//
//	void fly() {
//		System.out.println("cargoplane flys at Lower Heights");
//	}
//	void carrygoods() {
//		System.out.println("cargoplane carry goods");
//		
//	}
//}
//class fighterplane extends plane{
//
//	void fly() {
//		System.out.println("fighterplane flys at Lower Heights");
//	}
//	void carryweapons() {
//		System.out.println("fighterplane carry weapons");
//		
//	}
//}
//class passengerrplane extends plane{
//
//	void fly() {
//		System.out.println("passengerplane flys at Medium Heights");
//	}
//	void carrypassengers() {
//		System.out.println("passengerplane carry passengers");
		
//	}
//}
//public class Inheritance {
//	public static void main(String[]args) {
//		cargoplane cp=new cargoplane();
//		System.out.println("Cargoplane Details");
//		cp.takeoff();
//		cp.fly();
//		cp.lands();
//		cp.carrygoods();
//		System.out.println("------------------");
//		
//		fighterplane fp=new fighterplane();
//		System.out.println("Fighterplane Details");
//		fp.takeoff();
//		fp.fly();
//		fp.lands();
//		fp.carryweapons();
//		System.out.println("------------------");
//		
//		passengerrplane pp=new passengerrplane();
//	    System.out.println("Passenger plane Details");
//		pp.takeoff();
//		pp.fly();
//		pp.lands();
//		pp.carrypassengers();
//		System.out.println("------------------"); 
//	}
//}


//class Animal{
//	void run() {
//		System.out.println("It can run");
//	}
//	void sleep() {
//	System.out.println("It can sleep");
//}
//	void eat() {
//		System.out.println("It eats");
//	}
//}
//class Deer extends Animal{
//	void run() {
//		System.out.println("Deer can very fast");
//	}
//	void breathe() {
//		System.out.println("Deer breathes Heavily");
//	}
//}
//
//class lion extends Animal{
//	void run() {
//		System.out.println("Lion runs fastly");
//	}
//	void roar() {
//		System.out.println("Lion roars heavily");
//	}
//}
//class monkey extends Animal{
//	void run() {
//		System.out.println("Monkey cannot run");
//	}
//	void jumps() {
//		System.out.println("Monkey jumps");
//	}
//}
//public class Inheritance{
//	public static void main(String[]args) {
//		Deer d=new Deer();
//		d.eat();
//		d.run();
//		d.sleep();
//		d.breathe();
//		System.out.println("----------------");
//		lion l=new lion();
//		l.eat();
//		l.run();
//		l.sleep();
//		l.roar();
//		System.out.println("---------------");
//		monkey m=new monkey();
//		m.eat();
//		m.run();
//		m.sleep();
//		m.jumps();
//		
//		
//		
//	}
//}

//class car{
//	void speed() {
//		System.out.println("Car speed is more");
//	}
//	void start() {
//		System.out.println("Driver is going to start the car");
//	}
//	void stop() {
//		System.out.println("Car is stopped");
//	}
//}
//class ferrai extends car{
//	void speed() {
//		System.out.println("Ferrai car speed is high");
//	}
//	
//}
//class innova extends car{
//	void speed() {
//		System.out.println("Innova is the second speedest");
//	}
//}
//class premierpadmini extends car{
//	void speed() {
//		System.out.println("Premierpadmini is less speed car");
//	}
//}
//public class Inheritance{
//	public static void main(String[]args) {
//		ferrai f=new ferrai();
//		f.speed();
//		f.start();
//		f.stop();
//		System.out.println("------------------");
//		innova i=new innova();
//		i.speed();
//		i.start();
//		i.stop();
//		System.out.println("------------------");
//		 premierpadmini pp=new  premierpadmini();
//		pp.speed();
//		pp.start();
//		pp.stop();
//		System.out.println("------------------");
//		
//		
//	}
//}



// polymorphic approach the inherited program

//class Animal{
//	void run() {
//		System.out.println("It can run");
//	}
//	void sleep() {
//	System.out.println("It can sleep");
//}
//	void eat() {
//		System.out.println("It eats");
//	}
//}
//class Deer extends Animal{
//	void run() {
//		System.out.println("Deer can very fast");
//	}
//	void breathe() {
//		System.out.println("Deer breathes Heavily");
//	}
//}
//
//class lion extends Animal{
//	void run() {
//		System.out.println("Lion runs fastly");
//	}
//	void roar() {
//		System.out.println("Lion roars heavily");
//	}
//}
//class monkey extends Animal{
//	void run() {
//		System.out.println("Monkey cannot run");
//	}
//	void jumps() {
//		System.out.println("Monkey jumps");
//	}
//}
//public class Inheritance{
//	public static void main(String[]args) {
//
//	Deer d=new Deer();
//	lion l=new lion();
//	monkey m=new monkey();
//	Animal ref;
//	ref=d;
//	ref.eat();
//	ref.run();
//	ref.sleep();
//	d.breathe();
//	System.out.println("------");
//	ref=l;
//	ref.eat();
//	ref.run();
//	ref.sleep();
//	l.roar();
//	System.out.println("-------------");
//	ref=m;
//	ref.eat();
//	ref.run();
//	ref.sleep();
//	m.jumps();
//	
//	
//	
//	}
//}
		

//	class Animal{
//	void run() {
//		System.out.println("It can run");
//	}
//	void sleep() {
//	System.out.println("It can sleep");
//}
//	void eat() {
//		System.out.println("It eats");
//	}
//}
//	
//class Deer extends Animal{
//	void run() {
//		System.out.println("Deer can very fast");
//	}
//	void breathe() {
//		System.out.println("Deer breathes Heavily");
//	}
//}
//
//class lion extends Animal{
//	void run() {
//		System.out.println("Lion runs fastly");
//	}
//	void roar() {
//		System.out.println("Lion roars heavily");
//	}
//}
//class monkey extends Animal{
//	void run() {
//		System.out.println("Monkey cannot run");
//	}
//	void jumps() {
//		System.out.println("Monkey jumps");
//	}
//}
//class forest{
//	void allow(Animal ref) {
//		ref.sleep();
//		ref.eat();
//		ref.run();
//		
//	}
//}
//public class Inheritance{
//	public static void main(String[]args) {
//
//	Deer d=new Deer();
//	lion l=new lion();
//	monkey m=new monkey();
//	forest f=new forest();
//	f.allow(d);
//	d.breathe();
//	System.out.println("------");
//	f.allow(l);
//	l.roar();
//	System.out.println("------");
//	f.allow(m);
//	m.jumps();
//
//
//}
//}

	

//class plane{
//	void takeoff() {
//		System.out.println("Plane took-off");
//	}
//	void fly() {
//		System.out.println("Plane flies");
//	}
//	void lands() {
//		System.out.println("Plane Lands");
//	}
//	
//}
//class cargoplane extends plane{
//
//	void fly() {
//		System.out.println("cargoplane flys at Lower Heights");
//	}
//	void carrygoods() {
//		System.out.println("cargoplane carry goods");
//		
//	}
//}
//class fighterplane extends plane{
//
//	void fly() {
//		System.out.println("fighterplane flys at Lower Heights");
//	}
//	void carryweapons() {
//		System.out.println("fighterplane carry weapons");
//		
//	}
//}
//class passengerrplane extends plane{
//
//	void fly() {
//		System.out.println("passengerplane flys at Medium Heights");
//	}
//	void carrypassengers() {
//		System.out.println("passengerplane carry passengers");
//		
//	}
//}
//class Airport{
//	void allow(plane ref) {
//		ref.takeoff();
//		ref.fly();
//		ref.lands();
//		
//		
//	}
//}
//public class Inheritance {
//	public static void main(String[]args) {
//		cargoplane cp=new cargoplane();
//		fighterplane fp=new fighterplane();
//		passengerrplane pp=new passengerrplane();
//		Airport f=new Airport();
//		f.allow(fp);
//		fp.carryweapons();
//		System.out.println("-------");
//		f.allow(pp);
//		pp.carrypassengers();
//		System.out.println("------");
//		f.allow(cp);
//		cp.carrygoods();
//		
//	    
//	}
//}




// has-a-relation
// composite object
//class os{
//	float version;
//	String name;
//	public os(float version, String name) {
//		super();
//		this.version = version;
//		this.name = name;
//		
//	}
//	//using this we will be able to get the version independently
//	public float getVersion() {
//		return version;
//	}
//	//using this we will be able to get the name independently
//	public String getName() {
//		return name;
//	}
//	
//}
//// Aggregate object
//class charger{
//	String brand;
//	int volts;
//	public charger(String brand, int volts) {
//		super();
//		this.brand = brand;
//		this.volts = volts;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public int getVolts() {
//		return volts;
//	}
//	
//}
//class mobile{
//	os os=new os(98.5f,"xyz");
//	void hasAcharger(charger c) {
//		System.out.println(c.getBrand());
//		System.out.println(c.getVolts());
//	}
//}
//public class Inheritance{
//	public static void main(String[]args) {
//		mobile m=new mobile();
//		charger c=new charger("samsung",15);
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getVersion());
//		m.hasAcharger(c);
//		m=null;
////		System.out.println(m.os.getName());
////		System.out.println(m.os.getVersion());
////		m.hasAcharger(c);
//		
//		System.out.println(c.getBrand());
//		System.out.println(c.getVolts());
//	}
//}




//class Heart{
//	int beat;
//	int size;
//	public Heart(int beat, int size) {
//		super();
//		this.beat = beat;
//		this.size = size;
//	}
//	public int getBeat() {
//		return beat;
//	}
//	public int getSize() {
//		return size;
//	}
//	
//}
//class Book{
//	String name;
//	String author;
//	public Book(String name, String author) {
//		super();
//		this.name = name;
//		this.author = author;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	
//}
//
//class student{
//	Heart H=new Heart(18,38);
//	void hasABook(Book b) {
//		System.out.println(b.name);
//		System.out.println(b.author);
//	}
//	
//}
//public class Inheritance{
//	public static void main(String[]args) {
//		student s=new student();
//		Book b=new  Book("you can win","shiv kera");
//		System.out.println(s.H.getBeat());
//		System.out.println(s.H.getSize());
//		s.hasABook(b);
//		s=null;
//		System.out.println(s.H.getBeat());
//		System.out.println(s.H.getSize());
//		s.hasABook(b);
//		
//		System.out.println(b.getAuthor());
//		System.out.println(b.getName());
//	}
//}



//is-a + has a relation

//class Brain{
//	int iq;
//	int weight;
//	public Brain(int iq, int weight) {
//		super();
//		this.iq = iq;
//		this.weight = weight;
//	}
//	public int getIq() {
//		return iq;
//	}
//	public int getWeight() {
//		return weight;
//	}
//	
//}
//class Heart{
//	int beat;
//	int weight;
//	public Heart(int beat, int weight) {
//		super();
//		this.beat = beat;
//		this.weight = weight;
//	}
//	public int getBeat() {
//		return beat;
//	}
//	public int getWeight() {
//		return weight;
//	}
//	
//}
//class Book {
//	String name;
//	String author;
//	public Book(String name, String author) {
//		super();
//		this.name = name;
//		this.author = author;
//	}
//	public String getName() {
//		return name;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	
//	
//}
//class Bike {
//	String name;
//	int cost;
//	public Bike(String name, int cost) {
//		super();
//		this.name = name;
//		this.cost = cost;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getCost() {
//		return cost;
//	}
//	
//	 
//}
//class Human {
//	Brain b=new Brain(120, 15);
//	Heart h=new Heart(32,45);
//	}
//class student extends Human {
//	void hasAbook(Book bk) {
//		System.out.println(bk.getName());
//		System.out.println(bk.getAuthor());
//		
//	}
//	void hasabike(Bike bike) {
//		System.out.println(bike.getName());
//		System.out.println(bike.getCost());
//	}	
//}
//public class Inheritance {
//	public static void main(String[]args) {
//		student s=new student();
//		Book b=new Book("kavitha","shivkera");
//		Bike bk=new Bike("royalenfield",160000);
//		System.out.println(s.h.beat);
//		System.out.println(s.h.weight);
//		System.out.println(s.b.getIq());
//		System.out.println(s.b.getWeight());
//	    s.hasabike(bk);
//	    s.hasAbook(b);
//	}
//	
//}




















