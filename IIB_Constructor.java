package manishpackage;

public class IIB_Constructor {

	{
		System.out.println("IIB 1");
	}
	IIB_Constructor(char a)
	{
		System.out.println("Constructor 1");
	}
	IIB_Constructor(int a)
	{
		System.out.println("Constructor 2");
	}
	IIB_Constructor(int a, int b)
	{
		System.out.println("Constructor 3");
	}
	IIB_Constructor(double a, int b)
	{
		System.out.println("Constructor 4");
	}
	
	public static void main(String[] args) {
		
		IIB_Constructor ob = new IIB_Constructor('a');
		IIB_Constructor ob1 = new IIB_Constructor(11);
		new IIB_Constructor(3,11);
		new IIB_Constructor(23.27, 27);
	
	}

}
