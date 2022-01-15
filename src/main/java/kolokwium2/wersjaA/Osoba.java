package kolokwium2.wersjaA;

import java.util.Comparator;

public class Osoba implements Comparable<Osoba>{
    private final String nazwisko;

    public Osoba(String oto_nazwisko) {
        nazwisko = oto_nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public int compareTo(Osoba o) {
        if(!this.nazwisko.equals(o.nazwisko)){
            return this.getNazwisko().compareTo(o.getNazwisko());
        }
        if(o.getClass() != Osoba.class){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
