import java.util.Scanner;

public class dzielPrzezTrzy {
    public static void main(String[] args) {
        int x;

        System.out.println("Podaj liczbe");
        x = getInt();

        if(!(x%3 ==0)) {
            System.out.println("Liczba nie jest podzielna przez zero");
        } else {
            System.out.println("Liczba jest podzielna przez zero");
        }
    }
    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}