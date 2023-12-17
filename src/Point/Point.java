package Point;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }

        if (this.getClass() != o.getClass()){
            return false;
        }


        Point point = (Point) o;
        return this.x == point.x &&
                this.y == point.y;
    }
}
