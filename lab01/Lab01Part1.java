package lab01;

import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

//1. Iteracyjne wczytywanie danych
public class Lab01Part1 extends Lab01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj na ilu liczbach chcesz wywolac dzialania: ");
        int n = scanner.nextInt();

        System.out.println("Wypelnij liste liczbami: ");
        List<Integer> integerList = listFill(n);

        System.out.println("Zadanie1 a: ");
        exercise1a(integerList);
        System.out.println();

        System.out.println("Zadanie1 b: ");
        exercise1b(integerList);
        System.out.println();

        System.out.println("Zadanie1 c: ");
        exercise1c(integerList);
        System.out.println();

        System.out.println("Zadanie1 d: ");
        exercise1d(integerList);
        System.out.println();

        System.out.println("Zadanie1 e: ");
        exercise1e(integerList);
        System.out.println();

        System.out.println("Zadanie1 f: ");
        exercise1f(integerList);
        System.out.println();

        System.out.println("Zadanie 1 g: ");
        exercise1g(integerList);
        System.out.println();

        System.out.println("Zadanie 1 h: ");
        exercise1h(integerList);
        System.out.println();

        System.out.println("Zadanie 1 i: ");
        exercise1i(integerList);
        System.out.println();

        System.out.println("Zadanie 2: ");
        exercise2(n, integerList);
        System.out.println();

        scanner.close();
    }

    private static void exercise1a(List<Integer> aIntegerList) {
        int suma = 0;
        for (Integer aInteger : aIntegerList) {
            suma += aInteger;
        }

        System.out.println("Suma wynosi: " + suma);
    }

    private static void exercise1b(List<Integer> aIntegerList) {
        int iloczyn = 1;
        for (Integer aInteger : aIntegerList) {
            iloczyn *= aInteger;
        }

        System.out.println("Iloczyn wynosi: " + iloczyn);
    }

    private static void exercise1c(List<Integer> aIntegerList) {
        int suma = 0;
        for (Integer aInteger : aIntegerList) {
            suma += abs(aInteger);
        }

        System.out.println("Suma wartosci liczb bezwzglednych wynosi: " + suma);
    }

    private static void exercise1d(List<Integer> aIntegerList) {
        int suma = 0;
        for (Integer aInteger : aIntegerList) {
            suma += sqrt(abs(aInteger));
        }

        System.out.println("Iloczyn pierwiastkow z liczb bezwzglednych wynosi: " + suma);
    }

    private static void exercise1e(List<Integer> aIntegerList) {
        int suma = 1;
        for (Integer aInteger : aIntegerList) {
            suma *= abs(aInteger);
        }

        System.out.println("Iloczyn wartosci liczb bezwzglednych wynosi: " + suma);
    }

    private static void exercise1f(List<Integer> aIntegerList) {
        double iloczyn = 1;
        for (Integer aInteger : aIntegerList) {
            iloczyn *= pow(aInteger, 2);
        }

        System.out.println("Iloczyn wartosci liczb bezwzglednych wynosi: " + iloczyn);
    }

    private static void exercise1g(List<Integer> aIntegerList) {
        int suma = 0;
        int iloczyn = 1;
        for (int a : aIntegerList) {
            suma += a;
            iloczyn *= a;
        }

        System.out.println("Iloczyn wartosci liczb bezwzglednych wynosi: " + suma + ", a iloczyn wynosi: "
                + iloczyn);
    }

    private static void exercise1h(List<Integer> aIntegerList) {
        int wynik = 0;
        for (int i = 0; i < aIntegerList.size(); i++) {
            if (i == aIntegerList.size() - 1) {
                wynik += pow(-1, aIntegerList.size() + 1) * aIntegerList.get(i);
            }
            int a = aIntegerList.get(i);
            if (i % 2 == 0) {
                wynik += (-a);
            } else {
                wynik += a;
            }
        }
        System.out.println("Wynik dzialania wynosi: " + wynik);
    }

    private static void exercise1i(List<Integer> aIntegerList) {
        int wynik = 0;
        int silnia = 1;
        for(int i=0;i < aIntegerList.size(); i++){
            silnia *= (i + 1);
            if(i == aIntegerList.size() - 1){
                wynik += (pow(-1, aIntegerList.size()) * aIntegerList.get(i))/silnia;
            }
            int a = aIntegerList.get(i);
            if(i%2 != 0 || i == 0) {
                a *= -1;
            }
            wynik+=(a/silnia);
        }
        System.out.println(wynik);
    }

    private static void exercise2(int n, List<Integer> list){
        System.out.println("Lista po wypisaniu pierwszego elementu jako ostatni: ");

        for (int i=0;i<n;i++){
            if(i == 0){
                continue;
            } else {
                System.out.println(list.get(i));
            }
            if(i == n - 1){
                System.out.println(list.get(0));
            }
        }
    }
}
