package manishpackage;

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
		System.out.println("logic 1");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("logic 2");
	}
	public ConstructorOverloading(int a, int b)
	{
		System.out.println("logic 3");
	}

	public static void main(String[] args) {
		
		//ConstructorOverloading ob = new ConstructorOverloading();
		//ConstructorOverloading ob1 = new ConstructorOverloading(100);
		new ConstructorOverloading();
		new ConstructorOverloading(200);
		new ConstructorOverloading(200,0);
		
		}

	}


