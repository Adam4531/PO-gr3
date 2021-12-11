package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static lab10.TestOsoba.print;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj nazwę pliku(bez jego rozszerzenie): ");
        String fileName = input.next();

        File file = new File("src/main/resources/" + fileName + ".txt"); //lab10Text

        if (file.exists() && file.canRead()) {
            Scanner scan = new Scanner(file);

            ArrayList<String> strings = new ArrayList<>();
            while (scan.hasNext()) {
                String word = scan.next();
                strings.add(word);
            }
            scan.close();
            System.out.println("Przed posortowaniem: ");
            print(strings);

            strings.sort(String::compareToIgnoreCase);

            System.out.println("Po sortowaniu: ");
            print(strings);
        } else {
            System.out.println("Pliku nie znaleziono lub nie jest on odpowiedni do wykonania zadania!");
        }
        input.close();
    }


}
