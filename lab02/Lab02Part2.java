package lab02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Zadanie 2.
public class Lab02Part2 {
    public static void main(String[] args) {
        System.out.println("Exercise2: ");
        Scanner scanner = new Scanner(System.in);

        int size;
        boolean isIncorrectSize = true;
        do {
            System.out.print("Podaj liczbe elementow do wylosowania (liczba musi byc w przedziale 1-100): ");
            size = scanner.nextInt();
            if (size >= 1 && size <= 100) {
                isIncorrectSize = false;
            }
        } while (isIncorrectSize);

        int[] tab = new int[size];
        generuj(tab, size, -999, 999);
        System.out.println("generuj: ");
        System.out.println(Arrays.toString(tab));

        System.out.println("IleNieparzystych:");
        System.out.println(ileNieparzystych(tab));
        System.out.println();

        System.out.println("IleParzystych:");
        System.out.println(ileParzystych(tab));
        System.out.println();

        System.out.println("ileDodatnich:");
        System.out.println(ileDodatnich(tab));
        System.out.println();

        System.out.println("ileUjemnych:");
        System.out.println(ileUjemnych(tab));
        System.out.println();

        System.out.println("ileZerowych:");
        System.out.println(ileZerowych(tab));
        System.out.println();

        System.out.println("ileMaksymalnych:");
        System.out.println(ileMaksymalnych(tab));
        System.out.println();

        System.out.println("sumaDodatnich:");
        System.out.println(sumaDodatnich(tab));
        System.out.println();

        System.out.println("sumaUjemnych:");
        System.out.println(sumaUjemnych(tab));
        System.out.println();

        System.out.println("dlugoscMaksymalnegoCiaguDodatnich:");
        System.out.println(dlugoscMaksymalnegoCiaguDodatnich(tab));
        System.out.println();

        System.out.println("signum:");
        signum(tab);
        System.out.println();

        System.out.println("odwrocFragment:");
        odwrocFragment(tab);
        System.out.println();
    }

    private static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = random.nextInt(maxWartosc + 1 - minWartosc) + minWartosc;
        }
    }

    private static int ileNieparzystych(int[] tab) {
        int count = 0;
        for (int element : tab) {
            if (element % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private static int ileParzystych(int[] tab) {
        int count = 0;
        for (int element : tab) {
            if (element % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int ileDodatnich(int[] tab) {
        int count = 0;
        for (int element : tab) {
            if (element > 0) {
                count++;
            }
        }
        return count;
    }

    private static int ileUjemnych(int[] tab) {
        int count = 0;
        for (int element : tab) {
            if (element < 0) {
                count++;
            }
        }
        return count;
    }

    private static int ileZerowych(int[] tab) {
        int count = 0;
        for (int element : tab) {
            if (element == 0) {
                count++;
            }
        }
        return count;
    }

    private static int ileMaksymalnych(int[] tab) { //FIXME ile maksymalnych tych samych liczb
        int count = 0;
        int max = 0;
        for (int element : tab) {
            if (element > max) {
                count++;  //jak kolejna liczba będzie przebijać element to count też będzie podbijać
                max = element;
            } else if (element == max) {
                count++;
            }
        }
        return count;
    }

    private static int sumaDodatnich(int[] tab) {
        int positiveSum = 0;
        for (int element : tab) {
            if (element > 0) {
                positiveSum += element;
            }
        }
        return positiveSum;
    }

    private static int sumaUjemnych(int[] tab) {
        int negativeSum = 0;
        for (int element : tab) {
            if (element < 0) {
                negativeSum += element;
            }
        }
        return negativeSum;
    }

    private static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int positiveLength = 0;
        int temp = 0;
        for (int element : tab) {
            if (element > 0) {
                temp++;
            } else {
                if (positiveLength < temp) {
                    positiveLength = temp;
                }
                temp = 0;
            }
        }
        return positiveLength;
    }

    private static void signum(int[] tab){
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0){
                tab[i] = 1;
            } else if (tab[i] < 0){
                tab[i] = -1;
            }
        }
        System.out.println((Arrays.toString(tab)));
    }

    private static void odwrocFragment(int[] tab) {
        Scanner scanner = new Scanner(System.in);
        int lewy, prawy;

        System.out.println("Podaj lewy ");
        lewy = scanner.nextInt();

        System.out.println("Podaj prawy ");
        prawy = scanner.nextInt();

        int pom, srodek_wycinka = (prawy - lewy) / 2 + lewy;
        for (int i = lewy; i <= srodek_wycinka; i++) {
            pom = tab[i];
            tab[i] = prawy;
            tab[prawy] = pom;
            prawy--;
        }
        System.out.println((Arrays.toString(tab)));
    }


}
