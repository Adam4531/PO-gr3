package kolokwium2.wersjaB;

import java.util.Objects;

public class Kwadrat extends Figura{
    private double szerokosc;

    public Kwadrat(double oto_dlugosc_boku) {
        szerokosc = oto_dlugosc_boku;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        if (!super.equals(aO)) return false;
        Kwadrat kwadrat = (Kwadrat) aO;
        return Double.compare(kwadrat.szerokosc, szerokosc) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), szerokosc);
    }

    @Override
    public String toString() {
        return "Kwadrat{" +
                "szerokosc=" + szerokosc + ", obwod=" + super.getObwod() + ", pole=" + super.getPole() +
                '}';
    }

}
