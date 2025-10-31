package Java_coding_challenges;

public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        int value = 10; // primitive int

        // Autoboxing: int -> Integer (automatic conversion)
        Integer boxedValue = value;

        // Unboxing: Integer -> int (automatic conversion)
        int unboxedValue = boxedValue;

        System.out.println("Autoboxed: " + boxedValue + ", Unboxed: " + unboxedValue);
    }
}

