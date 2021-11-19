package lab01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Lab01 {

    public static BigInteger factorial(int number){
        BigInteger factorial = BigInteger.ONE;
        for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(number)) <= 0;i = i.add(BigInteger.ONE)){
            factorial = factorial.multiply(i);
        }
        return factorial;
    }

    public static List<Integer> listFill(int size){
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size;i++){
            System.out.println("Podaj element nr." + (i+1) + ", aby zapisac go w tablicy");
            list.add(scanner.nextInt());
        }
        System.out.println("Wypełniona lista: " + list);

        return list;
    }

    public static List<Integer> randomFiller(int limit, int size){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if(random.nextInt(2) == 1){
                list.add(-(random.nextInt(limit)));
            } else {
                list.add(random.nextInt(limit));
            }
        }
        System.out.println("Wypełniona lista: " + list);

        return list;
    }
}
