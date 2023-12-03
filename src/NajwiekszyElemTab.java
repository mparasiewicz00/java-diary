public class NajwiekszyElemTab {
    public static void main(String[] args) {

        int[] najwiekszyTab = {12,33,55,7,44,787,11,22,44};
        int liczba = najwiekszyTab[0];

        for (int j : najwiekszyTab) {
            if (j > liczba) {
                liczba = j;
            }
        }
        System.out.println("Największa liczba w tablicy to: " + liczba);
    }
}
