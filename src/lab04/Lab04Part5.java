package lab04;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

//Zadanie 5.
public class Lab04Part5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj swoj poczatkowy kapital: ");
        BigDecimal k = new BigDecimal(String.valueOf((scanner.nextBigDecimal())));

        System.out.print("Podaj stope procentowa(np. jak 1% wpisz 1, 2% to 2): ");
        BigDecimal b = new BigDecimal(String.valueOf(scanner.nextBigDecimal()));

        System.out.print("Podaj okres oszczedzania(w latach): ");
        BigInteger n = new BigInteger(String.valueOf(scanner.nextBigInteger()));


        BigDecimal sumOfSaving = k;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            if (b.compareTo(BigDecimal.valueOf(10)) >= 0) {    // 9.compareTo(9) = 0,  5.compareTo(10) = -1, 10.compareTo(5) = 1
                BigDecimal sumOfYear = sumOfSaving.multiply(new BigDecimal("0." + b));
                System.out.println("Adding " + sumOfYear.setScale(2,RoundingMode.FLOOR) + " of savings after: " + i + " year");
                sumOfSaving = sumOfSaving.add(sumOfYear.setScale(2, RoundingMode.FLOOR));
            } else {
                BigDecimal sumOfYear = sumOfSaving.multiply(new BigDecimal("0.0" + b));
                System.out.println("Adding " + sumOfYear.setScale(2,RoundingMode.FLOOR) + " of savings after: " + i + " year");
                sumOfSaving = sumOfSaving.add(sumOfYear.setScale(2, RoundingMode.FLOOR));
            }
        }

        System.out.println("Kapitał początkowy: " + k + " po " + n + " latach jest rowny: " + sumOfSaving.setScale(2, RoundingMode.FLOOR));
    }
}
