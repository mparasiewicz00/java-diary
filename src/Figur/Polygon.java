package Figur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Polygon implements Figur {
    private List<Point> points;

    public Polygon(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public void move(double dx, double dy) {
        for (Point point : points) {
            point.move(dx, dy);
        }
    }

    @Override
    public void flip() {
        // Przerzucanie wielokąta to odwrócenie kolejności punktów
        List<Point> reversedPoints = new ArrayList<>(points);
        Collections.reverse(reversedPoints);
        points = reversedPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polygon polygon = (Polygon) o;
        return points.equals(polygon.points);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }

    @Override
    public Figur clone() {
        List<Point> clonedPoints = new ArrayList<>();
        for (Point point : this.points) {
            clonedPoints.add((Point) point.clone());
        }
        return new Polygon(clonedPoints);
    }
}