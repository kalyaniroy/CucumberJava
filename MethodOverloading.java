package manishpackage;

public class MethodOverloading {
	
	static void add(int a) {
		System.out.println(a);
	}
	static void add(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		add(5);
		add(10,20);

	}

}
