package Car;

public class Car {
    private int speed;
    private String color;

    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }

    public void setColor(String newColor){
        color = newColor;
    }
    @Override
    public String toString() {
        return "Car.Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
