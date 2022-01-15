package kolokwium2.wersjaD;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ZwierzeFutrzaste zwierzeFutrzaste = new ZwierzeFutrzaste(20,10,"brązowy");
        ZwierzeFutrzaste zwierzeFutrzaste2 = zwierzeFutrzaste.clone();
        System.out.println("zwierzeFutrzaste: " + zwierzeFutrzaste);
        System.out.println("zwierzeFutrzaste - kopia: " + zwierzeFutrzaste2);

        ZwierzeFutrzaste[] tab = new ZwierzeFutrzaste[5];
        tab[0] = new ZwierzeFutrzaste();
        tab[1] = new ZwierzeFutrzaste(100,20,"niebieski");
        tab[2] = new ZwierzeFutrzaste(150,450,"różowy");
        tab[3] = new ZwierzeFutrzaste(12,12,"biały");
        tab[4] = new ZwierzeFutrzaste(1,1,"fioletowy");

        ArrayList<ZwierzeFutrzaste> kopie = przepakowacz(tab);
        System.out.println("kopie" + kopie);

    }

    public static <T extends ZwierzeFutrzaste> ArrayList<T> przepakowacz(T[] tab) throws CloneNotSupportedException {
        ArrayList<T> arrayList = new ArrayList<>();
        for (T aT : tab) {
            arrayList.add((T) aT.clone());
        }

        return arrayList;
    }
}
