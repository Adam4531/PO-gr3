package lab07.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Nauczyciel extends Osoba {

    private int pensja;

    public Nauczyciel(String aNazwisko, LocalDate aRokUrodzenia, int aPensja) {
        super(aNazwisko, aRokUrodzenia);
        this.pensja = aPensja;
    }

    public int getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "pensja=" + pensja +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
