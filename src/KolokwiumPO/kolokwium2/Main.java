package KolokwiumPO.kolokwium2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = stworz_tablice();
        System.out.println("Wypisz stworzona tablice: ");
        wypisz_tablice(intArray, intArray.length);
        System.out.println("Maksimum: " + wyznacz_maksimum(intArray, intArray.length));

        int[] zwrocMniejszeTab = zwroc_mniejsze(intArray, intArray.length);
        System.out.println("zwróć tablicę mniejszych od maksimum");
        wypisz_tablice(zwrocMniejszeTab, intArray.length);
    }

    static int[] stworz_tablice(){
        Random random = new Random();
        int size = 10;

        int[] tab = new int[size];
        for (int i = 0; i < size; i++) {
            if(i == 0 || i == 1){
                tab[i] = i;
            } else {
                tab[i] = random.nextInt(3 + 1 - (-1)) + (-1);
            }
        }

        return tab;
    }

    static void wypisz_tablice(int[] tab, int size){
        for (int i = 0; i < size; i++) {
            System.out.println(tab[i] + ", ");
        }
        System.out.println();
    }

    static double wyznacz_maksimum(int[] tab, int size){
        double max = tab[0];
        if(size == 0){
            return -1;
        } else {
            for (int i = 1; i < size; i++) {
                if(tab[i] > max){
                    max = tab[i];
                }
            }
        }
        return max;
    }

    static int[] zwroc_mniejsze(int tab[], int size){
        int[] result = new int[size - ileMaksimum(tab)];
        if(size == 0){
            result = new int[0];
        } else {
            for (int i = 0; i < size; i++) {
                if(wyznacz_maksimum(tab, size) > tab[i]){
                    result[i] = tab[i];
                }
            }

        }
        return result;
    }
    
    static int ileMaksimum(int[] tab){
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == wyznacz_maksimum(tab,tab.length)){
                counter++;
            }
        }
        return counter;
    }
}
