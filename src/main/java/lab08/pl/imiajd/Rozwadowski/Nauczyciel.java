package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Nauczyciel extends Osoba{

    private LocalDate dataZatrudnienia;

    private int pensja;


    public Nauczyciel(String[] aImiona, String aLastName, LocalDate aRokUr, boolean aPlec, LocalDate aDataZatrudnienia, int aPensja) {
        super(aLastName, aRokUr, aImiona, aPlec);
        dataZatrudnienia = aDataZatrudnienia;
        pensja = aPensja;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public int getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "dataZatrudnienia=" + dataZatrudnienia +
                ", pensja=" + pensja +
                '}';
    }
}
