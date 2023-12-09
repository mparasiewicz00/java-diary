package basicTests;

public class basicTests {
    public static void main(String[] args) {
        square_positive_squaredValue();
        square_negative_squaredValue();
        square_zero_zero();
    }
    public static void square_positive_squaredValue(){
        int number = 10;
        int result = tested.square(number);
        assertEquals(100, result);
    }

    public static void square_negative_squaredValue(){
        int number = -5;
        int result = tested.square(number);
        assertEquals(25, result);
    }

    public static void square_zero_zero(){
        int number = 0;
        int result = tested.square(number);
        assertEquals(0, result);
    }

    public static void assertEquals(int expected, int actual) {
        if(expected != actual){
            System.out.println("Wynikiem powinno być: " + expected +
                    " ,a otrzymaliśmy: " + actual);
        }
    }

}
