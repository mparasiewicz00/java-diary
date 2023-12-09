package elementTest;

public class elementTab {
    public static boolean didElementExist(int[] basicTab, int number){
        for (int j : basicTab) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}
