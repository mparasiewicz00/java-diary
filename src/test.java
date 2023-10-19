public class test {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int a = x++;
        int b = ++y;
        int c = ++x;
        int d = ++x;
        int e = ++x;

        System.out.println(x);
        System.out.println(a);
        System.out.println(y);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}