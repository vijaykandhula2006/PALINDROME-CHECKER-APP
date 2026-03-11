import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Two Pointer Method
    public static boolean twoPointerCheck(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Stack Method
    public static boolean stackCheck(String word) {

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        for (char c : word.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Two Pointer timing
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long endTime1 = System.nanoTime();

        // Stack timing
        long startTime2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long endTime2 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time: " + (endTime1 - startTime1) + " ns");

        System.out.println();

        System.out.println("Stack Result: " + result2);
        System.out.println("Execution Time: " + (endTime2 - startTime2) + " ns");
    }
}