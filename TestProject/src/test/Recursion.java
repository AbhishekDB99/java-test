package test;

public class Recursion {

    Recursion() {
        System.out.println("testing");
    }

    public void hiFunc(int n) {
        if (n == 0) {
            System.out.println("done");
        } else {
            n--;
            System.out.println("HI");
            hiFunc(n);
        }
    }
}
