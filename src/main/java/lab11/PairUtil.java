package lab11;


public class PairUtil {

    public static <T> void swap(Pair<T> p){
        T temp = p.getFirst();
        if(p.getFirst() != null && p.getSecond() != null){
            p.setFirst(p.getSecond());
            p.setSecond(temp);
        } else {
            System.out.println("first or second are null!");
        }
    }

}
