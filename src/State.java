public class State {
    public static void main(String[] args){
        int m = 2;
        double d = 2.0;
        d = m * d;
        int n = 15 + (int) d; {
            int k = 8;
            d = d + k;
            d *= 1;
        }
        d = n  / 4;
        System.out.println(d);

    }
}