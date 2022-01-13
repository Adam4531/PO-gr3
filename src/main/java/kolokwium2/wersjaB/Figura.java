package kolokwium2.wersjaB;

import java.util.Comparator;
import java.util.Objects;

public class Figura implements Comparable<Figura> {
    private double obwod;
    private double pole;

    public Figura(double oto_obwod, double oto_pole) {
        obwod = oto_obwod;
        pole = oto_pole;
    }

    public Figura() {
        this.obwod = 0;
        this.pole = 0;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double aObwod) {
        obwod = aObwod;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double aPole) {
        pole = aPole;
    }


    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Figura figura = (Figura) aO;
        return Double.compare(figura.obwod, obwod) == 0 && Double.compare(figura.pole, pole) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(obwod, pole);
    }

    @Override
    public String toString() {
        return "Figura{" +
                "obwod=" + obwod +
                ", pole=" + pole +
                '}';
    }

    @Override
    public int compareTo(Figura o) {
        Comparator<Figura> comparingTitle = Comparator.comparing(Figura::getObwod).thenComparing(Figura::getPole);
        return comparingTitle.compare(o, this);
    }
}
