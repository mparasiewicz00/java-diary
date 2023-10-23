import java.util.Scanner;
public class LiczLitery {
    public static void main(String[] args){

        System.out.println("Wpisz słowo, podam ci ilość liter.");
        String slowo = getString();

        System.out.println("Podane słowo ma: " + slowo.length() + " znaków.");


    }
    public static String getString(){
        return new Scanner(System.in).next();
    }
}
