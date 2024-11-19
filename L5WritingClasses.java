/*
Lesson 5: Writing Classes

Topics
5.1 Anatomy of a Class Lab 4: Investments and Investors 
5.2 Constructors
5.3 Documentation with Comments Assignment: *Documenting Classes with Javadoc 
5.4 Accessor Methods
5.5 Mutator Methods
5.6 Writing Methods
5.7 Static Variables and Methods Lab 5: *Parity Functions
5.8 Scope and Access Lab 6: *Set Ops Lab 7: Three-Method Breakdown 
5.9 this Keyword
5.10 Ethical and Social Implications of Computing Systems

Assignments & Labs
Lab 4: Investments and Investors
Assignment: Documenting Classes with Javadoc
Lab 5: Parity Functions
Lab 6: Set Ops
Lab 7: Three-Method Breakdown
*/

public class L5WritingClasses {
    // Fields (Anatomy of a Class)
    private int value;
    private static int count;

    // Constructor
    public L5WritingClasses(int value) {
        this.value = value;
        count++;
    }

    // Accessor Method (Non-static method)
    public int getValue() {
        return value;
    }

    // Mutator Method (Non-static method)
    public void setValue(int value) {
        this.value = value;
    }

    // Static Method
    /*
     * Static methods belong to the class itself rather than an instance of the class.
     * They can be called without creating an object of the class.
     */
    public static int getCount() {
        return count;
    }

    // Method using 'this' keyword (Non-static method)
    /*
     * Non-static methods belong to an instance of the class and require an object to be called.
     */
    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    // Main method to test the class
    public static void main(String[] args) {
        L5WritingClasses obj1 = new L5WritingClasses(10);
        L5WritingClasses obj2 = new L5WritingClasses(20);

        obj1.printValue();
        obj2.printValue();

        // Calling static method without creating an instance
        System.out.println("Count: " + L5WritingClasses.getCount());
    }
}

/*
 * Difference between static and non-static methods:
 * - Static methods belong to the class and can be called without creating an instance of the class.
 * - Non-static methods belong to an instance of the class and require an object to be called.
 */

