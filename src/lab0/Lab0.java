package lab0;

public class Lab0 {

    public static void main(String[] args) {
        System.out.println("Zadanie1: ");
        exercise1();
        System.out.println();

        System.out.println("Zadanie2: ");
        exercise2();
        System.out.println();

        System.out.println("Zadanie3: ");
        exercise3();
        System.out.println();

        System.out.println("Zadanie4: ");
        exercise4();
        System.out.println();

        System.out.println("Zadanie5: ");
        exercise5();
        System.out.println();


        System.out.println("Zadanie6: ");
        exercise6();
        System.out.println();

//        System.out.println("Zadanie7: ");
//        exercise7();
//        System.out.println();

        System.out.println("Zadanie8: ");
        exercise8();
        System.out.println();

        System.out.println("Zadanie9: ");
        exercise9();
        System.out.println();

        System.out.println("Zadanie10: ");
        exercise10();
        System.out.println();

        System.out.println("Zadanie11: ");
        exercise11();
        System.out.println();

        System.out.println("Zadanie12: ");
        exercise12();
        System.out.println();
    }

    private static void exercise1(){
        int wynik = 31+29+31;
        System.out.println("Sumaryczna liczba dni w 3 pierwszych miesiącach roku przestepnego: " + wynik);
    }

    private static void exercise2(){
        int wynik = 0;
        for (int i=1;i<=10;i++){
            wynik += i;
        }
        System.out.println("Suma 10 pierwszych liczb calkowitych: " + wynik);
    }

    private static void exercise3(){
        int wynik=1;
        for (int i=1;i<=10;i++){
            wynik *= i;
        }
        System.out.println("Iloczyn 10 pierwszych liczb calkowitych: " + wynik);
    }

    private static void exercise4(){
        int kwota = 1000;
        for (int i=1;i<4;i++){
            double temp = kwota * 0.06;
            kwota += temp;
            System.out.println("Suma po " + i + " roku: " + kwota);
        }
    }

    private static void exercise5(){
        System.out.println("+----+");
        System.out.println("|Java|");
        System.out.println("+----+");
    }

    private static void exercise6(){
        System.out.println("  /////");
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("(| o o |)");
        System.out.println("  | ^ |");
        System.out.println(" | ‘-’ |");
        System.out.println(" +-----+");
    }

    private static void exercise7(){
        
    }

    private static void exercise8(){
        System.out.println("   +   ");
        System.out.println("  + +  ");
        System.out.println(" +   + ");
        System.out.println("+-----+");
        System.out.println("| .-. |");
        System.out.println("| | | |");
        System.out.println("+-+-+-+");
    }

    private static void exercise9(){
        System.out.println(" /\\_/\\      ______");
        System.out.println("[ o o ]    / Hello \\");
        System.out.println("(  -  )   < Junior  |");
        System.out.println(" | | |     \\ Coder!/");
        System.out.println("[__|__]     -------");
    }

    private static void exercise10(){
        System.out.println("Joker");
        System.out.println("Anihilacja");
        System.out.println("Deadpool 2");
    }

    private static void exercise11(){
        System.out.println("Nic dwa razy ");
        System.out.println("------------ ");
        System.out.println("Nic dwa razy sie nie zdarza\ni nie zdarzy. Z tej przyczyny\nzrodzilismy sie bez wprawy\ni pomrzemy bez rutyny");
        System.out.println();
        System.out.println("Chocbysmy uczniami byli\nnajtepszymi w szkole swiata,\nnie bedziemy repetowac\nzadnej zimy ani lata.");
        System.out.println();
        System.out.println("Zaden dzien sie nie powtorzy,\nnie ma dwoch podobnych nocy,\ndwoch tych samych pocalunkow,\ndwoch jednakich spojrzen w oczy.");
        System.out.println();
        System.out.println("Wczoraj, kiedy twoje imie\n ktos wymowil przy mnie glosno,\ntak mi bylo, jakby roza\nprzez otwarte wpadla okno.");
        System.out.println();
        System.out.println("Dzis, kiedy jestesmy razem\nodwrocilam twarz ku scianie\nRoza? Jak wyglada roza?\nCzy to kwiat? A moze kamien?");
        System.out.println();
        System.out.println("Czemu ty sie, zla godzino\nz niepotrzebnym mieszasz lekiem?\nJestes - a wiec musisz minac.\nMiniesz - a wiec to jest piekne.");
        System.out.println();
        System.out.println("Usmiechnieci, wspolobjeci\nsprobujemy szukac zgody,\nchoc roznimy sie od siebie\njak dwie krople czystej wody.");
    }

    private static void exercise12(){
        System.out.println("*  *  *  *  *  * ========================================");
        System.out.println(" *  *  *  *  *   ========================================");
        System.out.println("*  *  *  *  *  * ========================================");
        System.out.println(" *  *  *  *  *   ========================================");
        System.out.println("*  *  *  *  *  * ========================================");
        System.out.println(" *  *  *  *  *   ========================================");
        System.out.println("*  *  *  *  *  * ========================================");
        System.out.println("  *  *  *  *  *  ========================================");
        System.out.println("*  *  *  *  *  * ========================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
    }
}
