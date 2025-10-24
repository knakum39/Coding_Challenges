package Java_coding_challenges;

public class StringComparisonDemo {
    public static void main(String[] args) {
        //Creating String objects
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = new String("Hello");

        System.out.println("\n=== Using "==" operator ===");
        System.out.println("str1== str2: " + (str1==str2));
        System.out.println("str1== str3: " + (str1==str3));
        System.out.println("str1== str4: " + (str1==str4));

        System.out.println("\n=== Using equals() method===");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false, case-sensitive
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));

        System.out.println("\n=== equalsIgnoreCase() method ===");
        // equalsIgnoreCase() ignores case differences
        System.out.println("str1.equalsIgnoreCase(str2):"+ str1.equalsIgnoreCase(str2));
        System.out.println("str1.equalsIgnoreCase(str3):"+ str1.equalsIgnoreCase(str3));
        System.out.println("str1.equalsIgnoreCase(str4):"+ str1.equalsIgnoreCase(str4));

        System.out.println("\n=== Using compareTo() method ===");
        // compareTo() returns 0 if equal, negative if str1 < strX, positive if str1 > strX
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // negative because 'H' < 'h'
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // 0
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // 0
   /*     Character	Unicode / ASCII value
        'H'	72
        'h'	104
        So when you do:str1.compareTo(str2)
        It compares the first characters 'H' and 'h':
        'H' - 'h' = 72 - 104 = -32
        Since -32 is negative, Java considers 'H' less than 'h'.*/
    }
}
