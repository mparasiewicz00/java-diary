
import java.util.Scanner;
public class czyPelnoletni {
    public static void main(String[] args) {

        System.out.println("Podaj swój wiek w latach");
        int wiek = new Scanner(System.in).nextInt();

        boolean pelnoletniosc = wiek > 18;

        String komunikat = pelnoletniosc ? "Jesteś pełnoletni" : "Nie jesteś pełnoletni";

        System.out.println(komunikat);
    }
}
