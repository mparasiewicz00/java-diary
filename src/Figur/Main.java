package Figur;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tworzenie punktów
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(3.0, 4.0);

        // Tworzenie linii
        Line line1 = new Line(new Point(1.0, 2.0), new Point(3.0, 4.0));
        Line line2 = new Line(new Point(5.0, 6.0), new Point(7.0, 8.0));

        // Tworzenie wielokąta
        List<Point> polygonPoints = Arrays.asList(new Point(1.0, 2.0), new Point(3.0, 4.0), new Point(5.0, 6.0), new Point(7.0, 8.0));
        Polygon polygon1 = new Polygon(polygonPoints);

        // Tworzenie grupy
        Group group = new Group();
        group.addFigure(point1);
        group.addFigure(line1);
        group.addFigure(polygon1);

        // Wyświetlanie stanu początkowego
        System.out.println("Początkowy stan:");
        System.out.println("Point 1: " + point1);
        System.out.println("Line 1: " + line1);
        System.out.println("Polygon 1: " + polygon1);
        System.out.println("Group: " + group);

        // Przesuwanie i przerzucanie
        System.out.println("\nOperacje przesuwania i przerzucania:");
        point1.move(2.0, 3.0);
        line1.move(1.0, 1.0);
        polygon1.flip();
        group.move(3.0, 4.0);
        group.flip();

        // Wyświetlanie stanu po operacjach
        System.out.println("Stan po operacjach:");
        System.out.println("Point 1: " + point1);
        System.out.println("Line 1: " + line1);
        System.out.println("Polygon 1: " + polygon1);
        System.out.println("Group: " + group);

        System.out.println("\nTestowanie metody clone:");

        Figur clonedPoint = point1.clone();
        Figur clonedLine = line1.clone();
        Figur clonedPolygon = polygon1.clone();
        Figur clonedGroup = group.clone();

        System.out.println("Cloned Point: " + clonedPoint);
        System.out.println("Cloned Line: " + clonedLine);
        System.out.println("Cloned Polygon: " + clonedPolygon);
        System.out.println("Cloned Group: " + clonedGroup);
    }
}
