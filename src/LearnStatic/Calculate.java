package LearnStatic;

public class Calculate {
    public static int factorialOutput;
    public static int sumOfTabOutput;

    public static int factorial(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("Liczba musi być większa od zera");
        } else if (input == 0) {
            return 1;
        } else {
            factorialOutput = 1;
            for (int i = 1; i <= input; i++) {
                  factorialOutput *= i;
            }
            return factorialOutput;
        }
    }

    public static int sumOfTab(int[] tabOfNumbers) {

        for (int i : tabOfNumbers) {
            sumOfTabOutput += i;
        }
        return sumOfTabOutput;
    }
}
