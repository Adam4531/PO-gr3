package KolokwiumPO.kolokwium1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zad.1i2");
        double[] doubleTab = stworz_tablice();
        System.out.println("Wypisz tablice: ");
        wypisz_tablice(doubleTab, doubleTab.length);

        System.out.println("Podaj srednia: ");
        System.out.println(policz_srednia(doubleTab, doubleTab.length));

        System.out.println("Wypisz tablice i zwroc mniejsze: ");
        wypisz_tablice(zwroc_mniejsze(doubleTab, doubleTab.length), doubleTab.length);
    }

    static double[] stworz_tablice() {
        int size = 10;
        double[] doubleArray = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            if (i == 0 || i == 1) {
                doubleArray[i] = i;
            } else {
                doubleArray[i] = random.nextInt(3 + 1 - (-1)) + (-1);
            }
        }
        return doubleArray;
    }

    static void wypisz_tablice(double[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + ",");
        }
    }

    static double policz_srednia(double[] array, int size) {
        if (size == 0) {
            return -1;
        } else {
            double suma = 0;
            double mianownik = size;
            for (int i = 0; i < size; i++) {
                suma += array[i];
            }

            return suma / mianownik;
        }
    }

    static double[] zwroc_mniejsze(double[] tab, int size) {
        double[] result = new double[tab.length];
        if (size == 0) {
            result = new double[0];
            return result;
        } else {
            for (int i = 0; i < size; i++) {
                if (tab[i] < policz_srednia(tab, size)) {
                    result[i] = tab[i];
                }
            }
        }
        return result;
    }

}
