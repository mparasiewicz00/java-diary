package PointiLine;

public class TestPointiLine {
    public static void main(String[] args){
        Point point = new Point(1,0);
        Line line = new Line(new Point(1.0, 1.0), new Point(2.0,2.0));

        System.out.println("Punkt przed przesunięciem " + point);
        point.move(2,2);
        System.out.println("Punkt po przesunięciu o wektor " + point);
        point.flip();
        System.out.println("Punkt po przesunięciu symetrycznym względem początku ukł. współrzędnych: " + point);


        System.out.println(line);
        line.move(1.0,1.0);
        System.out.println(line);
        line.flip();
        System.out.println(line);
    }
}
