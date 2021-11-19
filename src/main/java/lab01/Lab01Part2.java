package lab01;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

//2. Połączenie instrukcji itercyjnej i warunkowej
public class Lab01Part2 extends Lab01{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb, aby dodać je nastepnia do listy i wywołać na nich zadania: ");
        int size = input.nextInt();

        System.out.print("Podaj zakres liczb do wygenerowania (np. wpisanie 100 oznacza psuedolosowanie w zakresie 0-99): ");
        int limit = input.nextInt();

//        List<Integer> integerList = listFill(size);
        List<Integer> integerList = randomFiller(limit,size);

        System.out.println("Zadanie 1.a");
        exercise1a(integerList);
        System.out.println();

        System.out.println("Zadanie 1.b");
        exercise1b(integerList);
        System.out.println();

        System.out.println("Zadanie 1.c");
        exercise1c(integerList);
        System.out.println();

        System.out.println("Zadanie 1.d");
        exercise1d(integerList);
        System.out.println();

        System.out.println("Zadanie 1.e");
        exercise1e(integerList);
        System.out.println();

        System.out.println("Zadanie 1.f");
        exercise1f(integerList);
        System.out.println();

        System.out.println("Zadanie 1.g");
        exercise1g(integerList);
        System.out.println();

        System.out.println("Zadanie 1.h");
        exercise1h(integerList);
        System.out.println();

        System.out.println("Zadanie 2");
        exercise2(integerList);
        System.out.println();

        System.out.println("Zadanie 3");
        exercise3(integerList);
        System.out.println();

        System.out.println("Zadanie 4");
        exercise4(integerList);
        System.out.println();

        System.out.println("Zadanie 1.h");
        exercise5(integerList);
        System.out.println();
    }

    private static void exercise1a(List<Integer> aIntegerList){
        int counter = 0;
        for (int element: aIntegerList) {
            if(element % 2 != 0){
               counter++;
            }
        }
        System.out.println("W liście znajduje sie: " + counter + " liczb nieparzystych");
    }

    private static void exercise1b(List<Integer> aIntegerList){
        int counter = 0;
        for (int element: aIntegerList) {
            if(element % 3 == 0  && element % 5 != 0){
                counter++;
            }
        }
        System.out.println("W liście znajduje sie: " + counter + " liczb podzielnych przez 3 i niepodzielnych przez 5");
    }

    private static void exercise1c(List<Integer> aIntegerList){
        int counter = 0;
        for (int element: aIntegerList) {
            if(element % pow(2,2) == 0){
                counter++;
            }
        }

        System.out.println("W liście znajduje sie: " + counter + " liczb, ktore sa kwadratami liczb nieparzystych");
    }

    private static void exercise1d(List<Integer> aIntegerList){
         int counter = 0;
         for (int i = 1;i < aIntegerList.size(); i++){
             if(i == aIntegerList.size() - 1){
                 continue;
             }
             if(aIntegerList.get(i) < (aIntegerList.get(i-1) + aIntegerList.get(i+1))/2){
                 System.out.println("index: " + i + ", wartosc: " + aIntegerList.get(i));
                 counter++;
             }
         }

        System.out.println("W liście znajduje sie: " + counter + " liczb, ktore spelniaja podany warunek (Zadania 2.1d)");
    }

    private static void exercise1e(List<Integer> aIntegerList){
        int counter = 0;
        for (int i = 0; i < aIntegerList.size(); i++) {
            if(i == 0){
                continue;
            }
            if(aIntegerList.get(i) > pow(2, aIntegerList.get(i)) && aIntegerList.get(i) < factorial(i).intValue()){
                System.out.println("index: " + i + ", wartosc: " + aIntegerList.get(i));
                counter++;
            }
        }
        System.out.println("W liście znajduje sie: " + counter + " liczb, ktore spelniaja podany warunek (Zadania 2.1e)");
    }

    private static void exercise1f(List<Integer> aIntegerList){
        int counter = 0;
        for (int i = 0; i < aIntegerList.size(); i++) {
            if(i  % 2 != 0 && aIntegerList.get(i) % 2 == 0 && aIntegerList.get(i) != 0){
                System.out.println("index: " + i + ", wartosc: " + aIntegerList.get(i));
                counter++;
            }
        }

        System.out.println("W liście znajduje sie: " + counter + " liczb, ktore maja nieparzysty numerek i sa liczbami nie parzystymi");
    }

    private static void exercise1g(List<Integer> aIntegerList){
        int counter = 0;
        for (int element: aIntegerList) {
            if(element % 2 != 0 && element >= 0){
                System.out.println("index: " + counter + ", wartosc: " + element);
                counter++;
            }
        }
        System.out.println("W liście znajduje sie: " + counter + " liczb, ktore sa nieparzyste i nieujemne");
    }

    private static void exercise1h(List<Integer> aIntegerList){
        int counter = 0;
        for (int i = 0; i < aIntegerList.size(); i++) {
            if(abs(aIntegerList.get(i)) < pow(i,2)) {
                counter++;
            }
        }
        System.out.println("W liście znajduje sie: " + counter + " liczb, ktore spelniaja warunek (Zadania 2.1h)");
    }

    private static void exercise2(List<Integer> aIntegerList){
        int suma = 0;
        for (int element: aIntegerList) {
            if(element > 0){
                suma += element;
            }
        }
        suma *= 2;
        System.out.println("Podwojona suma liczb dodatnich z listy wynosi: " + suma);
    }

    private static void exercise3(List<Integer> aIntegerList){
        int counterZero = 0;
        int counterPositive = 0;
        int counterNegative = 0;
        for (int element: aIntegerList) {
            if(element > 0){
                counterPositive++;
            } else if (element < 0){
                counterNegative++;
            } else {
                counterZero++;
            }
        }
        System.out.println("W liscie znajduje sie:\n " + counterPositive + " liczb dodatnich\n" +
                " " + counterNegative + " liczb ujemnych\n" + " i " + counterZero + "zer/a");
    }

    private static void exercise4(List<Integer> aIntegerList){
        Collections.sort(aIntegerList);
        System.out.println("Liczba najmniejsza: " + aIntegerList.get(0));
        System.out.println("Liczba najwieksza: " + aIntegerList.get((aIntegerList.size()) - 1));
    }

    private static void exercise5(List<Integer> aIntegerList){
        int counter = 0;
        for (int i = 0; i < aIntegerList.size(); i++) {
            if(i == aIntegerList.size() - 1){
                continue;
            }
            if(aIntegerList.get(i) > 0 && aIntegerList.get(i + 1) > 0){
                counter++;
                System.out.println("Para nr." + (i+1) + ": " + aIntegerList.get(i) + " i " + aIntegerList.get(i+1));
            }
        }

        System.out.println("Liczba par: " + counter);
    }
}
