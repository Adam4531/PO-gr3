package lab07.pl.imiajd.Rozwadowski;

public class Adres {

    private String ulica;
    private String numer_domu;
    private String numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;

    public Adres(String aUlica, String aNumer_domu, String aMiasto, int aKod_pocztowy) { //bez numeru mieszkania
        ulica = aUlica;
        numer_domu = aNumer_domu;
        miasto = aMiasto;
        kod_pocztowy = aKod_pocztowy;
    }

    public Adres(String aUlica, String aNumer_domu, String aNumer_mieszkania, String aMiasto, int aKod_pocztowy) {
        ulica = aUlica;
        numer_domu = aNumer_domu;
        numer_mieszkania = aNumer_mieszkania;
        miasto = aMiasto;
        kod_pocztowy = aKod_pocztowy;
    }

    public String pokaz(){
        if(numer_mieszkania != null){
            return "Adres: " + kod_pocztowy + "," + miasto + "\n" + numer_domu + "/" + numer_mieszkania + ", " + kod_pocztowy;
        } else {
            return "Adres: " + kod_pocztowy + "," + miasto + "\n" + numer_domu + ", " + kod_pocztowy;
        }
    }

    public boolean przed(Adres other){ //TODO refactoring
        if(this.kod_pocztowy < other.kod_pocztowy){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Adres{" +
                "ulica='" + ulica + '\'' +
                ", numer_domu='" + numer_domu + '\'' +
                ", numer_mieszkania='" + numer_mieszkania + '\'' +
                ", miasto='" + miasto + '\'' +
                ", kod_pocztowy=" + kod_pocztowy +
                '}';
    }

}
