package lab10;

import lab10.pl.imiajd.Rozwadowski.Osoba;

import java.time.LocalDate;
import java.util.*;

public class TestOsoba {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(new Osoba("Kowalski", LocalDate.now().minusYears(30)));
        grupa.add(new Osoba("Kowalski", LocalDate.now().minusYears(25)));
        grupa.add(new Osoba("Nowakowski", LocalDate.now().minusYears(10)));
        grupa.add(new Osoba("Warszawski", LocalDate.now().minusYears(10)));
        grupa.add(new Osoba("Rozwadowski", LocalDate.now().minusYears(20)));

        print(grupa);

        grupa.sort(Osoba::compareTo);

        System.out.println("po sortowaniu:");
        print(grupa);
    }

    public static <T> void print(ArrayList<T> grupa){
        int counter = 0;
        for (T o: grupa) {
            counter++;
            System.out.println(counter + ". " + o);
        }
    }
}
