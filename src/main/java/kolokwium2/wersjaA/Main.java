package kolokwium2.wersjaA;

public class Main {
    public static void main(String[] args) {
        Osoba kowalski = new Osoba("Kowalski");
        Osoba nowak1 = new Osoba("Nowak");
        System.out.println("kowalski vs. nowak1: " + kowalski.compareTo(nowak1));   //ok

        Obywatel nowak2 = new Obywatel("Nowak","123");
        System.out.println("nowak1 vs. nowak123: " + nowak2.compareTo(nowak1));

        Obywatel nowak3 = new Obywatel("Nowak","999");
        System.out.println("nowak123 vs. nowak999: " + nowak2.compareTo(nowak3));

    }

    public static <T> boolean sameToString(T obj1, T obj2, T obj3){
        if (obj1.toString().equals(obj2.toString()) && obj2.toString().equals(obj3.toString())){
            return true;
        }
        return false;
    }
}
