package manishpackage;

public class Arithmetic {
	
	static void add() {
		
		int a = 10;
		int b = 20;
		int outputofadd = a+b;
		System.out.println(outputofadd);
		
	}
	static void sub() {
		int a =10;
		int b= 20;
		int outputofsub =a-b;
		System.out.println(outputofsub);
	}
	void multi() {
		int a =10;
		int b= 20;
		int outputofmulti = a*b;
		System.out.println(outputofmulti);
	}
	void div() {
		int a =100;
		int b= 20;
		int outputofdiv = a/b;
		System.out.println(outputofdiv);
	}

	public static void main(String[] args) {
				
		add();
		sub();
		Arithmetic ob = new Arithmetic(); 
		ob.multi();
		ob.div();

	}

}
