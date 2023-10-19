import java.util.Scanner;
public class Osoba {
    public static void main(String[] args) {

        final int ACTUAL_YEAR = 2023;
        int rokUrodzenia;
        int wiekUzytkownika;
        String wiek = null;
        String imie;
        String nazwisko;


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        imie = scan.nextLine();

        System.out.println("Teraz podaj swoje nazwisko");
        nazwisko = scan.nextLine();

        System.out.println("Podaj swój rok urodzenia");
        rokUrodzenia = scan.nextInt();

        if (rokUrodzenia >= 2023 || rokUrodzenia < 1900) {
            System.out.println("Błędny rok urodzenia");
        }

        if (rokUrodzenia <= 2000) {
            wiek = "XX";
        } else
            wiek = "XXI";

        wiekUzytkownika = ACTUAL_YEAR - rokUrodzenia;

        System.out.println("Twoje imię to: " + imie + ", a nazwisko to: " + nazwisko);
        System.out.println("Masz " + wiekUzytkownika + " lat, czyli urodziłeś się w " + wiek + " wieku");
    }
}


