import java.util.Scanner;
public class DodawanieKolejnych {
    public static void main(String[] args) {
        System.out.println("Możesz podać mi liczby w dowolnej ilości, ja je dla Ciebie zsumuję." +
                " Jeśli chcesz zakończyć podawanie wpisz 0.");

        double suma = 0;


        while(true){
            System.out.println("Podaj liczbę:");
            double liczba = getDouble();

            if(liczba == 0){
                break;
            }
            suma += liczba;
        }

        System.out.println("Suma liczb podanych przez Ciebie to: " + suma);
    }

    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }
}
