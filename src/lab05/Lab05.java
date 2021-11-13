package lab05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab05 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13));
        System.out.println("Exercise1: ");

        System.out.println("append:");
        System.out.println(append(arrayList1, arrayList2));
        System.out.println();

        System.out.println("merge:");
        System.out.println(merge(arrayList1, arrayList2));  // 1 6 2 7 3 8 4 9 10 5 11 12 13
        System.out.println(merge(arrayList2, arrayList1));
        System.out.println();

        System.out.println("reversed:");
        System.out.println("reversed array1: " + reversed(arrayList1));
        System.out.println("reversed array2: " + reversed(arrayList2));
        System.out.println();

        System.out.println("reverse:");
        reverse(arrayList1);
        System.out.println("reverse void array1: " + arrayList1);
        reverse(arrayList2);
        System.out.println("reverse void array2: " + arrayList2);
        System.out.println();

        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(9, 7, 4, 9, 11));

        System.out.println("mergesorted:");
        System.out.println(mergesorted(arrayList3,arrayList4));
        System.out.println();
    }

    public static ArrayList<Integer> append(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> result = new ArrayList<>(array1);
        for (int i = 0; i < array2.size(); i++) {
            result.add(array1.size() + i, array2.get(i));
        }

        return result;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> result = new ArrayList<>();

        if (array1.size() > array2.size()) {
            for (int i = 0; i < array1.size(); i++) {
                result.add(array1.get(i));
                result.add(array2.get(i));
                if (array2.size() - 1 == i) {
                    result.addAll(array1.subList(i + 1, array1.size()));
                    return result;
                }
            }
        } else {
            for (int i = 0; i < array2.size(); i++) {
                result.add(array1.get(i));
                result.add(array2.get(i));
                if (array1.size() - 1 == i) {
                    result.addAll(array2.subList(i + 1, array2.size()));
                    return result;
                }
            }
        }

        return result;
    }

    public static ArrayList<Integer> mergesorted(ArrayList<Integer> array1, ArrayList<Integer> array2) {//TODO mergesorted
        ArrayList<Integer> result = new ArrayList<>();

        Collections.sort(array1);
        Collections.sort(array2);

        if (array1.size() > array2.size()) {
            int temp = array1.get(0) > array2.get(0) ? array1.get(0): array2.get(0);
            for (int i = 1; i < array1.size(); i++) {
                if (array1.get(i) > array2.get(i)) {
                    result.add(i - 1,temp);
                    temp = array2.get(i);
                } else {
                    result.add(i - 1,temp);
                    temp = array1.get(i);
                }
                if (array2.size() - 1 == i) {
                    result.addAll(array2.subList(i + 1, array2.size()));
                    return result;
                }
            }
        } else {
            int temp = array1.get(0) > array2.get(0) ? array2.get(0): array1.get(0);
            for (int i = 1; i < array2.size(); i++) {
                if (array1.get(i) > array2.get(i)) {
                    result.add(i - 1,temp);
                    temp = array2.get(i);
                } else {
                    result.add(i - 1,temp);
                    temp = array1.get(i);
                }
                if (array1.size() - 1 == i) {
                    result.addAll(array2.subList(i + 1, array2.size()));
                    return result;
                }
            }
        }

        return result;
    }

    static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>(a);

        for (int i = 0; i < a.size() / 2; i++) {
            int temp = a.get(a.size() - (1 + i));
            result.set(a.indexOf(temp), a.get(i));
            result.set(i, temp);
        }

        return result;
    }

    public static void reverse(ArrayList<Integer> array) {
        if (array != null) {
            for (int i = 0; i < array.size() / 2; i++) {
                int temp = array.get(array.size() - (1 + i));
                array.set(array.indexOf(temp), array.get(i));
                array.set(i, temp);
            }
        } else {
            throw new IllegalArgumentException("ArrayList nie może być null'em!");
        }
    }
}
