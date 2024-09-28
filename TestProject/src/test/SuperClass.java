package test;

public class SuperClass {

    SuperClass() {
        int parentVariable = 45;
    }

    public String parentMethod() {
        return "This is parent method";
    }

    public void funcCall() {
        System.out.println("This is a function call from parent");
    }
}
