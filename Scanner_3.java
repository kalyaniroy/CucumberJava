package manishpackage;

import java.util.Scanner;

public class Scanner_3 {
	
	public void div() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter 1st input to divide");
		int a = s1.nextInt();
		System.out.println("Please enter 2nd input to divide");
		int b = s1.nextInt();
		System.out.println("Division is :");
		int div = (a/b);
		System.out.println(div);
			
	}
	public static void multi() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Please enter 1st input to multiple");
		int a = s2.nextInt();
		System.out.println("Please enter 2nd input to multiple");
		int b = s2.nextInt();
		System.out.println("multiplication is :");
		int multi = (a*b);
		System.out.println(multi);
		
	}
	public void sub() {
		
		
	}
	public static void add() {
		
		
	}
	public static void main(String[] args) {
		
		Scanner_3 ob = new Scanner_3();
		ob.multi();
		ob.div();
		

	}

}
