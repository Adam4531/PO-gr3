package lab07.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Student extends Osoba {

    int rok;

    public Student(String nazwisko, LocalDate rokUr, int aRok) {
        super(nazwisko, rokUr);
        rok = aRok;
    }

    public void learning(){
        System.out.println("learning");
    }

    public int getRok() {
        return rok;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                ", rok=" + rok +
                '}';
    }
}
