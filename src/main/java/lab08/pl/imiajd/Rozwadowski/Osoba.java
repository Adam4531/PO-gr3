package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Osoba {

    private String lastName;

    private LocalDate rokUr;

    private String[] imiona;

    private boolean plec;   //płeć

    Osoba(String aLastName, LocalDate aRokUr, String[] aImiona, boolean aPlec) {
        lastName = aLastName;
        rokUr = aRokUr;
        imiona = aImiona;
        plec = aPlec;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getRokUr() {
        return rokUr;
    }

    public String[] getImiona() {
        return imiona;
    }

    public boolean isPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "lastName='" + lastName + '\'' +
                ", rokUr=" + rokUr +
                ", imiona=" + Arrays.toString(imiona) +
                ", plec=" + plec +
                '}';
    }
}
