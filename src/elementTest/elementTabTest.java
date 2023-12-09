package elementTest;

public class elementTabTest {

    public static void main(String[] args) {

        didElementExist_emptyTab_returnFalse();
        didElementExist_elementNotExist_returnFalse();
        didElementExist_elementExist_returnTrue();
        didElementExist_elementExistOnTheFront_returnTrue();
        didElementExist_elementExistOnTheEnd_returnTrue();
    }

    public static void didElementExist_emptyTab_returnFalse () {
        int[] basicTab = new int[5];
        int searchElement = 789;
        boolean result = elementTab.didElementExist(basicTab, searchElement);
        assertEquals(false, result);
    }

    public static void didElementExist_elementNotExist_returnFalse () {
        int[] basicTab = {1,2,3,0,5};
        int searchElement = 4;
        boolean result = elementTab.didElementExist(basicTab, searchElement);
        assertEquals(false, result);
    }
    public static void didElementExist_elementExist_returnTrue () {
        int[] basicTab = {1,2,5916,4,5,2,2,3,5,6};
        int searchElement = 5916;
        boolean result = elementTab.didElementExist(basicTab, searchElement);
        assertEquals(true, result);
    }

    public static void didElementExist_elementExistOnTheFront_returnTrue () {
        int[] basicTab = {167,2,3,1,5};
        int searchElement = 167;
        boolean result = elementTab.didElementExist(basicTab, searchElement);
        assertEquals(true, result);
    }

    public static void didElementExist_elementExistOnTheEnd_returnTrue () {
        int[] basicTab = {1,2,3,0,5,0,0,0,0,0,40000};
        int searchElement = 40000;
        boolean result = elementTab.didElementExist(basicTab, searchElement);
        assertEquals(true, result);
    }

    public static void assertEquals (boolean expected, boolean actual){
        if (expected != actual){
            System.out.println("Metoda powinna zwrócić: " + expected + " , a otrzymaliśmy: " + actual);
        }
    }

}
