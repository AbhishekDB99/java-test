package test;

public class MathClass {
	
	public static void mathClassTest() {
		double p = 5.89;
		double q = 8.92;
		
		double r = Math.max(p, q);
		System.out.println("Max number is:"+r);
		double s = Math.min(p, q);
		System.out.println("Min number is:"+s);
		double t = Math.sqrt(s);
		System.out.println("Sqrt of s is:"+t);
	}

}
