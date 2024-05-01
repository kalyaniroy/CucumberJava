package manishpackage;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the value of a");
	int a = s1.nextInt();
	System.out.println("Enter the value of b");
	int b = s1.nextInt();
	System.out.println("Addition of two number:");
	int sum = a+b;
	System.out.println(sum);
	}

}
