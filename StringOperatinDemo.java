package Java_coding_challenges;

public class StringOperatinDemo {
    public static void main(String[] args) {
        // 1. String declaration
        String str1 = "Hello";
        String str2 = "World";

        // 2. Concatenation
        String concated = str1 + " " + str2;
        System.out.println("Concatebated String:" + concated);

        //3. length of the string
        int length = concated.length();
        System.out.println("Length of the string is:" + length);

        //4. substring
        String sub = concated.substring(4);// From index 4 to end
        System.out.println("Substring from index 4:" + sub);

        String sub2 = concated.substring(0, 5); // From index 0 to 5 (exclusive)
        System.out.println("Substring from index 0 to 5: " + sub2);

        // 5. Character extraction
        char ch = concated.charAt(4); // Character at index 4
        System.out.println("Character at index 4: " + ch);
    }
}
