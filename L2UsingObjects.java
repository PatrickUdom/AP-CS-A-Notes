public class L2UsingObjects {
    private int attribute1;
    private double attribute2;
    private String attribute3;

    // Default constructor
    public L2UsingObjects() {
        this.attribute1 = 0;
        this.attribute2 = 0.0;
        this.attribute3 = "";
    }

    // Constructor with parameters
    public L2UsingObjects(int attribute1, double attribute2, String attribute3) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    // Non-static void method without parameters
    public void displayAttributes() {
        System.out.println("Attribute 1: " + attribute1);
        System.out.println("Attribute 2: " + attribute2);
        System.out.println("Attribute 3: " + attribute3);
    }

    // Non-static void method with parameters
    public void updateAttributes(int attribute1, double attribute2, String attribute3) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    // Static method
    public static double calculateSquareRoot(double value) {
        return Math.sqrt(value);
    }

    public static void main(String[] args) {
        // Using Integer and Double class libraries
        // Integer intObj = Integer.valueOf(100);
        // Double doubleObj = Double.valueOf(99.99);

        // Using String objects and methods
        String str = "Hello, World!";
        System.out.println("String length: " + str.length());
        System.out.println("Uppercase string: " + str.toUpperCase());

        // Using static method and Math class
        double value = 16.0;
        double sqrtValue = L2UsingObjects.calculateSquareRoot(value);
        System.out.println("Square root of " + value + " is " + sqrtValue);

        // Creating and using ObjectsAndClasses object
        Objects obj = new Objects(1, "Sample Description", 100.0);
        obj.displayDetails();
    }
}

class Objects {
    private int id;
    private String description;
    private double amount;

    // Default constructor
    public Objects() {
        this.id = 0;
        this.description = "Default Description";
        this.amount = 0.0;
    }

    // Constructor with parameters
    public Objects(int id, String description, double amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Amount: " + amount);
    }
}