import java.util.Scanner;

public class MetodyBasics {
    public static void main(String[] args) {
        welcome();

        System.out.println(subtraction(10,3));

        System.out.println("Podaj liczbę, a powiem ci jaki jest jej kwadrat!");
        System.out.println("Kwadrat podanej liczby to: " + sqrt(getInt()));

        stars(10);

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
    
}
