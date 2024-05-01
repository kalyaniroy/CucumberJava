package manishpackage;

public class ArithmeticNonStatic {
	void add() {
		
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
		
	}
	void sub() {
		int a =10;
		int b= 20;
		int result =a-b;
		System.out.println(result);
	}
	//there are total 3 methods 1 main method,2 non static method

	public static void main(String[] args) {
		ArithmeticNonStatic a1 = new ArithmeticNonStatic();
		a1.add();
		a1.sub();

	}

}
