import java.util.InputMismatchException;
import java.util.Scanner;
public class Silnia {
    public static void main(String[] args) {
        boolean isGiven = false;

        while (!isGiven) {
            System.out.println("Enter the number to calculate factorial: ");
            try {
                factorial(getInt());
                isGiven = true;

            } catch (InputMismatchException e) {
                System.out.println("This is not a number! Error: " + e.getMessage());
            }
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
            System.out.println("Factorial of " + liczba + " is: " + wynik);
        } else {
            System.out.println("Factorial for 0 is 1");
        }
    }
}


