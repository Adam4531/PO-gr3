package lab03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Zadanie 3. słowa
public class Lab03Part3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj slowo do którego chcesz obliczyć liczbę wystąpień(case-sensitive): ");
        String word = input.next();

        System.out.print("Podaj nazwę pliku(bez jego rozszerzenie) z jakiego chcesz zliczyć liczbę znaków: ");
        String fileName = input.next();

        File file = new File("src/" + fileName + ".txt");

        if (file.exists() && file.canRead()) {
            Scanner scan = new Scanner(file);

            List<String> listOfWords = new ArrayList<>();
            while (scan.hasNext()) {
                listOfWords.add(scan.next());
            }

            Map<String, Integer> wordMap = new HashMap<>();
            for (String element : listOfWords) {
                Integer frequency = wordMap.get(element);
                wordMap.put(element, frequency == null ? 1 : frequency + 1);
            }

            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                if (entry.getKey().equals(word)) {
                    System.out.println("Wartość znaku '" + word + "' wynosi: " + entry.getValue());
                    break;
                }
            }
            scan.close();
        } else {
            System.out.println("Pliku nie znaleziono lub nie jest on odpowiedni do wykonania zadania!");
        }
        input.close();
    }
}