package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Student extends Osoba{

    private String kierunek;

    private double sredniaOcen; //średnia ocen

    public Student(String[] aImiona,String aLastName, LocalDate aRokUr, boolean aPlec, String aKierunek, double aSredniaOcen) {
        super(aLastName, aRokUr, aImiona, aPlec);
        kierunek = aKierunek;
        sredniaOcen = aSredniaOcen;
    }

    public String getKierunek() {
        return kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double aSredniaOcen) {
        sredniaOcen = aSredniaOcen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kierunek='" + kierunek + '\'' +
                ", sredniaOcen=" + sredniaOcen +
                '}';
    }
}
