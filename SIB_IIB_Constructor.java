package manishpackage;

public class SIB_IIB_Constructor {
	static 
	{
		System.out.println("I am SIB");
	}
	
	{
		System.out.println("I am IIB");
	}
	
	SIB_IIB_Constructor()
	{
		System.out.println("I am constructor");
	}

	public static void main(String[] args) {
		
		new SIB_IIB_Constructor();
		System.out.println("I am main method");
		
	}

}
