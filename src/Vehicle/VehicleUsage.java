package Vehicle;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("DW8AC22", "Kia", 2018);
        Vehicle vehicle2 = new Vehicle("LZ75294", "Volkswagen", 2012);
        Vehicle vehicle3 = new Vehicle();

        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
    }
}
