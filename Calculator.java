package Java_coding_challenges;

public class Calculator {

// Method 1: Add two integers
   public int add(int a, int b){
       int sum = a + b;
       System.out.println("Integer addition: " + sum);
       return sum;
   }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        double sum = a + b;
        System.out.println("Double addition: " + sum);
        return sum;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Three integers addition: " + sum);
        return sum;
    }



    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call different overloaded add() methods
        calc.add(5, 3);          // Integer addition
        calc.add(2.5, 3.7);      // Double addition
        calc.add(1, 2, 3);       // Three integer addition
    }
}
