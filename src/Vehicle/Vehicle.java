package Vehicle;

public class Vehicle {
    private final String vehicleID;
    private final String vehicleBrand;
    private final int vehicleProductionYear;

    public Vehicle() {
        this("not assigned", "not assigned", 0);
    }

    public Vehicle(String vehicleID) {
        this(vehicleID, "not assigned", 0);
    }

    public Vehicle(String vehicleID, String vehicleBrand) {
        this(vehicleID, vehicleBrand, 0);
    }

    public Vehicle(String vehicleID, String vehicleBrand, int vehicleProductionYear) {
        this.vehicleID = vehicleID;
        this.vehicleBrand = vehicleBrand;
        this.vehicleProductionYear = vehicleProductionYear;
    }
    public String getVehicleID() {
        return vehicleID;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public int getVehicleProductionYear() {
        return vehicleProductionYear;
    }
    @Override
    public String toString() {
        return "Vehicle.Vehicle{" +
                "vehicleID='" + vehicleID + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleProductionYear='" + vehicleProductionYear + '\'' +
                '}';
    }
}
