package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {

    private String producent;

    private LocalDate rokProdukcji;

    public Instrument(String aProducent, LocalDate aRokProdukcji) {
        producent = aProducent;
        rokProdukcji = aRokProdukcji;
    }

    public abstract void dzwiek();

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Instrument that = (Instrument) aO;
        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, rokProdukcji);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
}
