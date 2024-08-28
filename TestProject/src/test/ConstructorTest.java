package test;

public class ConstructorTest {
    String name;
    int age;

    // Default constructor
    public ConstructorTest() {
        name = "Noice"; // Set default name
        age = 20; // Set default age
    }

    // Parameterized constructor
    public ConstructorTest(String personName, int personAge) {
        name = personName; // Initialize the name with the given parameter
        age = personAge; // Initialize the age with the given parameter
    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
