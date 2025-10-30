package Java_coding_challenges;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
/*You are creating your own exception type called InvalidAgeException.
        It extends Exception, meaning it’s a checked exception — Java forces you to handle or declare it.
The constructor takes a String message and passes it to the parent Exception class using super(message).
This allows you to set a custom error message when throwing the exception.*/

public class CustomExceptionDemo {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing our custom exception
            throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
/*    The method takes an integer age as input.
    The throws InvalidAgeException part means this method might throw your custom exception — so whoever calls it must handle it.
    If age < 18, the code creates and throws a new InvalidAgeException object.
    If age is valid (≥18), it just prints a confirmation message.*/

    public static void main(String[] args) {
        try {
            validateAge(15);  // This will throw the exception
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {
            validateAge(25);  // This will pass
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
/*        You call validateAge(15) inside a try block.
                Since 15 < 18, throw new InvalidAgeException(...) executes.
                The program immediately jumps to the catch block.*/
    }
}

