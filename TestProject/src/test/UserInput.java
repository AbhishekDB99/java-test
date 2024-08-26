package test;
import java.util.Scanner;
public class UserInput {
	
	
	public static String userInputTest(){
		return "Function from another class Testing";
	}
	
	public static void scannerTesting() {
		
		System.out.println("pls enter your name");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		System.out.println("Your name is "+ username+"!!!");
		scan.close();
	}
	
	public static void expressionFunc() {
		double result =(double) 10/3;
		System.out.println(result);
	}
}
