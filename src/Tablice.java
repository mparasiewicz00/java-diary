public class Tablice {
    public static void main(String[] args) {

        int[] pierwsza = {1,2,3,4,5,6,7,8,9,10};
        int[] trzecia = {1,2,3,4,5,6,7,8,9,10};

        String[] druga;
        druga= new String[]{"Ala", "ma", "kota"};
        System.out.println(druga[1].length());

        for (int i = 0; i < pierwsza.length; i++){
            System.out.print(pierwsza[i] + " ");
        }

        System.out.println();

        for (int x : pierwsza) {
            System.out.print(x + ", ");
        }

        System.out.println();
        if (pierwsza.length != trzecia.length){
            System.out.println("Tablice nie są takie same");
        } else {
            boolean czyRoznica = false;

            for (int i = 0; i < pierwsza.length; i++) {

                if(pierwsza[i] != trzecia[i]){
                    czyRoznica = true;
                    break;
                }
            }
            if (czyRoznica){
                System.out.println("Tablice nie sa takie same");

            }else {
                System.out.println("Tablice są takie same");
            }
        }

    }
}
