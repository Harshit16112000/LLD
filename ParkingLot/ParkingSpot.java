public class ParkingSpot {
    private int spotNumber;
    private VehicleType vehicleType;
    private boolean isAvailable;

    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.isAvailable = true;
    }

    public boolean canPark(VehicleType type) {
        return this.vehicleType == type && this.isAvailable;
    }

    public void parkVehicle() {
        this.isAvailable = false;
        System.out.println("Vehicle parked at spot number: " + spotNumber);
    }

    public void leaveSpot() {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
