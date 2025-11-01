package Java_coding_challenges;

public class GenericBoundedTypeExample {

    // Generic method with bounded type parameter
    public static <T extends Number> double sum(T[] numbers) {
        double total = 0.0;
        for (T num : numbers) {
            total += num.doubleValue(); // convert each number to double
        }
        return total;
    }

    public static void main(String[] args) {
        // Example 1: Integer array
        Integer[] intArray = {1, 2, 3};
        System.out.println("Sum: " + sum(intArray));  // Output: 6.0

        // Example 2: Double array
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("Sum: " + sum(doubleArray));  // Output: 7.5
    }
}

