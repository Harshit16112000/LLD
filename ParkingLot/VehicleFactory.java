    public class VehicleFactory {
    public static Vehicle createVehicle(String license, PaymentFeesStrategy paymentFeesStrategy, VehicleType vehicleType) {
        if(vehicleType == VehicleType.CAR)
            return new CarVehicle(license, paymentFeesStrategy);
        else
            return new BikeVehicle(license, paymentFeesStrategy);
    }
}
