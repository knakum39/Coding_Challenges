package Java_coding_challenges;

public class Pair<T, U> { // T and U are generic type parameters
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getters
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // Display method
    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Example 1: String and Integer
        Pair<String, Integer> pair1 = new Pair<>("Test", 100);
        pair1.display();  // Output: First: Test, Second: 100

        // Example 2: Integer and Double
        Pair<Integer, Double> pair2 = new Pair<>(10, 99.9);
        pair2.display();  // Output: First: 10, Second: 99.9

        // Example 3: String and String
        Pair<String, String> pair3 = new Pair<>("Hello", "World");
        pair3.display();  // Output: First: Hello, Second: World
    }
}
