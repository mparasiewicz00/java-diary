package indexReturnTest;

public class indexReturn {

    public static int tabIndexReturn( int[] basicTab, int searchedNumber){
        for( int i = 0; i < basicTab.length; i++){
            if (basicTab[i] == searchedNumber){
                return i;
            }
        }
        return -1;
    }
}
