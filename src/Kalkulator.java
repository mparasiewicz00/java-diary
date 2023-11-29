import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        double wynik = 0;
        String dzialanie;

        System.out.println("Kalkulator 1.0");

        System.out.println("Podaj pierwszą liczbę: ");
        double pierwszaLiczba = getDouble();

        System.out.println("Podaj drugą liczbę: ");
        double drugaLiczba = getDouble();

        System.out.println("""
                Podaj działanie jakie chcesz wykonać:\s
                * mnożenie
                / dzielenie
                - odejmowanie
                + dodawanie
                Wciśnij W jeśli chcesz wyjść z kalkulatora.""");
        dzialanie = getString().toUpperCase();

        do{

            switch (dzialanie){
                case "*" -> {
                    wynik = (pierwszaLiczba * drugaLiczba);
                    System.out.println("Wynik to: " + wynik);
                }
                case "/" -> {

                    if (drugaLiczba != 0){
                        wynik = (pierwszaLiczba / drugaLiczba);
                        System.out.println("Wynik to: " + wynik);
                    } else {
                        System.out.println("Dzielenie przez 0 jest niewykonalne!");
                    }
                }
                case "-" -> {
                    wynik = (pierwszaLiczba - drugaLiczba);
                    System.out.println("Wynik to: " + wynik);
                }
                case "+" -> {
                    wynik = (pierwszaLiczba + drugaLiczba);
                    System.out.println("Wynik to: " + wynik);
                }
                case "W" -> {
                    System.out.println("Koniec");
                }
                default -> {
                    System.out.println("Nieprawidłowa opcja, spróbuj jeszcze raz!");
                }
            }

            System.out.println("Czy chcesz wykonać kolejne działanie? [T/N]");
            String pytanie = getString().toUpperCase();
            if (pytanie.equals("T")){
                pierwszaLiczba = wynik;
                System.out.println("Podaj liczbę:");
                drugaLiczba = getDouble();
                System.out.println("""
                Podaj działanie jakie chcesz wykonać:\s
                * mnożenie
                / dzielenie
                - odejmowanie
                + dodawanie
                Wciśnij W jeśli chcesz wyjść z kalkulatora.""");
                dzialanie = getString();
            } else if (pytanie.equals("N")){
                dzialanie = "W";
            }

        } while(!(dzialanie.equals("W")));

        System.out.println("Zakończono działanie.");
    }
    private static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }

    private static String getString() {
        return new Scanner(System.in).next();
    }
}

