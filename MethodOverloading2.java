package manishpackage;

public class MethodOverloading2 {
	
	 void add(int a) {
		
		int sum = a+6;
		System.out.println(sum);
		
	}
	 void add(int a, int b) {
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		MethodOverloading2 m1 = new MethodOverloading2();
		m1.add(100);
		m1.add(200, 100);

	}

}
