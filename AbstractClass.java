package manishpackage;

abstract class Api
{
	abstract void login();
	abstract void auth();
	abstract void twowayauth();
	
}  //no implementation //no logic

public class AbstractClass extends Api 
{

	void login() {
		
	System.out.println("logic of login");
	
	}


	void auth() {
		
		System.out.println("logic of authentication");
		
	}

	
	void twowayauth() {
		
		System.out.println("logic of twowayauthentication");
		
	}

	public static void main(String[] args) {
		
		AbstractClass ob = new AbstractClass();
		ob.login();
		ob.auth();
		ob.twowayauth();

	}

}
