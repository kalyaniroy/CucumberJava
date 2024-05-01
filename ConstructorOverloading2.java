package manishpackage;

public class ConstructorOverloading2 {
	
	ConstructorOverloading2(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
	}
	
	ConstructorOverloading2(int a, double b)
	{
		double sum = a + b;
		System.out.println(sum);
	}
	
	ConstructorOverloading2(double a, double b)
	{
		double sum = a + b;
		System.out.println(sum);
	}
	ConstructorOverloading2(float a, int b)
	{
		float sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		new ConstructorOverloading2(100,200);
		new ConstructorOverloading2(150,2.5);
		new ConstructorOverloading2(2.30,3.255);
		new ConstructorOverloading2(10.55f, 10);
	}

}
