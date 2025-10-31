package Java_coding_challenges;

import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking an input;
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        try {
            //DivisionOperation
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Error: Cannot divide by Zero");
        } finally {
            //Always executed
            System.out.println("Finally block executed");
        }
        sc.close();
    }
}
