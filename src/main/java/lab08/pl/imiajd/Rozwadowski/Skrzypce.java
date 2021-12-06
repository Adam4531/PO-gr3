package lab08.pl.imiajd.Rozwadowski;

import java.time.LocalDate;

public class Skrzypce extends Instrument{

    public Skrzypce(String aProducent, LocalDate aRokProdukcji) {
        super(aProducent, aRokProdukcji);
    }

    @Override
    public void dzwiek() {
        System.out.println("Dzwiek skrzypiec");
    }

    @Override
    public String toString() {
        return "Skrzypce={'" + super.getProducent() + "\'" + ", z roku: " + super.getRokProdukcji();
    }
}
