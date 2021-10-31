package lab03;

//TODO Add input Scanner to every function and check rest of functions
//Zadanie 1.
public class Lab03Part1 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        System.out.print("countChar:");
        System.out.println(countChar("ala ma kota", 'a'));
        System.out.println();

        System.out.println("countSubStr:");
        System.out.println(countSubStr("ala ma kota ala", "ala"));
        System.out.println();

        System.out.println("middle:");
        System.out.println(middle("kosz"));
        System.out.println();

        System.out.println("repeat:");
        System.out.println(repeat("ho", 3));
        System.out.println();

        System.out.println("change: ");
        System.out.println(change("Jakies Zdanie"));
        System.out.println();

        System.out.println("nice:");
        System.out.println(nice("JakiesSlowo"));

    }

    static int countChar(String str, char c) {
        char[] arr = str.toCharArray();
        int counter = 0;
        if (Character.isLetter(c)) {
            for (char element : arr) {
                if (element == c) {
                    counter++;
                }
            }
        } else {
            throw new IllegalArgumentException("Second variable must be a Character type!");
        }

        return counter;
    }

    static int countSubStr(String str, String substr) {
        int counter = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(substr, lastIndex);

            if (lastIndex != -1) {
                counter++;
                lastIndex += substr.length();
            }
        }
        return counter;
    }

    static String middle(String str) {
        String result;
        int middle = str.length() / 2;
        if (str.length() % 2 != 0) {
            result = String.valueOf(str.charAt(middle));
        } else {
            result = String.valueOf(str.charAt(middle - 1));
            result += String.valueOf(str.charAt(middle));
        }
        return result;
    }

    static String repeat(String sentence, int n) {
        return sentence.repeat(Math.max(0, n));
    }

    static int[] where(String str, String subStr) {
        int[] indexArray = new int[0];
        int lastIndex = 0;
        int counter = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);

            if (lastIndex != -1) {
                indexArray[counter] = lastIndex;
                counter++;
                lastIndex += subStr.length();
            }
        }
        return indexArray;
    }

    static String change(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        int count = 0;

        for (Character element: str.toCharArray()) {
            if(Character.isLetter(element) && Character.isLowerCase(element)){
                stringBuffer.replace(count, (count + 1),String.valueOf(Character.toUpperCase(element)));
            } else if(Character.isLetter(element) && Character.isUpperCase(element)){
                stringBuffer.replace(count, (count + 1), String.valueOf(Character.toLowerCase(element)));
            }
            count++;
        }
        return stringBuffer.toString();
    }

    static String nice(String str){
        StringBuffer strReversed = new StringBuffer(str);
        StringBuffer result = new StringBuffer();

        int counter = 0;
        for (Character element: strReversed.reverse().toString().toCharArray()) {
            if(counter == 3){
                result.append("\'").append(element);
                counter = 0;
            } else {
                result.append(element);
            }
            counter++;
        }
        return result.reverse().toString();
    }

    static String nice(String str, Character seperator, int incidence){
        StringBuffer strReversed = new StringBuffer(str);
        StringBuffer result = new StringBuffer();
        int counter = 0;
        for (Character element: strReversed.reverse().toString().toCharArray()) {
            counter++;
            if(counter == incidence){
                result.append(seperator).append(element);
                counter = 0;
            } else {
                result.append(element);
            }
        }
        return result.reverse().toString();
    }


}
