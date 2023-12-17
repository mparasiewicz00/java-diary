package Point;


public class PointUsage {

    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(1,1);
        Point point3 = new Point(3,3);


        System.out.println("Points: ");
        System.out.println(point2.equals(point1));
        System.out.println(point2.equals(point3));
        System.out.println(point1.equals(point3));

        System.out.println("Figures: ");
        Figure square1 = new Figure(new Point[]{
                new Point(1,1),
                new Point(1,2),
                new Point(2,1),
                new Point(2,2)
        });

        Figure square2 = new Figure(new Point[]{
                new Point(1,1),
                new Point(1,2),
                new Point(2,1),
                new Point(2,2)
        });

        Figure square3 = new Figure(new Point[]{
                new Point(1,1),
                new Point(1,3),
                new Point(3,1),
                new Point(3,3)
        });

        System.out.println(square1.equals(square2));
        System.out.println(square2.equals(square3));
        System.out.println(square1.equals(square3));

    }
}
