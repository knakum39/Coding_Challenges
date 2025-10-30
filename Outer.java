package Java_coding_challenges;

public class Outer {

    private String outerMessage = "Hello from Outer class!";

    // Inner class (non-static)
    class Inner {
        private String innerMessage = "Hello from Inner class!";

        // Method inside inner class
        void display() {
            // Inner class can access private members of outer class
            System.out.println(outerMessage);
            System.out.println(innerMessage);
        }
    }

    // Method inside Outer class that uses Inner class
    void showInner() {
        // Creating an instance of Inner class
        Inner inner = new Inner();
        inner.display();
    }

    // Main method to run the demo
    public static void main(String[] args) {
        // Create instance of Outer class
        Outer outer = new Outer();

        // Access inner class via outer class method
        outer.showInner();

        // OR: Create Inner class object directly (via Outer object)
        Outer.Inner innerObj = outer.new Inner();
        innerObj.display();
    }
}
