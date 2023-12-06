import java.util.Scanner;

public class MetodyBasics {
    public static void main(String[] args) {
        welcome();

        System.out.println(subtraction(10,3));

        System.out.println("Podaj liczbę, a powiem ci jaki jest jej kwadrat!");
        System.out.println("Kwadrat podanej liczby to: " + sqrt(getInt()));

        stars(10);

        System.out.println( lastSign("witaj"));


        ifPalindrom("kot");


        int[] tabTest = {1,2,3,4,5};
        System.out.println("Suma liczb w tablicy to: " +tabSum(tabTest));


        System.out.println(sumSigns("Ala ma kota", 'a'));

    }

    public static int getInt(){ return new Scanner(System.in).nextInt();
    }
    public static void welcome() {
        System.out.println("Hello!");
    }
    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int sqrt(int number) {
        return number * number;
    }
    
    public static void stars(int stars) {
        for(int i = 0; i <= stars; i++ ){
            System.out.print("*");
        }
        System.out.println();
    }

    public static String lastSign(String input) {

        return String.valueOf(input.charAt(input.length() -1));
    }
    
    public static void ifPalindrom(String word){
        int dlugosc = word.length();
        boolean ifpali = true;

        for (int i = 0; i < dlugosc / 2; i++) {
            if (word.charAt(i) != word.charAt(dlugosc - 1 - i)) {
                ifpali = false;
                break;
            }
        }

        if (ifpali) {
            System.out.println("Slowo " + word + " jest palindromem.");
        } else {
            System.out.println("Slowo " + word + " nie jest palindromem.");
        }
    }

    public static int tabSum(int[] tab) {
        int summedUp = 0;
        for (int j : tab) {
            summedUp += j;
        }
        return summedUp;
    }

    public static int sumSigns(String word, char signToSum) {
        int sumOfSigns = 0;

        for (int i = 0; i <= (word.length() -1); i++){
            char checkedSign = word.charAt(i);
            if (checkedSign == signToSum){
                sumOfSigns++;
            }
        }
    return sumOfSigns;
    }

}
