package manishpackage;

abstract class RazorPayApi  //abstract class
{
	abstract void login(); //abstract method
	//suppressed method 
	//method is overridden
}

public class Abstract_Class extends RazorPayApi {

	public static void main(String[] args) {
	
		Abstract_Class a1= new Abstract_Class();
		a1.login();

	}

	void login() 
	{
		System.out.println("internal logic");
	}

}
