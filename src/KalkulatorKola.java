import java.util.Scanner;
public class KalkulatorKola {
    public static void main(String[] args) {
       final double pi = 3.14;
       String figura;
       String operacja;
       boolean nieprawidlowaOperacja = false;

       /* pobranie operacji */

       System.out.println("Podaj figurę, której chcesz uruchomić kalkulator: T dla trójkąta lub K dla koła ");
       figura = getString();


       if (figura.equals("T")){
          System.out.println("Podaj długość boku trójkąta równobocznego w [cm]");
          double podstawaTrojkata = getDouble();
          System.out.println("Podaj wysokość trójkąta w [cm]");
          double wysokoscTrojkata = getDouble();
          System.out.println("Podaj operację do wykonania: P jeżeli pole lub O jeżeli obwód ");
          operacja = getString();
          if(operacja.equals("P")){
             double poleTrojkata = (podstawaTrojkata * wysokoscTrojkata)/2;
             System.out.println("Obwód trójkąta to:  " + poleTrojkata + "  cm");
          } else if(operacja.equals("O")) {
             double obwodTrojkata = podstawaTrojkata * 3;
             System.out.println("Obwód trójkąta to:  " + obwodTrojkata + "  cm");
          } else {
             nieprawidlowaOperacja = true;
             System.out.println("Nieprawidłowa operacja!");
          }



       } else if(figura.equals("K")) {
          System.out.println("Podaj promien koła w [cm]");
          double promienKola = getDouble();
          System.out.println("Podaj operację do wykonania: P jeżeli pole lub D jeżeli długość ");
          operacja = getString();

          if(operacja.equals("P")){
             double poleKola = pi * Math.pow(promienKola,2); // Math. to funkcje matematyczne
             System.out.println("Pole koła to: " + poleKola + "  cm^2");
          } else if (operacja.equals("D")){
             double dlugoscKola = (2 * pi) * promienKola;
             System.out.println("Obwód koła to: " + dlugoscKola + " cm");
          } else {
             nieprawidlowaOperacja = true;
             System.out.println("Nieprawidłowa operacja!");
          }
       } else {
          nieprawidlowaOperacja = true;
          System.out.println("Nieprawidłowy symbol figury!");
       }

    }

   public static double getDouble() {
      return new Scanner(System.in).nextDouble();
   }

   public static String getString() {
      return new Scanner(System.in).next();
   }
}