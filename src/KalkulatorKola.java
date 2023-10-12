import java.util.Scanner;
public class KalkulatorKola {
    public static void main(String[] args) {
       double pi = 3.14;

       /* koło */
       Scanner scan = new Scanner(System.in);
       System.out.println("Podaj promien koła w [cm]");
       double promienKola = scan.nextDouble();

       //pole = pi * (r*r)
       double poleKola = pi * Math.pow(promienKola,2); // Math. to funkcje matematyczne
       double obwodKola = (2 * pi) * promienKola;


       /* trójkąt równoboczny */
       System.out.println("Podaj długość boku trójkąta równobocznego w [cm]");
       double podstawaTrojkata = scan.nextDouble();
       System.out.println("Podaj wysokość trójkąta w [cm]");
       double wysokoscTrojkata = scan.nextDouble();

       double poleTrojkata = (podstawaTrojkata * wysokoscTrojkata)/2;
       double obwodTrojkata = podstawaTrojkata * 3;



       System.out.println("Obwód koła to: " + obwodKola + " cm");
       System.out.println("Pole koła to: " + poleKola + "  cm^2");

       System.out.println("Pole trójkąta to: " + poleTrojkata + " cm^2");
       System.out.println("Obwód trójkąta to: " + obwodTrojkata + "  cm");

    }
}