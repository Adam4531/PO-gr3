package lab04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Zadanie 1.
public class Lab04Part1 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("countChar:");
        System.out.print("Podaj napis: "); //ala ma kota ala
        String sentence1 = scanner1.nextLine();
        System.out.print("Podaj znak do znalezienia: "); //a
        char c = scanner2.next().charAt(0);
        System.out.println(countChar(sentence1, c));
        System.out.println();

        System.out.println("countSubStr:");
        System.out.print("Podaj napis: ");
        String sentence2 = scanner1.nextLine();
        System.out.print("Podaj substring do znalezienia: ");
        String substr1 = scanner2.next();
        System.out.println(countSubStr(sentence2, substr1));
        System.out.println();

        System.out.println("middle:");
        System.out.print("Podaj napis: ");
        String sentence3 = scanner1.next();
        System.out.println(middle(sentence3));
        System.out.println();

        System.out.println("repeat:");
        System.out.print("Podaj napis: ");
        String sentence4 = scanner1.next();
        System.out.print("Podaj liczbę powtórzeń: ");
        int n = scanner1.nextInt();
        System.out.println(repeat(sentence4, n));
        System.out.println();

        System.out.println("change: ");
        System.out.print("Podaj napis: ");
        String sentence5 = scanner1.next();
        System.out.println(change(sentence5));
        System.out.println();

        System.out.println("nice:");
        System.out.print("Podaj napis: ");
        String sentence6 = scanner1.next();
        System.out.println(nice(sentence6));

        System.out.println("nice z seperatorem i ustawieniem interwału:");
        System.out.print("Podaj napis: ");
        String sentence7 = scanner1.next();
        System.out.print("Podaj napis: ");
        char seperator = scanner1.next().charAt(0);
        System.out.print("Podaj napis: ");
        int interval = scanner1.nextInt();
        System.out.println(nice(sentence7,seperator,interval));

        System.out.println("where:");
        System.out.print("Podaj napis: ");
        String sentence8 = scanner1.nextLine();
        System.out.print("Podaj substr: ");
        String substr2 = scanner2.next();
        System.out.println(Arrays.toString(where(sentence8,substr2)));

        scanner1.close();
        scanner2.close();
    }

    static int countChar(String str, char c) {
        char[] arr = str.toCharArray();
        int counter = 0;
        if (Character.isLetter(c)) {
            for (char element : arr) {
                if (element == c) {
                    counter++;
                }
            }
        } else {
            throw new IllegalArgumentException("Second variable must be a Character type!");
        }

        return counter;
    }

    static int countSubStr(String str, String substr) {
        int counter = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(substr, lastIndex);

            if (lastIndex != -1) {
                counter++;
                lastIndex += substr.length();
            }
        }
        return counter;
    }

    static String middle(String str) {
        String result;
        int middle = str.length() / 2;
        if (str.length() % 2 != 0) {
            result = String.valueOf(str.charAt(middle));
        } else {
            result = String.valueOf(str.charAt(middle - 1));
            result += String.valueOf(str.charAt(middle));
        }
        return result;
    }

    static String repeat(String sentence, int n) {
        return sentence.repeat(Math.max(0, n));
    }

    static int[] where(String str, String subStr) {
        List<Integer> integerList = new ArrayList<>();
        int lastIndex = 0;
        int counter = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);

            if (lastIndex != -1) {
                integerList.add(counter, lastIndex);
                counter++;
                lastIndex += subStr.length();
            }
        }

        return integerList.stream().mapToInt(i-> i).toArray();
    }

    static String change(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        int count = 0;

        for (Character element: str.toCharArray()) {
            if(Character.isLetter(element) && Character.isLowerCase(element)){
                stringBuffer.replace(count, (count + 1),String.valueOf(Character.toUpperCase(element)));
            } else if(Character.isLetter(element) && Character.isUpperCase(element)){
                stringBuffer.replace(count, (count + 1), String.valueOf(Character.toLowerCase(element)));
            }
            count++;
        }
        return stringBuffer.toString();
    }

    static String nice(String str){
        StringBuffer strReversed = new StringBuffer(str);
        StringBuffer result = new StringBuffer();

        int counter = 0;
        for (Character element: strReversed.reverse().toString().toCharArray()) {
            if(counter == 3){
                result.append("\'").append(element);
                counter = 0;
            } else {
                result.append(element);
            }
            counter++;
        }
        return result.reverse().toString();
    }

    static String nice(String str, Character seperator, int incidence){
        StringBuffer strReversed = new StringBuffer(str);
        StringBuffer result = new StringBuffer();
        int counter = 0;
        for (Character element: strReversed.reverse().toString().toCharArray()) {
            counter++;
            if(counter == incidence){
                result.append(seperator).append(element);
                counter = 0;
            } else {
                result.append(element);
            }
        }
        return result.reverse().toString();
    }


}
