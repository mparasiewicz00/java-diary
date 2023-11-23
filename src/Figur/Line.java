package Figur;

class Line implements Figur {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public void move(double dx, double dy) {
        start.move(dx, dy);
        end.move(dx, dy);
    }

    public void flip() {
        // Przerzucanie linii to zamiana punktów końcowych
        Point temp = start;
        start = end;
        end = temp;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

