import java.util.Scanner;
public class KalkulatorKola {
    public static void main(String[] args) {
       double pi = 3.14;

       Scanner scan = new Scanner(System.in);
       System.out.println("Podaj promien koła w [cm]");
       double promienKola = scan.nextDouble();

       //pole = pi * (r*r)
       double pole = pi * Math.pow(promienKola,2); // Math. to funkcje matematyczne
       double obwod = (2 * pi) * promienKola;

       System.out.println("Obwód koła to: " + obwod + " cm");
       System.out.println("Pole koła to: " + pole + "  cm^2");

    }
}