package manishpackage;

abstract class Abstract_Class2
{
	abstract void login();
	abstract void otp();
	
}

abstract class Abstract_Class1 extends Abstract_Class2
{
	abstract void logout();
	void add() 
	{
		System.out.println("add logic");
	}
	static void sub() 
	{
		System.out.println("sub logic");
	}
}
public class Concrete_Class extends Abstract_Class1{

	

	void logout()
	{
		System.out.println("logout logic");
		
	}

	void login()
	{
		
		System.out.println("login logic");
		
	}

	void otp()
	{
		
		System.out.println("otp logic");
		
	}
	public static void main(String[] args)
	{
		
		Concrete_Class ob = new Concrete_Class();
		ob.login();
		ob.logout();
		ob.otp();
		
	}

}
