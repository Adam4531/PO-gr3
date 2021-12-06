package lab08;

import lab08.pl.imiajd.Rozwadowski.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lab08 {

    public static void main(String[] args) {
        //TODO przetestować zmiany w klasach: Osoba, Nauczyciel, Student


        ArrayList<Instrument> instruments = new ArrayList<>();
        Skrzypce skrzypce = new Skrzypce("Stradivarius", LocalDate.now());
        Fortepian fortepian = new Fortepian("Yamaha", LocalDate.now().minusYears(2));
        Flet flet = new Flet("Fletovski",LocalDate.of(2000,2,13));

        instruments.add(skrzypce);
        instruments.add(fortepian);
        instruments.add(flet);

        System.out.println("instrumenty: " + instruments);
    }
}
