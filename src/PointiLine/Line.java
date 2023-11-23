package PointiLine;

import PointiLine.Point;

public class Line {

    final Point start;
    final Point end;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public void move(double dx, double dy){
        start.move(dx,dy);
        end.move(dx, dy);

    }

    public void flip(){
        start.flip();
        end.flip();
    }

    @Override
    public String toString(){
        return "Linia z punktu: " + start + "do punktu: " + end;
    }

}
