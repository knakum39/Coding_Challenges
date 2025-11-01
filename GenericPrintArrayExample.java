package Java_coding_challenges;

public class GenericPrintArrayExample {

    // Generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // move to next line after printing
    }

    public static void main(String[] args) {

// Example 1: String array
        String[] stringArray = {"A", "B", "C"};
        printArray(stringArray);  // Output: A B C

        // Example 2: String array
       Integer[] integerArray = {56, 12, 84};
        printArray(integerArray);  // Output: A B C
    }
}

//Explanation
/*
        <T> — defines a generic type parameter, allowing the method to work with any data type (String, Integer, Double, etc.).
The enhanced for loop (for (T element : array)) iterates through each array element.
        Works for both primitive wrapper types and reference types (objects).*/
