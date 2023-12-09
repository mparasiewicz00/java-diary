package indexReturnTest;

public class indexReturnTest {
    public static void main(String[] args) {

        didElementExist_elementExist_searchedElementIndex();
        didElementExist_elementNotExist_minusOne();
        didElementExist_twoElementsExist_firstSearchedElementIndex();

    }

    public static void didElementExist_elementExist_searchedElementIndex(){
        int[] basicTab = {11,167,2,3,1,5};
        int searchedNumber = 167;
        int result = indexReturn.tabIndexReturn(basicTab, searchedNumber);
        assertEquals(1, result);
    }

    public static void didElementExist_elementNotExist_minusOne(){
        int[] basicTab = {11,545,2,3,1,5};
        int searchedNumber = 167;
        int result = indexReturn.tabIndexReturn(basicTab, searchedNumber);
        assertEquals(-1, result);
    }

    public static void didElementExist_twoElementsExist_firstSearchedElementIndex(){
        int[] basicTab = {167,2,3,1,5,167};
        int searchedNumber = 167;
        int result = indexReturn.tabIndexReturn(basicTab, searchedNumber);
        assertEquals(0, result);
    }

    public static void assertEquals (int expected, int actual){
        if (expected != actual){
            System.out.println("Metoda powinna zwrócić: " + expected + " , a otrzymaliśmy: " + actual);
        }
    }
}
