package zadanie_z_wykladu;
// Na podstawie książki Cay Horstmann, Gary Cornell.
// "Java (TM). Podstawy." Wydanie VIII

// Program wykorzystujący zbiór typu HashSet
// w celu pokazania wszystkich słów odczytanych z System.in

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordsInHashSetDemo {
    public static void main(String[] args) {
        // Klasa HashSet implementuje interfejs Set
        try {
            Set<String> words = new HashSet<>(); //5908 unikalnych słów. 2-8 milisekund. 8,3,2,2,5,4
//            Set<String> words = new TreeSet<>(); //5908 unikalnych słów. 16-19 milisekund. 16,18,18,19,14,22
            long totalTime = 0;

//            File file = new File("src/alice30.txt");
            File file = new File("src/main/java/alice30.txt");

            Scanner in = new Scanner(file);
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }

            Iterator<String> iter = words.iterator();
            for (int j = 1; j <= 20; ++j) {
                System.out.println(iter.next());
            }

            System.out.println(". . .");
            System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
        } catch (FileNotFoundException aE) {
            aE.printStackTrace();
        }
    }
}

