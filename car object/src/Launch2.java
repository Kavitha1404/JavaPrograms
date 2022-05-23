/**
 * 
 */

/**
 * @author Kavitha
 *
 */
class car{
	String model;
	String brand;
	int cost;
	String color;
	/**
	 * description:This is the method used to indicate the drive Behaviour of the car
	 * return type : void
	 */
	void drive() {
		System.out.println("Iam driving the car");
	}
	/**
	 * description:This is the method used to indicate the start Behaviour of the car
	 * return type : void
	 */
	void start() {
		System.out.println("Iam starting  the car");
	}
	/**
	 * description:This is the method used to indicate the stop Behaviour of the car
	 * return type : void
	 */
	void stop() {
		System.out.println("Iam stopping the car");
	}
	
}
public class Launch2 {

	/**
	 * @param args
	 * description:this is the main method which contains the objects of the car class
	 * return type:void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();//object creation
		c.model="AMGA45";
		c.brand="Benz";
		c.cost=500000;
		c.color="white";
		System.out.println("The properties of the car as follows:");
		System.out.println(c.model);//AMGA45
		System.out.println(c.brand);//benz
		System.out.println(c.cost);//500000
		System.out.println(c.color);//white
		System.out.println("The Behaviours  of the car as follows:");
		c.drive();//I am driving
		c.start();//I am starting the car 
		c.stop();//I am stopping the car
		System.out.println("---------------------------------------------");
		car c1=new car();//object creation
		c1.model="Hundai Grand i10";
		c1.brand="Maruti sutziki";
		c1.cost=700000;
		c1.color="Black";
		System.out.println("The properties of the car as follows:");
		System.out.println(c1.model);//Hundai Grand i10
		System.out.println(c1.brand);//Maruti Sutziki
		System.out.println(c1.cost);//700000
		System.out.println(c1.color);//Black
		System.out.println("The Behaviours  of the car as follows:");
		c1.drive();//I am driving
		c1.start();//I am starting the car 
		c1.stop();//I am stopping the car
		System.out.println("---------------------------------------------");
		car c2=new car();//object creation
		c2.model=" Grand i20";
		c2.brand="BMW";
		c2.cost=900000;
		c2.color="red";
		System.out.println("The properties of the car as follows:");
		System.out.println(c2.model);// Grand i20
		System.out.println(c2.brand);//BMW
		System.out.println(c2.cost);//900000
		System.out.println(c2.color);//red
		System.out.println("The Behaviours  of the car as follows:");
		c2.drive();//I am driving
		c2.start();//I am starting the car 
		c2.stop();//I am stopping the car
		

	}

}
