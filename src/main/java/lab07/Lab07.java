package lab07;

import lab07.pl.imiajd.Rozwadowski.*;

import java.time.LocalDate;

public class Lab07 {
    public static void main(String[] args) {
//        String[] imiona = {"Jan", "Grzegorz"};


        //Adres test
        System.out.println("Adres:");
        Adres adres1 = new Adres("Warszawska","20","10","Gdańsk",1000);
        Adres adres2 = new Adres("Bałtycka","22","Gdańsk",1001);

        System.out.println(adres1.pokaz());
        System.out.println(adres2.pokaz());

        System.out.println("Czy adres nr.1: " + adres1 + " jest przed adresem nr.2:" + adres2 + "? " + (adres1.przed(adres2)));

        //Osoba, Nauczyciel, Student test
        System.out.println("\nKlasy dziedziczące po klasie Osoba: ");
        LocalDate dataUr1 = LocalDate.of(1970,10,23);
        LocalDate dataUr2 = LocalDate.of(1999,1,5);
        int pensja = 40000;

        Nauczyciel nauczyciel = new Nauczyciel("Nauczycielski",dataUr1,pensja);
        Student student = new Student("Studencki", dataUr2, 2);

        System.out.println("\nNauczyciel:");
        System.out.println("nauczciel.toString(): " + nauczyciel);
        System.out.println("gettery:\n pensja: " + nauczyciel.getPensja() + ", nazwisko: " + nauczyciel.getNazwisko()
                + ", rok urodzenia: " + nauczyciel.getRokUrodzenia());

        System.out.println("\nStudent:");
        System.out.println("student.toString(): " + student);
        System.out.println("gettery:\n nazwisko: " + student.getNazwisko() + ", rok urodzenia: " +
                student.getRokUrodzenia() + ", rok studiów: " + student.getRok());

        BetterRectangle prostokat = new BetterRectangle(10,4);
        System.out.println("Pole: " + prostokat.getArea());
        System.out.println("Obwod: " + prostokat.getPerimeter());
    }
}
