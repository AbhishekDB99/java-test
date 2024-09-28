package test;

public class Main {

	public static void main(String[] args) {
		// SubClass1 sc1 = new SubClass1();
		// String test = sc1.parentMethod();
		// System.out.println(test);

		SubClass1 sc1 = new SubClass1();
		sc1.funcCall();

		SuperClass sc = new SuperClass();
		sc.funcCall();
	}

}
