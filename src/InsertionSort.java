import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        int[] sort = new int[5];

        for (int i = 0; i < sort.length; i++){
            System.out.println("Podaj liczbe: ");
            sort[i] = getInt();
        }

        for (int i = 1; i < sort.length; i++){
            int key = sort[i];
            int j = i - 1;
            while (j >= 0 && sort[j] > key){
                sort[j + 1] = sort[j];
                j--;
            }
            sort[j + 1]= key;
        }

        System.out.println("Posortowane elementy tablicy: ");
        for ( int i : sort){
            System.out.print(i + ", ");
        }
    }
    private static int getInt() { return new Scanner(System.in).nextInt();
    }
}
