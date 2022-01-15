package lab12;

import java.util.*;

public abstract class Zad5 {

    public static void reverseSentence() {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String word;

        do {
            word = scanner.next();
            stack.push(word);
        } while (word.charAt(word.length() - 1) != '.');

        while (!stack.isEmpty()) {
            System.out.print(checkString(stack.pop()) + " ");
        }
    }

    public static String checkString(String word) {
        if (Character.isUpperCase(word.charAt(0))) {
            return word.toLowerCase() + ".";
        }
        if (word.charAt(word.length() - 1) == '.') {
            return word.substring(0, 1).toUpperCase() + word.substring(1, word.length() - 1);
        }
        return word;
    }
}
