import java.util.*;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;
    private int nextSpotNumber = 1;

    public ParkingLot(int carSpots, int bikeSpots) {
        parkingSpots = new ArrayList<>();
        for (int i = 0; i < carSpots; i++) {
            parkingSpots.add(new ParkingSpot(nextSpotNumber++, VehicleType.CAR));
        }
        for (int i = 0; i < bikeSpots; i++) {
            parkingSpots.add(new ParkingSpot(nextSpotNumber++, VehicleType.BIKE));
        }
    }

    public int parkVehicle(VehicleType vehicleType) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.canPark(vehicleType)) {
                spot.parkVehicle();
                return spot.getSpotNumber();
            }
        }
        System.out.println("No available spot for vehicle type: " + vehicleType);
        return -1;
    }

    public void leaveSpot(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                spot.leaveSpot();
                System.out.println("Spot number " + spotNumber + " is now available.");
                return;
            }
        }
        System.out.println("Invalid spot number: " + spotNumber);
    }

    public boolean isSpotAvailable(int spotNumber) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getSpotNumber() == spotNumber) {
                return spot.isAvailable();
            }
        }
        return false;
    }
}
