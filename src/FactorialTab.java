import java.util.Scanner;

public class FactorialTab {
    public static void main(String[] args) {
        int[] factorial = new int[5];
        int result = 1;
        

        for (int i = 0; i < factorial.length; i++){
            System.out.println("Podaj liczbe: ");
            factorial[i] = getInt();
        }
        
        
        for (int i = 0; i <= factorial.length - 1; i++){
            if (factorial[i] != 0){
                for(int j = 1; j <= factorial[i]; j++){
                    result *= j;
                }
                System.out.println("Silnia dla liczby " + factorial[i] + " to: " + result);
            } else {
                System.out.println("Silnia dla 0 to 1");
            }
            result = 1;
        }
    }
    private static int getInt() { return new Scanner(System.in).nextInt();
    }
}
