package kolokwium2.wersjaA;

public class Obywatel extends Osoba{
    private String pesel;

    public Obywatel(String oto_nazwisko, String oto_pesel) {
        super(oto_nazwisko);
        this.pesel = oto_pesel;
    }

    @Override
    public int compareTo(Osoba o) {
        if(super.compareTo(o) != 0){
            return super.compareTo(o);
        }
        if(o.getClass() != Obywatel.class){
            return 1;
        }
        Obywatel obywatel = (Obywatel) o;
        return this.pesel.compareTo(obywatel.pesel);
    }

    @Override
    public String toString() {
        return "Obywatel{" + "nazwisko=" + super.getNazwisko() +
                "pesel='" + pesel + '\'' +
                '}';
    }
}
