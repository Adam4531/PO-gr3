package lab03;

import java.math.BigInteger;
import java.util.Scanner;

//Zadanie 4.
public class Lab03Part4 {
    public static void main(String[] args) {
        int counterOfSeeds = 1;
        BigInteger sumOfSeeds = BigInteger.ZERO;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar szachownicy: ");
        int size = scanner.nextInt();

        int[][] tab = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumOfSeeds = sumOfSeeds.add(BigInteger.valueOf(counterOfSeeds));
                tab[i][j] = counterOfSeeds;
                counterOfSeeds *= 2;
            }
        }


        System.out.println("suma nasion: " + sumOfSeeds);

        System.out.println("Szachownica: ");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
