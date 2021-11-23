package lab06;

import java.util.Arrays;

public class IntegerSet {

    private boolean[] booleans;
    private final static int size = 101;

    public IntegerSet() {
        booleans = new boolean[size];
    }

    public static IntegerSet union(IntegerSet aIntegerSet1, IntegerSet aIntegerSet2) {
        IntegerSet sum = new IntegerSet();
        for (int i = 1; i < size; i++) {
            if (aIntegerSet1.booleans[i] || aIntegerSet2.booleans[i]) {//aIntegerSet1.booleans[i] == true daje simplify warning
                sum.booleans[i] = true;
            }
        }

        return sum;
    }

    public static IntegerSet intersection(IntegerSet aIntegerSet1, IntegerSet aIntegerSet2) {
        IntegerSet product = new IntegerSet();
        for (int i = 1; i < size; i++) {
            if (aIntegerSet1.booleans[i] && aIntegerSet2.booleans[i]) {
                product.booleans[i] = true;
            }
        }

        return product;
    }

    public void insertElement(int element) {
        if(element >= 1 && element <= 100){
            this.booleans[element] = true;
        } else {
            System.out.println("Expected number in range <1;100> but was: " + element);
        }
    }

    public void deleteElement(int element) {
        if(element >= 1 && element <= 100){
            this.booleans[element] = false;
        } else {
            System.out.println("Expected number in range <1;100> but was: " + element);
        }
    }

    @Override
    public String toString() { //FIXME zmienić
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < size; i++) {
            if (booleans[i]) {      //warning simplify
                stringBuilder.append(i).append(" ");
            }
        }

        return stringBuilder.toString();
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
