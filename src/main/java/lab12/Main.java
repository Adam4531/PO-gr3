package lab12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercise1:");
        LinkedList<String> pracownicy = new LinkedList<>();
        pracownicy.add("Jan");
        pracownicy.add("Szymon");
        pracownicy.add("Eugeniusz");
        pracownicy.add("Robert");
        pracownicy.add("Maciej");
        pracownicy.add("Sebastian");
        pracownicy.add("Janusz");
        pracownicy.add("Janusz");
        pracownicy.add("Bartosz");
        pracownicy.add("Bartek");
        System.out.println(pracownicy);
        redukuj(pracownicy,3);
        System.out.println(pracownicy);
        System.out.println();

        System.out.println("\nExercise2:");
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jan"));
        employees.add(new Employee("Szymon"));
        employees.add(new Employee("Eugeniusz"));
        employees.add(new Employee("Robert"));
        employees.add(new Employee("Maciej"));
        employees.add(new Employee("Sebastian"));
        employees.add(new Employee("Janusz"));
        employees.add(new Employee("Janusz"));
        employees.add(new Employee("Bartosz"));
        employees.add(new Employee("Bartek"));
        System.out.println(employees);
        redukujGeneric(employees, 3);
        System.out.println(employees);
        System.out.println();

        System.out.println("\nExercise3:");
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Raz");
        linkedList3.add("Dwa");
        linkedList3.add("Trzy");
        linkedList3.add("Cztery");
        linkedList3.add("Pięć");
        System.out.println(linkedList3);
        odwroc(linkedList3);
        System.out.println("reversed: " + linkedList3);
        System.out.println();

        System.out.println("\nExercise4:");
        LinkedList<Employee> linkedList4 = new LinkedList<>();
        linkedList4.add(new Employee("Raz"));
        linkedList4.add(new Employee("Dwa"));
        linkedList4.add(new Employee("Trzy"));
        linkedList4.add(new Employee("Cztery"));
        linkedList4.add(new Employee("Pięć"));
        System.out.println(linkedList3);
        odwrocGeneric(linkedList3);
        System.out.println("reversed: " + linkedList3);
        System.out.println();

        System.out.println("\nExercise5:");
        System.out.print("Podaj zdanie do odwrocenia jego kolejnosci: ");
        Zad5.reverseSentence();
        System.out.println();

        System.out.println("\nExercise6:");
        podziel(2015);
        System.out.println();

        System.out.println("\nExercise7:");
        sitoEratostenesa(150);
        System.out.println();

        System.out.println("\nExercise8:");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(0,4,19,2,3,6,7,8));
        print(integerList);
    }

    //1
    public static void redukuj(LinkedList<String> pracownicy, int n){
        LinkedList<String> toDelete = new LinkedList<>();
        int counter = 1;

        for (String element: pracownicy) {
            if(counter % n == 0){
                toDelete.add(element);
                counter = 0;
            }
            counter++;
        }
        pracownicy.removeAll(toDelete);
    }

    //2
    public static <T> void redukujGeneric(LinkedList<T> pracownicy, int n){
        LinkedList<T> toDelete = new LinkedList<>();
        int counter = 1;

        for (T element: pracownicy) {
            if(counter % n == 0){
                toDelete.add(element);
                counter = 0;
            }
            counter++;
        }
        pracownicy.removeAll(toDelete);
    }

    //3
    public static void odwroc(LinkedList<String> lista){
        for (int i = 0; i < lista.size() / 2; i++) {
            String temp = lista.get(lista.size() - (1 + i));
            lista.set(lista.indexOf(temp), lista.get(i));
            lista.set(i, temp);
        }
    }

    //4
    public static <T> void odwrocGeneric(LinkedList<T> lista){
        for (int i = 0; i < lista.size() / 2; i++) {
            T temp = lista.get(lista.size() - (1 + i));
            lista.set(lista.indexOf(temp), lista.get(i));
            lista.set(i, temp);
        }
    }

    //6
    public static void podziel(int n){
        Stack<Integer> integerStack = new Stack<>();
        int temp;

        while (n!=0){
            temp = n % 10;
            integerStack.push(temp);
            n = n/10;
        }

        while(!integerStack.isEmpty()){
            int number = integerStack.pop();
            System.out.print(number + " ");
        }
    }

    //7
    public static void sitoEratostenesa(int n){
        LinkedList<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i < n; i++) {
            primeNumbers.add(i);
        }
        System.out.println("all numbers up to " + n + ":" + primeNumbers);

        for (int i = 0; i < Math.sqrt(n); i++) {
            for (int j = 0; j < primeNumbers.size(); j++) {
                if(!primeNumbers.get(i).equals(primeNumbers.get(j)) && primeNumbers.get(j) % primeNumbers.get(i) == 0){
                    primeNumbers.remove(i);
                }
            }
        }
        System.out.println(primeNumbers);
    }

    //8
    public static <T extends Iterable<E>, E> void print(T object){
        Iterator<E> iterator = object.iterator();

        iterator.forEachRemaining( element -> System.out.print(element + ", "));
    }
}
