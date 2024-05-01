package manishpackage;

public class ConstructorPractice {
	
	ConstructorPractice(){
		
		System.out.println("I am constructor");
		
	}

	public static void main(String[] args) {
		System.out.println("starting your main method"); //1st executation
		new ConstructorPractice(); //2nd executation
		new ConstructorPractice(); //3rd executation
		ConstructorPractice obj = new ConstructorPractice(); //4th executation
		System.out.println("ending your main method"); //5th executation
		ConstructorPractice obj1 = new ConstructorPractice(); //6th executation
	}

}
