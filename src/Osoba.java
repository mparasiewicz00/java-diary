import java.util.Scanner;
public class Osoba {
    public static void main(String[] args) {

        final int ACTUAL_YEAR = 2023;
        int rokUrodzenia;
        int wiekUzytkownika;
        String wiek;
        String imie = null;
        String nazwisko = null;


        while(imie == null) {
            System.out.println("Podaj swoje imię");
            imie = getString();
        }

        while(nazwisko == null) {
            System.out.println("Teraz podaj swoje nazwisko");
            nazwisko = getString();
        }

        System.out.println("Podaj swój rok urodzenia");
        rokUrodzenia = getInt();

        while(rokUrodzenia >= 2023 || rokUrodzenia < 1900){
            System.out.println("Błędny rok urodzenia, podaj prawidłowy rok urodzenia");
            rokUrodzenia = getInt();
        }

        if (rokUrodzenia <= 2000) {
            wiek = "XX";
        } else
            wiek = "XXI";

        wiekUzytkownika = ACTUAL_YEAR - rokUrodzenia;

        System.out.println("Twoje imię to: " + imie + ", a nazwisko to: " + nazwisko);
        System.out.println("Masz " + wiekUzytkownika + " lat, czyli urodziłeś się w " + wiek + " wieku");

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }
}


