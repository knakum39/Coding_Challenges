package Java_coding_challenges;

public class ExceptionPropagationExample {

    public static void divide(){
        int result = 10/0;
    }

    static void methodA(){
        divide();
    }

    static void methodB(){
        methodA();
    }

    public static void main(String[] args) {
        try{
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main method");
        }
        System.out.println("Program continues after exception handling");
    }
}