package lab11;

public class ArrayUtil<T extends Comparable<T>> {

    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] array, T object) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(object)) {
                return i;
            }
        }

        return -1;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        int min;

        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0)
                    min = j;
            }

            T temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static <T extends Comparable<T>> void mergeSorted(T[] array) {

    }
}
