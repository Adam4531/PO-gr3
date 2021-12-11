package lab10;

import lab10.pl.imiajd.Rozwadowski.Osoba;
import lab10.pl.imiajd.Rozwadowski.Student;

import java.time.LocalDate;
import java.util.ArrayList;

import static lab10.TestOsoba.print;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<>();
        grupa.add(new Student("Kowalski", LocalDate.now().minusYears(30),4.0));
        grupa.add(new Student("Kowalski", LocalDate.now().minusYears(25),4.5));
        grupa.add(new Student("Nowakowski", LocalDate.now().minusYears(10),4.5));
        grupa.add(new Student("Warszawski", LocalDate.now().minusYears(10),5.0));
        grupa.add(new Student("Rozwadowski", LocalDate.now().minusYears(20),4.0));

        print(grupa);

        grupa.sort(Osoba::compareTo);

        System.out.println("po sortowaniu:");
        print(grupa);
    }
}
