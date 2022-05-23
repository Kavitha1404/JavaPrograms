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
class cricketer {
	private String name;
	private int age;
	private int matches;
	private int avg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
		
	}
	void setData(String name,int age,int matches,int avg) {
		this.name=name;
		this.age=age;
		this.avg=avg;
		this.matches=matches;
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(matches);
		System.out.println(avg);
	}
	void catches() {
		System.out.println("cricketer catches the ball");
	}
	void runs() {
		System.out.println("cricketer runs along with the bat");
	}
	
}
public class Encapsulation{
	public static void main(String[]args) {
		cricketer c=new cricketer();
		c.setData("Virat", 21, 40, 25);
		c.getData();
		System.out.println("-----------------");
		c.setName("pavan");
		c.setAge(22);
		c.setMatches(50);
		c.setAvg(15);
		c.runs();
		c.catches();
		
	}
}





