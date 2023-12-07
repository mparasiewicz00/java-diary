import java.util.Scanner;

public class DoTrzechRazySztuka {

    public static void main(String[] args) {
        DoTrzechRazySztuka doTrzechRazySztuka = new DoTrzechRazySztuka();
        doTrzechRazySztuka.zczytajLiczbe();
    }

    public void zczytajLiczbe() {
        Scanner scanner = new Scanner(System.in);
        int iloscProb = 0;

        while (iloscProb < 3) {
            System.out.print("Podaj liczbę typu float: ");
            String input = scanner.nextLine();

            try {
                float liczba = Float.parseFloat(input);
                System.out.println("x = " + liczba);
                return; // Zakończ pętlę po poprawnym wprowadzeniu liczby float
            } catch (NumberFormatException e) {
                System.out.println("Błąd: Wprowadzona wartość nie jest liczbą typu float.");
                iloscProb++;

                if (iloscProb < 3) {
                    System.out.println("Pozostało prób: " + (3 - iloscProb));
                } else {
                    System.out.println("Przekroczono maksymalną liczbę prób.");
                }
            }
        }

        scanner.close();
    }
}
