import java.util.Scanner;
public class WypiszGwiazdki {
    public static void main(String[] args) {
        System.out.println("Podaj ilość gwiazdek jaką chcesz wypisać:");
        int gwiazdki = new Scanner(System.in).nextInt();

        for (int i = 0; i < gwiazdki; i++){
            System.out.print("*");
        }

    }
}
