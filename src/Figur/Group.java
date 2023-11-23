package Figur;

import java.util.ArrayList;
import java.util.List;

class Group implements Figur {
    private List<Figur> figures = new ArrayList<>();

    public void addFigure(Figur figure) {
        figures.add(figure);
    }

    public void move(double dx, double dy) {
        for (Figur figure : figures) {
            figure.move(dx, dy);
        }
    }

    public void flip() {
        for (Figur figure : figures) {
            figure.flip();
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return figures.equals(group.figures);
    }

    public String toString() {
        return "Group{" +
                "figures=" + figures +
                '}';
    }
}
