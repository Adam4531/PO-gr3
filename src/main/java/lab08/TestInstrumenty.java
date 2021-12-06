package lab08;

import lab08.pl.imiajd.Rozwadowski.Flet;
import lab08.pl.imiajd.Rozwadowski.Fortepian;
import lab08.pl.imiajd.Rozwadowski.Instrument;
import lab08.pl.imiajd.Rozwadowski.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();

        Flet flet1 = new Flet("Fletovski", LocalDate.now().minusMonths(1));
        Flet flet2 = new Flet("Fletovski", LocalDate.now().minusYears(1));
        Skrzypce skrzypce1 = new Skrzypce("Stradivarius", LocalDate.now().minusYears(2));
        Skrzypce skrzypce2 = new Skrzypce("Stradivarius", LocalDate.now().minusYears(2));
        Fortepian fortepian = new Fortepian("Yamaha", LocalDate.now().minusYears(1));

        Collections.addAll(orkiestra, flet1, flet2, skrzypce1, skrzypce2, fortepian);

        for (Instrument instrument: orkiestra) {
            instrument.dzwiek();
        }


        System.out.println("\nSkład orkiestry:" + orkiestra);
    }
}
