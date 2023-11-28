import java.util.Objects;
import java.util.Scanner;
public class PorownywarkaLiczb {
    public static void main(String[] args) {

        System.out.println("Wprowadź liczbę: ");
        int pierwszaLiczba = getInt();
        int drugaLiczba;
        int najwiekszaLiczba = pierwszaLiczba;

        boolean potwierdzenie = true;

        do {
            System.out.println("Podaj liczbę którą chcesz porównać z poprzednimi: ");
            drugaLiczba = getInt();

            if (drugaLiczba > najwiekszaLiczba){
                 najwiekszaLiczba = drugaLiczba;
            }

            System.out.println("Czy chcesz podać kolejną liczbę? Wpisz [T/N]");
            String pytanie = getString().toUpperCase();

             potwierdzenie = pytanie.equals("N") ? false : true;

        } while (potwierdzenie);

        System.out.println("Największą liczbą z podanych jest: " + najwiekszaLiczba);

    }
    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    private static String getString(){
        return new Scanner(System.in).next();
    }
}
