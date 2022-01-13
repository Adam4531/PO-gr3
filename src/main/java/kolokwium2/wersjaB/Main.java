package kolokwium2.wersjaB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>(Arrays.asList(new Figura(0, 0),
                new Figura(0, 0), new Figura(5, 4), new Figura(4, 5)));

        List<Kwadrat> kwadrats = new ArrayList<>(Arrays.asList(new Kwadrat(1), new Kwadrat(1),
                new Kwadrat(3), new Kwadrat(4), new Kwadrat(5)));

        List<Figura> same1 = new ArrayList<>(Arrays.asList(new Figura(0, 0),
                new Figura(0, 0), new Figura(0, 0), new Figura(0, 0)));

        List<Kwadrat> same2 = new ArrayList<>(Arrays.asList(new Kwadrat(0), new Kwadrat(0),
                new Kwadrat(0), new Kwadrat(1)));

        System.out.println(figuras);
        System.out.println(compareList(figuras));
        System.out.println(figuras);

        System.out.println("sortowanie: " + figuras);
        figuras.sort(Figura::compareTo);
        System.out.println("po sortowaniu:" + figuras);

        System.out.println("same1 figury: " + compareList(same1));
        System.out.println("same2 kwadraty: " + compareList(same2));
    }

    public static <T> boolean compareList(List<T> aList) {
        for (int i = 0; i < aList.size() - 1; i++) {
            for (int j = i+1; j < aList.size(); j++) {
                if (!aList.get(i).equals(aList.get(j))) {
                    System.out.println(aList.get(i) + " nie jest  rowne: " + aList.get(j));
                    return false;
                }
            }
        }
        return true;
    }
}
