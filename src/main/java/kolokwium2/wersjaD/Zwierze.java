package kolokwium2.wersjaD;

public class Zwierze {
    private double masa;
    private double dlugosc;

    public Zwierze(double oto_masa, double oto_dlugosc) {
        masa = oto_masa;
        dlugosc = oto_dlugosc;
    }

    public double getMasa() {
        return masa;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    @Override
    public String toString() {
        return "kolokwium2.wersjaD.Zwierze{" +
                "masa=" + masa +
                ", dlugosc=" + dlugosc +
                '}';
    }
}
