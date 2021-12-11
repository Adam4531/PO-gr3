package lab10.pl.imiajd.Rozwadowski;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba> {

    private String nazwisko;
    private final LocalDate dataUrodzenia;

    public Osoba(String aNazwisko, LocalDate aDataUrodzenia) {
        nazwisko = aNazwisko;
        dataUrodzenia = aDataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    protected Osoba clone() throws CloneNotSupportedException {
        return (Osoba) super.clone();
    }

    @Override
    public int compareTo(Osoba o) {
        if(this.nazwisko.equals(o.nazwisko)){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        } else {
            return this.nazwisko.compareTo(o.nazwisko);
        }
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Osoba osoba = (Osoba) aO;
        return nazwisko.equals(osoba.nazwisko) && dataUrodzenia.equals(osoba.dataUrodzenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwisko, dataUrodzenia);
    }

    @Override
    public String toString() {
        return "Osoba[" +
                "nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia.toString() +
                ']';
    }
}
