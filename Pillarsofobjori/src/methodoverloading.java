
public class methodoverloading {
	
	int add(int a, int b) {
		System.out.println("Inside int,int");
		return a+b;
		
	}
	int add(int a,int b, int c) {
		System.out.println("Inside int,int,int");
		return a+b;
		
	}
	float add(float a,float b) {
		System.out.println("Inside float,float");
		return a+b;
	}
	float add(float a,float b,float c) {
		System.out.println("Inside float,float,float");
		return a+b+c;
	}
	double add(double a,double b) {
		System.out.println("Inside double,double,double");
		return a+b;
		
	}
	double add(double a,double b,double c) {
		System.out.println("Inside double,double,double");
		return a+b+c;
		
	}
	float add(int a, float b) {
		System.out.println("Inside int,float");
		return a+b;
		
	}
	double add(int a,double b) {
		System.out.println("Inside int,double");
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading  c1=new methodoverloading();
		int a=10,b=20,c=30;
		float m=23.45f,n=121.11f,o=345.6f;
		double p=234.567,q=1112.3,r=989.786;
		System.out.println(c1.add(a, b));
		System.out.println(c1.add(a, b, c));
		System.out.println(c1.add(m, n));
		System.out.println(c1.add(m, n, o));
		System.out.println(c1.add(p,q));
		System.out.println(c1.add(p, q, r));
		System.out.println(c1.add(p, n));
		

	}

}
