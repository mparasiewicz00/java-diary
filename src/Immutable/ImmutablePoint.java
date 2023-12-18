package Immutable;

public class ImmutablePoint {
    private final int immutableX;
    private final int immutableY;

    public ImmutablePoint(int immutableX, int immutableY) {
        this.immutableX = immutableX;
        this.immutableY = immutableY;
    }

    public int getImmutableY() {
        return immutableY;
    }

    public int getImmutableX() {
        return immutableX;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "immutableX=" + immutableX +
                ", immutableY=" + immutableY +
                '}';
    }
}
