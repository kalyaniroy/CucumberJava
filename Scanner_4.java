package manishpackage;

import java.util.Scanner;

public class Scanner_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter age");
		
		int a = sc.nextInt();
		
		if(a>=18) {
			System.out.println("I can vote");
		}
		else if(a<18 && a!=0) {
			System.out.println("I am young, can not vote");
		}
		else {
			System.out.println("Please enter valid input");
		}

	}

}
