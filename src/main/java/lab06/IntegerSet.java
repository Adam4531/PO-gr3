package lab06;

import java.util.Arrays;

public class IntegerSet {

    private boolean[] booleans;
    private final static int size = 100;

    public IntegerSet() {
        booleans = new boolean[size];
    }

    public static IntegerSet union(IntegerSet aIntegerSet1, IntegerSet aIntegerSet2){
        IntegerSet sum = new IntegerSet();
        for (int i = 1; i < size; i++) {
            if(aIntegerSet1.booleans[i] || aIntegerSet2.booleans[i]){//aIntegerSet1.booleans[i] == true daje simplify warning
                sum.booleans[i] = true;
            }
        }

        return sum;
    }

    public static IntegerSet intersection(IntegerSet aIntegerSet1, IntegerSet aIntegerSet2){
        IntegerSet product = new IntegerSet();
        for (int i = 1; i < size; i++) {
            if (aIntegerSet1.booleans[i] && aIntegerSet2.booleans[i]){
                product.booleans[i] = true;
            }
        }

        return product;
    }

    public void insertElement(int element){
        try{
            elementIsNotInRange(element);
        } catch (IllegalArgumentException e){
            System.out.println("Expected number in range <1;100> but was: " + element);
        }

        for (int i = 1; i < size; i++) {
            if(element == i){
                this.booleans[i] = true;
            }
        }
    }

    public void deleteElement(int element){
        try{
            elementIsNotInRange(element);
        } catch (IllegalArgumentException e){
            System.out.println("Expected number in range <1;100> but was: " + element);
        }

        for (int i = 1; i < size; i++) {
            if (element == i){
                this.booleans[i] = false;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < size; i++) {
            if(booleans[i]){
                stringBuilder.append(i).append(" ");
            }
        }

        return stringBuilder.toString();
    }

    private static void elementIsNotInRange(int element){
        if (element < 1 || element > 100){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        IntegerSet that = (IntegerSet) aO;
        return Arrays.equals(booleans, that.booleans);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booleans);
    }
}
