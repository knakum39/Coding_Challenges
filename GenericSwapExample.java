package Java_coding_challenges;

import java.util.Arrays;

public class GenericSwapExample {

    // Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array [j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Example 1: Integer array
        Integer[] numbers = {1, 2, 3};
        swap(numbers, 0, 2);
        System.out.println(Arrays.toString(numbers));  // Output: [3, 2, 1]

        // Example 2: String array
        String[] letters = {"A", "B", "C"};
        swap(letters, 0, 1);
        System.out.println(Arrays.toString(letters));  // Output: [B, A, C]
    }
}
