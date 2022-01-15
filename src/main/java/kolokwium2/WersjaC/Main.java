package kolokwium2.WersjaC;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Wplyw wplyw = new Wplyw(100);
        WplywZOpisem wplyw2 = new WplywZOpisem(100,"opis");
        System.out.println((wplyw.equals(wplyw2)));

        Wplyw[] wplywy = new Wplyw[5];
        wplywy[0] = new Wplyw(100);
        wplywy[1] = new Wplyw(150);
        wplywy[2] = new Wplyw(200);
        wplywy[3] = new Wplyw(300);
        wplywy[4] = new Wplyw(400);
        System.out.println("liczba wplywow: " + zliczacz(wplywy));

    }

    public static <T extends Iterable<T>> int zliczacz(T[] array){
        Iterator<T> iterator = Arrays.stream(array).iterator();

        int counter = 0;
        while (iterator.hasNext()){
            iterator.next();
            counter++;
        }
        return counter;
    }
}
