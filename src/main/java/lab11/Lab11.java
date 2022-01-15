package lab11;

public class Lab11 {
    public static void main(String[] args){
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
         Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("first: " + mm.getFirst());
        System.out.println("last: " + mm.getSecond());
        PairUtil.swap(mm);

        System.out.println("first: " + mm.getFirst());
        System.out.println("last: " + mm.getSecond());

        System.out.println();


    }
}
