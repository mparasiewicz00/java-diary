package Car;

public class CarUsage {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Black");
        car1.setSpeed(120);


        Car car2 = new Car();
        car2.setColor("White");
        car2.setSpeed(100);

        System.out.println(car1);
        System.out.println(car2);
    }
}
