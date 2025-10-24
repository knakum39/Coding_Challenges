package Java_coding_challenges;

public class StringPerformanceDemo {
    public static void main(String[] args) {
        String str = "";
        int iterations = 100_000;

       /* for (int i = 0; i < iterations; i++) {
            // This block will run 100,000 times
        }*/

        //1. Using String concatenation

        long startTime = System.currentTimeMillis();
        for(int i=0; i< iterations; i++){
            //str = str + "a";
            str += "a"; // Each concatenation creates a new String object
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String Concatenation: " + (endTime - startTime) + "ms");

        //2. Using StringBuilder
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for(int i=0; i < iterations; i++){
            sb.append("a"); // Modifies the same object
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");

        // Using StringBuffer
        StringBuffer sbuf = new StringBuffer();
        startTime = System.currentTimeMillis();
        for(int i=0; i < iterations; i++){
            sbuf.append("a");// Thread-safe but slightly slower
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime-startTime)+ "ms");
    }
}
/*
String concatenation (+):
Creates a new String object every time because Strings are immutable.
Performance is very poor for many concatenations.

StringBuilder:
Mutable sequence of characters.
Faster than StringBuffer because it’s not synchronized.
Best choice for single-threaded operations.

StringBuffer:
Similar to StringBuilder but thread-safe (synchronized methods).
Slightly slower than StringBuilder due to synchronization overhead.
Use in multi-threaded contexts if multiple threads share the same buffer.

output:
Time taken by String concatenation: 1200 ms
Time taken by StringBuilder: 5 ms
Time taken by StringBuffer: 8 ms*/
