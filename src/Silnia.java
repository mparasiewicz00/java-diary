import java.util.InputMismatchException;
import java.util.Scanner;
public class Silnia {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę, której chcesz obliczyć silnię");
        try {
            factorial(getInt());
        } catch (InputMismatchException e){
            System.out.println("To nie jest liczba! Błąd: " + e.getMessage());
        }

    }
    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }

    public static void factorial(int liczba){
        int wynik = 1;
        if (!(liczba == 0)){
            for(int i = 1;i <= liczba; i++){
                wynik *= i;
            }
            System.out.println("Silnia dla liczby " + liczba + " to: " + wynik);
        } else {
            System.out.println("Silnia dla 0 to 1");
        }
    }
}


