import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {

        System.out.println("Podaj słowo, powiem Ci czy jest palindromem");
        String slowo = getString();
        int dlugosc = slowo.length();
        boolean czyPalindrom = true;

        System.out.print("Podane słowo to:\n");
        for (int i = 0; i < dlugosc; i++){
            System.out.print(slowo.charAt(i) + " ");
        }
        System.out.println("\nPodane słowo od tyłu to: ");

        for (int j = dlugosc - 1; j >= 0; j--){
            System.out.print(slowo.charAt(j) + " ");
        }
        for (int i = 0; i < dlugosc / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) {
                czyPalindrom = false;
                break;
            }
        }

        if (czyPalindrom) {
            System.out.println("Slowo " + slowo + " jest palindromem.");
        } else {
            System.out.println("Slowo " + slowo + " nie jest palindromem.");
        }



    }
    private static String getString(){
        return new Scanner(System.in).next();
    }
}
