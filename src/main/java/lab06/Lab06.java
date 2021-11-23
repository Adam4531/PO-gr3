package lab06;

import java.math.BigDecimal;

public class Lab06 {
    public static void main(String[] args) { //więcej przykładów/testów w src/test/java/lab06
        System.out.println("Zadanie1: ");
        RachunekBankowy saver1 = new RachunekBankowy(BigDecimal.valueOf(1000));
        RachunekBankowy saver2 = new RachunekBankowy(BigDecimal.valueOf(3000));

        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println("saver1: " + saver1.getSaldo());
        System.out.println("saver2: " + saver2.getSaldo());

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();

        System.out.println();
        System.out.println(saver1);
        System.out.println(saver2);
        System.out.println();

        RachunekBankowy.setRocznaStopaProcentowa(0.05);

        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver1);
        System.out.println(saver2);

        System.out.println("\nZadanie2:");
        IntegerSet integerSet1 = new IntegerSet();
        IntegerSet integerSet2 = new IntegerSet();

        integerSet1.insertElement(0);
        integerSet1.insertElement(1);
        integerSet1.insertElement(2);
        integerSet1.insertElement(100);
        System.out.println("integerSet1: " + integerSet1);
        integerSet2.insertElement(2);
        integerSet2.insertElement(3);
        integerSet2.insertElement(99);
        System.out.println("integerSet2: " + integerSet2);

        IntegerSet sum = IntegerSet.union(integerSet1,integerSet2);
        System.out.println("union: " + sum);

        IntegerSet integerSet3 = new IntegerSet();
        IntegerSet integerSet4 = new IntegerSet();

        integerSet3.insertElement(1);
        integerSet3.insertElement(2);
        integerSet4.insertElement(1);
        integerSet4.insertElement(2);

        System.out.println(integerSet3.equals(integerSet4));
    }
}
