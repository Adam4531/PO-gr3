package lab10.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String aNazwisko, LocalDate aDataUrodzenia, double aSredniaOcen) {
        super(aNazwisko, aDataUrodzenia);
        sredniaOcen = aSredniaOcen;
    }

    public int compareTo(Student o) {
        return this.sredniaOcen == o.sredniaOcen ? super.compareTo(o) : this.sredniaOcen > o.sredniaOcen ? -1 : 1;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    @Override
    public String toString() {
        return "Student[nazwisko='" + this.getNazwisko() + "\', " +
                "dataUrodzenia=" + this.getDataUrodzenia().toString() +
                ", sredniaOcen=" + sredniaOcen +
                '}';
    }
}
