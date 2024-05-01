package manishpackage;

public class MethodOverloading4 {
	
	void add (double a, int b) {
		double c = a+b;
		System.out.println(c);
	}
	void add (int a, double b) {
		double c = a+b;
		System.out.println(c);
	}
	static void add (double a, int b, int c) {
		double d = a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		add(2.45,3,5);
		MethodOverloading4 ob = new MethodOverloading4();
		ob.add(2.55, 4);
		ob.add(10, 12.84);

	}

}
