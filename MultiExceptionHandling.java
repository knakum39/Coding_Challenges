package Java_coding_challenges;

public class MultiExceptionHandling {
    public static void main(String[] args) {
        try{
            // Example 1: ArithmeticException
            int a = 10;
            int b = 0;
            int result  = a/b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: Cannot divide by zero");
        } try {
            //Example 2: NumberFormatException
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException: Invalid number format");
        } try {

            // Example 3: ArrayIndexOutOfBoundsException
            int[] array = {1, 20, 45};
            System.out.println("Array value: " + array[15]);
        }
            catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        } finally {
            System.out.println("Execution completed. (Finally block always runs)");
        }
    }
}
