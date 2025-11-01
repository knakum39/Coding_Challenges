package Java_coding_challenges;

public class MaxValueExample {
    public static void main(String[] args) {
        // Input array of Integer objects
        Integer[] numbers = {10, 80, 5, 30, 15};

        // Initialize max with the first element
        Integer max = numbers[0];

        // Loop through the array to find the maximum value
      for(int i=1; i < numbers.length; i++){
          if(numbers[i] > max){
              max = numbers[i];
          }
      }
        // Output the maximum value
        System.out.println("Max: " + max);
    }

}
