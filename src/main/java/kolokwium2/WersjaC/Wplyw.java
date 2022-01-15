package kolokwium2.WersjaC;

import java.util.Iterator;
import java.util.Objects;

public class Wplyw implements Iterable<Wplyw>{
    private double kwota;
    private static double suma_wplywow;

    public Wplyw(double oto_kwota) {
        kwota = oto_kwota;
        suma_wplywow += oto_kwota;
    }

    public double getKwota() {
        return kwota;
    }

    public static double getSuma_wplywow() {
        return suma_wplywow;
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
    public String toString() {
        return "Wplyw{" +
                "kwota=" + kwota +
                '}';
    }

    @Override
    public Iterator<Wplyw> iterator() {
        return null;
    }
}
