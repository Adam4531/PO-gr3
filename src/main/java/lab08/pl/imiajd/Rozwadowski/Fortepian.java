package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Fortepian extends Instrument{

    public Fortepian(String aProducent, LocalDate aRokProdukcji) {
        super(aProducent, aRokProdukcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("Dzwiek fortepianu");
    }

    @Override
    public String toString() {
        return "Fortepian={'" + super.getProducent() + "\'" + ", z roku: " + super.getRokProdukcji();
    }
}
