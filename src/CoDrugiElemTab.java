public class CoDrugiElemTab {
    public static void main(String[] args) {

        int[] pierwsza = {1,2,3,4,5,6,7,8,9,10};
        int[] druga = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for (int i = 0; i < pierwsza.length; i += 2){
            System.out.print(pierwsza[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < druga.length; i += 2){
            System.out.print(druga[i] + ", ");
        }

    }
}
