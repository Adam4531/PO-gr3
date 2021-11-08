package lab02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Zadanie 1
public class Lab02Part1 {
    public static void main(String[] args) {
        System.out.println("Exercise1: ");
        Scanner scanner = new Scanner(System.in);

        int size;
        boolean isIncorrectSize = true;
        do {
            System.out.print("Podaj liczbe elementow do wylosowania (liczba musi byc w przedziale 1-100): ");
            size = scanner.nextInt();
            if(size>=1 && size <= 100){
                isIncorrectSize = false;
            }
        }while (isIncorrectSize);

        int[] tab = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            tab[i] = (random.nextInt(999 + 1 - (-999)) - 999);
        }

        System.out.println("lista: ");
        System.out.println(Arrays.toString(tab));
        System.out.println();

        System.out.println("Exercise1a");
        exercise1a(tab);
        System.out.println();

        System.out.println("Exercise1b");
        exercise1b(tab);
        System.out.println();

        System.out.println("Exercise1c");
        exercise1c(tab);
        System.out.println();

        System.out.println("Exercise1d");
        exercise1d(tab);
        System.out.println();

        System.out.println("Exercise1e");
        exercise1e(tab);
        System.out.println();

        System.out.println("Exercise1f");
        exercise1f(tab);
        System.out.println();

        System.out.println("Exercise1g");
        exercise1g(tab);
        System.out.println();

    }

    private static void exercise1a(int[] tab){
        int oddNumbers = 0;
        int evenNumbers = 0;
        for (int element: tab) {
            if(element % 2 == 0){
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("W tablicy znajduje sie: " + evenNumbers + " liczb parzystych i " + oddNumbers
                + " liczb nieparzystych");
    }

    private static void exercise1b(int[] tab){
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;
        for (int element: tab) {
            if(element > 0){
                positiveNumbers++;
            } else if(element < 0){
                negativeNumbers++;
            } else {
                zeros++;
            }
        }
        System.out.println("W tablicy znajduje sie: " + positiveNumbers + " liczb dodatnich, "
                + negativeNumbers + " liczb ujemnych i " + zeros + " zer");
    }

    private static void exercise1c(int[] tab){
        int max = 0;
        int counter = 0;
        for (int element: tab) {
            if (element > max){
                max = element;
                counter++;
            }
        }
        System.out.println("Najwieksza liczba znajdujaca sie w tablicy jest: " + max +
                " wystepuje ona: " + counter + "raz/y");
    }

    private static void exercise1d(int[] tab){
        int positiveSum = 0;
        int negativeSum = 0;

        for (int element: tab) {
            if(element > 0){
                positiveSum += element;
            } else if(element < 0){
                negativeSum += element;
            }
        }

        System.out.println("Suma dodatnich liczb jest rowna: " + positiveSum + ", a suma ujemnych liczb jest rowna: "
                + negativeSum);
    }

    private static void exercise1e(int[] tab){
        int positiveLength = 0;
        int temp = 0;
        for (int element : tab) {
            if (element > 0) {
                temp++;
            } else {
                if (positiveLength < temp) {
                    positiveLength = temp;
                }
                temp = 0;
            }
        }
        System.out.println("Dlugosc najdluzszego fragmentu dodatnich liczb wynosi: " + positiveLength);
    }

    private static void exercise1f(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0){
                tab[i] = 1;
            } else if (tab[i] < 0){
                tab[i] = -1;
            }
        }

            System.out.println((Arrays.toString(tab)));
    }

    private static void exercise1g(int[] tab) {
        Scanner scanner = new Scanner(System.in);
        boolean isIncorrectSize = true;
        int lewy, prawy;

        System.out.println("Podaj lewy ");
        lewy = scanner.nextInt();

        System.out.println("Podaj prawy ");
        prawy = scanner.nextInt();

        int pom, rozm = (prawy - lewy) / 2 + lewy;
        for (int i = lewy; i <= rozm; i++) {
            pom = tab[i];
            tab[i] = prawy;
            tab[prawy] = pom;
            prawy--;
        }

        System.out.println((Arrays.toString(tab)));
    }

}
