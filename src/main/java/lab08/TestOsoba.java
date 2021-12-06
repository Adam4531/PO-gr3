package lab08;

import lab08.pl.imiajd.Rozwadowski.Nauczyciel;
import lab08.pl.imiajd.Rozwadowski.Osoba;
import lab08.pl.imiajd.Rozwadowski.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();

        Student student1 = new Student(new String[]{"Sebastian"},"Kowalski", LocalDate.now().minusYears(21),
                true,"Matematyka",4.5);
        Student student2 = new Student(new String[]{"Karolina","Agata"},"Karolewska",
                LocalDate.now().minusYears(22),false,"Informatyka",4.6);
        Nauczyciel nauczyciel1 = new Nauczyciel(new String[]{"Jan","Janusz"},"Kowalczyk",
                LocalDate.now().minusYears(40), true,LocalDate.now().minusYears(15),90000);
        Nauczyciel nauczyciel2 = new Nauczyciel(new String[]{"Agnieszka"},"Agnieszkowska",
                LocalDate.now().minusYears(35),false,LocalDate.now().minusYears(15),80000);

        Collections.addAll(osoby, student1, student2, nauczyciel1, nauczyciel2);

        System.out.println(osoby);
    }
}
