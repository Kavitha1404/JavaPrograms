package controlflow;

public class secondsmallest {

	public static void main(String[] args) {
		secondsmallest(12,8,6);
	}

	public static void secondsmallest(int a, int b, int c) {
		int second = Math.max(Math.min(a, b),Math.min(Math.max(a, b),c));
		System.out.println(second);
}
}

