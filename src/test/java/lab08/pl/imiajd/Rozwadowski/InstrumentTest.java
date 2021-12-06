package lab08.pl.imiajd.Rozwadowski;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InstrumentTest {

    @Test
    public void should(){
        ArrayList<Instrument> instruments = new ArrayList<>();
        Skrzypce skrzypce = new Skrzypce("Stradivarius", LocalDate.now());
        Fortepian fortepian = new Fortepian("Yamaha", LocalDate.now().minusYears(2));
        Flet flet = new Flet("Fletovski",LocalDate.of(2000,2,13));

        instruments.add(skrzypce);
        instruments.add(fortepian);
        instruments.add(flet);

        System.out.println("instrumenty: " + instruments);

        assertNotNull(skrzypce);
        assertNotNull(fortepian);
        assertNotNull(flet);
    }

}