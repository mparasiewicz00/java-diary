import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int[] testedNumbers = {-3, -2, -1, 0, 1, 2, 3, 4, 5};

        for (int number : testedNumbers) {
            try {
                int result = factorial(number);
                System.out.println("Silnia dla liczby " + number + " to: " + result);
            } catch (MyException e) {
                System.out.println("Błąd dla liczby " + number + ": " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Błąd dla liczby " + number + ": " + e.getMessage());
            }
        }
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static int factorial(int number) throws MyException {
        if (number < 0) {
            throw new MyException("number nie może być ujemna");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}
