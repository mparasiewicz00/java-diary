package elementTest;

public class elementTab {
    public static boolean didElementExist(int[] basicTab, int number){
        for (int i = 0; i < basicTab.length; i++){
            if (basicTab[i] == number){
                return true;
            }
        }
        return false;
    }
}
