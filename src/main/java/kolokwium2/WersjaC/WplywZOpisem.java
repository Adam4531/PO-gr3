package kolokwium2.WersjaC;

import java.util.Objects;

public class WplywZOpisem extends Wplyw{
    private String opis;

    public WplywZOpisem(double oto_kwota, String aOpis) {
        super(oto_kwota);
        opis = aOpis;
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        if (!super.equals(aO)) return false;
        WplywZOpisem wplyws = (WplywZOpisem) aO;
        return Objects.equals(opis, wplyws.opis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), opis);
    }

    @Override
    public String toString() {
        return "WplywZOpisem{" +
                "opis='" + opis + '\'' + ", kwota= " + super.getKwota() +
                '}';
    }
}
