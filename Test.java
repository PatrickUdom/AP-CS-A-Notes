public class Test {
    public static void main(String[] args) {
        // Creating objects
        ObjectsAndClasses obj1 = new ObjectsAndClasses();
        ObjectsAndClasses obj2 = new ObjectsAndClasses(10, 20.5, "Hello");

        // Using Integer and Double class libraries
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(99.99);

        // Calling non-static void methods
        obj1.displayAttributes();
        obj2.displayAttributes();
        obj1.updateAttributes(5, 10.5, "Updated");
        obj1.displayAttributes();

        // Using String objects and methods
        String str = "Hello, World!";
        System.out.println("String length: " + str.length());
        System.out.println("Uppercase string: " + str.toUpperCase());
    }
}

class ObjectsAndClasses {
    // Instance variables
    private int attribute1;
    private double attribute2;
    private String attribute3;

    // Default constructor
    public ObjectsAndClasses() {
        this.attribute1 = 0;
        this.attribute2 = 0.0;
        this.attribute3 = "";
    }

    // Constructor with parameters
    public ObjectsAndClasses(int attribute1, double attribute2, String attribute3) {
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

}