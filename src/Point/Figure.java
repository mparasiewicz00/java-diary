package Point;

import java.util.Arrays;

public class Figure {
    public Point[] vertices;

    public Figure(Point[] vertices) {
        this.vertices = vertices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Figure figure)) {
            return false;
        }
        return Arrays.equals(vertices, figure.vertices);
    }
}
