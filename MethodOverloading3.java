package manishpackage;

public class MethodOverloading3 {
	
	void one(int a) {
		System.out.println("first method");
	}
	static void one (double a) {
		System.out.println("second method");
	}
	void one (char a) {
		System.out.println("third method");
	}
	static void one (boolean a) {
		System.out.println("forth method");
	}
	static void one (String a) {
		System.out.println("fifth method");
	}

	public static void main(String[] args) {
	
		MethodOverloading3 ob = new MethodOverloading3();
		ob.one(5);
		one(2.5);
		ob.one('r');
		one(true);
		one("kalyani");
	}

}
