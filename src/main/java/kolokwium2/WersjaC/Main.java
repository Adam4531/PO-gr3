package kolokwium22.WersjaC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Wplyw> wplywZOpisemArrayList = new ArrayList<>();
        WplywZOpisem opis1 = new WplywZOpisem(100, "opis1");
        System.out.println(opis1);
        wplywZOpisemArrayList.add(opis1);
        wplywZOpisemArrayList.add(new WplywZOpisem(150,"opis2"));
        wplywZOpisemArrayList.add(new WplywZOpisem(150,"opis3"));
        wplywZOpisemArrayList.add(new WplywZOpisem(200,"opis4"));
        wplywZOpisemArrayList.add(new WplywZOpisem(100,"opis1"));

        System.out.println((zliczacz(wplywZOpisemArrayList)));
    }

    public static <T extends Iterable<T>> int zliczacz(ArrayList<T> aArrayList){
        Iterator<T> iterator = aArrayList.iterator();
        int counter = 0;
        while (iterator.hasNext()){
            iterator.next();
            counter++;
        }
        return counter;
    }

}

class Wplyw implements Iterable<Wplyw>{
    private double kwota;
    private static double suma_wplywow;

    public Wplyw(double oto_wyplyw) {
        kwota = oto_wyplyw;
        suma_wplywow += oto_wyplyw;
    }

    public double getKwota() {
        return kwota;
    }

    @Override
    public String toString() {
        return "Wplyw{" +
                "kwota=" + kwota +
                '}';
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Wplyw wplyw = (Wplyw) aO;
        return Double.compare(wplyw.kwota, kwota) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota);
    }

    @Override
    public Iterator<Wplyw> iterator() {
        return null;
    }
}

class WplywZOpisem extends Wplyw{
    private String opis;

    public WplywZOpisem(double oto_wyplyw, String aOpis) {
        super(oto_wyplyw);
        opis = aOpis;
    }

    @Override
    public String toString() {
        return "WplywZOpisem{" +
                "opis='" + opis + ", kwota=" + super.getKwota() +
                '}';
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        WplywZOpisem that = (WplywZOpisem) aO;
        return Objects.equals(opis, that.opis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opis);
    }
}