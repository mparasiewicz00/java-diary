package Point;

public class PointUsage {

    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(1,1);
        Point point3 = new Point(3,3);

        System.out.println(point2.equals(point1));
        System.out.println(point2.equals(point3));
        System.out.println(point1.equals(point3));

    }
}
