import java.util.Scanner;

public class Odwrotnosci {
    public static void main(String[] args) {

        String[] slowa = new String[5];

        for (int i = 0; i < slowa.length; i++){
            System.out.println("Podaj słowo: ");
            slowa[i] = getString();
        }

        for (int i = slowa.length - 1 ; i >= 0; i--){
            for (int j = slowa[i].length() - 1; j >= 0; j--){
                System.out.print(slowa[i].charAt(j));
            }
            System.out.println();
        }
    }
    private static String getString(){ return new Scanner(System.in).next();
    }
}
