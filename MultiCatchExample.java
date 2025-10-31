package Java_coding_challenges;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int a = 10;
            int b = 0;

            // This will cause ArithmeticException
            int result = a / b;

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

            System.out.println("Result: " + result);
        }
        // Multi-catch block handles both exception types
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }
        finally {
            System.out.println("Program executed with multi-catch block");
        }
    }
}
