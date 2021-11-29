package lab07.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public abstract class Osoba {

    String nazwisko;
    LocalDate rokUrodzenia;

    Osoba(String aNazwisko, LocalDate aRokUrodzenia) {
        nazwisko = aNazwisko;
        rokUrodzenia = aRokUrodzenia;
    }

    public final String getNazwisko() {
        return nazwisko;
    }

    public final LocalDate getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }
}
