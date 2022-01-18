package kolokwium2.wersjaB;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] string = new String[]{"jeden", "dwa"};

        ArrayList<Figura> figuras = new ArrayList<>(Arrays.asList(new Figura(0, 0),
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

        Comparator<Figura> figuraComparator = Comparator.comparing(Figura::getObwod).thenComparing(Figura::getPole);

        Collections.sort(figuras, figuraComparator);

        System.out.println("sortowanie: " + figuras);
        figuras.sort(Figura::compareTo);
        System.out.println("po sortowaniu:" + figuras);

        System.out.println("same1 figury: " + compareList(same1));
        System.out.println("same2 kwadraty: " + compareList(same2));
    }

    public static <T> boolean compareList(List<T> aList) {
        for (int i = 0; i < aList.size() - 1; i++) {
            for (int j = i+1; j < aList.size(); j++) {
                if (aList.get(i).hashCode() ==  aList.get(j).hashCode()) {
                    System.out.println(aList.get(i) + " jest  rowne: " + aList.get(j));
                    return true;
                }
            }
        }
        return false;
    }
}
