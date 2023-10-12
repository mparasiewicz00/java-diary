import java.util.Scanner;
public class KalkulatorKola {
    public static void main(String[] args) {
       double pi = 3.14;
       double r;
       double pole;
       double obwod;


       Scanner scan = new Scanner(System.in);
       System.out.println("Podaj promien koła w [cm]");
       r= scan.nextDouble();

       pole = pi * (r*r);
       obwod = (2 * pi) * r;

       System.out.println("Obwód koła to:" + obwod);
       System.out.println("Pole koła to:" + pole);

    }
}