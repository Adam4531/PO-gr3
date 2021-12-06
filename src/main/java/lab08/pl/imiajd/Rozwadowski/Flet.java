package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Flet extends Instrument{

    public Flet(String aProducent, LocalDate aRokProdukcji) {
        super(aProducent, aRokProdukcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("Dzwiek fletu");
    }

    @Override
    public String toString() {
        return "Flet={'" + super.getProducent() + "\'" + ", z roku: " + super.getRokProdukcji();
    }
}
