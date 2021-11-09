package lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//Zadanie 2. znaki
public class Lab04Part2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj znak do którego chcesz obliczyć liczbę wystąpień: ");
        Character character = input.next().charAt(0);

        System.out.print("Podaj nazwę pliku(bez jego rozszerzenie) z jakiego chcesz zliczyć liczbę znaków: ");
        String fileName = input.next();

        File file = new File("src/" + fileName + ".txt");

        if (file.exists() && file.canRead()) {
            Scanner scan = new Scanner(file);

            List<Character> listOfCharacters = new ArrayList<>();
            while (scan.hasNext()) {
                String word = scan.next();
                for (char c : word.toCharArray()) {
                    listOfCharacters.add(c);
                }
            }

            for (char c: fileName.toCharArray()){
                listOfCharacters.add(c);
            }

            Map<Character, Integer> characterMap = new HashMap<>();
            for (Character element : listOfCharacters) {
                Integer frequency = characterMap.get(element);
                characterMap.put(element, frequency == null ? 1 : frequency + 1);
            }

            for (Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
                if (entry.getKey().equals(character)) {
                    System.out.println("Wartość znaku '" + character + "' wynosi: " + entry.getValue());
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