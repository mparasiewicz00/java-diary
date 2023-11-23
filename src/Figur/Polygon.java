package Figur;
import java.util.ArrayList;
import java.util.List;

class Polygon implements Figur {
    private List<Point> points;

    public Polygon(List<Point> points) {
        this.points = points;
    }


    public void move(double dx, double dy) {
        for (Point point : points) {
            point.move(dx, dy);
        }
    }


    public void flip() {
        // Przerzucanie wielokąta to odwrócenie kolejności punktów
        List<Point> reversedPoints = new ArrayList<>(points);
        java.util.Collections.reverse(reversedPoints);
        points = reversedPoints;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return points.equals(polygon.points);
    }


    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
}
