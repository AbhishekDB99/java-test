package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorTest cons = new ConstructorTest();
		ConstructorTest cons2 = new ConstructorTest("good", 34);
		ConstructorTest cons3 = new ConstructorTest("gooooooo", 56);
		System.out.println(cons.age + " " + cons.name);
		cons.displayInfo();
		cons2.displayInfo();
		cons3.displayInfo();
	}

}
