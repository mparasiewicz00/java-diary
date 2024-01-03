package Factorial;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        boolean isGiven = false;

        while (!isGiven) {
            System.out.println("Enter the number to calculate factorial: ");
            try {
                try {
                    factorial(getInt());
                    isGiven = true;
                } catch (NegativeValueForFactorialException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } catch (InputMismatchException e) {
                System.out.println("This is not a number! Error: " + e.getMessage());
            }
        }

    }
    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
    public static void factorial(int liczba) throws NegativeValueForFactorialException {
        int wynik = 1;

        if (liczba < 0) {
            throw new NegativeValueForFactorialException("Negative value is inappropriate!");
        }
        else if (liczba > 0){
            for(int i = 1;i <= liczba; i++){
                wynik *= i;
            }
            System.out.println("Factorial of " + liczba + " is: " + wynik);
        } else {
            System.out.println("Factorial for 0 is 1");
        }
    }
}


