import java.util.Scanner;
public class KalkulatorKola {
    public static void main(String[] args) {
       final double pi = Math.PI;
       double[] trojkat = new double[3];
       String opcja;
       String operacja;

       System.out.println("Witaj w kalkulatorze figur, w tej wersji mogę dla Ciebie obliczyć pole lub obwód trójkąta i koła.");

       do {
          System.out.println("Podaj figurę, której chcesz uruchomić kalkulator: T dla trójkąta lub K dla koła lub W jeśli chcesz wyjść z programu ");
          opcja = getString().toUpperCase();

         switch (opcja) {
            case "T":

               System.out.println("Podaj kolejno długości boków trójkąta w [cm], pierwszy podany bok to podstawa");
               for( int i = 0; i < trojkat.length; i++) {
                  trojkat[i] = getDouble();
               }
               if(!(trojkat[0]>0&&trojkat[1]>0&&trojkat[2]>0)){
                  System.out.println("Niepoprawne dane, spróbuj jeszcze raz!");
               } else if (trojkat[0] + trojkat[1] > trojkat[2] && trojkat[1] + trojkat[2] > trojkat[0] && trojkat[0] + trojkat[2] > trojkat[1]) {
                  System.out.println("Podaj operację do wykonania: P jeżeli pole lub O jeżeli obwód ");
                  operacja = getString().toUpperCase();
                  if (operacja.equals("P")) {
                     System.out.println("W takim razie potrzebuję jeszcze wysokości trójkąta.\n" +
                             "Podaj wysokość trójkąta w [cm]");
                     double wysokoscTrojkata = getDouble();
                     double poleTrojkata = (trojkat[0] * wysokoscTrojkata) / 2;
                     System.out.println("Pole trójkąta to:  " + poleTrojkata + "  cm");
                  } else if (operacja.equals("O")) {
                     double obwodTrojkata = trojkat[0] + trojkat[1] + trojkat[2];
                     System.out.println("Obwód trójkąta to:  " + obwodTrojkata + "  cm");
                  } else {
                     System.out.println("Nieprawidłowa operacja!");
                  }
               }
               else {
                  System.out.println("Niepoprawne dane, spróbuj jeszcze raz!");
               }

               break;

            case "K":
               System.out.println("Podaj promien koła w [cm]");
               double promienKola = getDouble();

               if(!(promienKola>0)) {
                  System.out.println("Niepoprawne dane, spróbuj jeszcze raz!");
               } else {
                  System.out.println("Podaj operację do wykonania: P jeżeli pole lub D jeżeli długość ");
                  operacja = getString().toUpperCase();

                  if (operacja.equals("P")) {
                     double poleKola = pi * Math.pow(promienKola, 2); // Math. to funkcje matematyczne
                     System.out.println("Pole koła to: " + poleKola + "  cm^2");
                  } else if (operacja.equals("D")) {
                     double dlugoscKola = (2 * pi) * promienKola;
                     System.out.println("Długość koła to: " + dlugoscKola + " cm");
                  } else {
                     System.out.println("Nieprawidłowa operacja!");
                  }
               }
               break;


            case "W":
               System.out.println("Do widzenia!");
               break;

            default:
               System.out.println("Nieprawidłowa opcja, spróbuj jeszcze raz!");
               break;
            }
       } while (!opcja.equals("W"));
    }

   private static double getDouble() {
      return new Scanner(System.in).nextDouble();
   }

   private static String getString() {
      return new Scanner(System.in).next();
   }
}