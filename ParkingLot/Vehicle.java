public abstract class Vehicle {
    String license;
    VehicleType vehicleType;
    PaymentFeesStrategy paymentFeesStrategy;

    public Vehicle(String license, VehicleType vehicleType, PaymentFeesStrategy paymentFeesStrategy) {
        this.license = license;
        this.vehicleType = vehicleType;
        this.paymentFeesStrategy = paymentFeesStrategy;
    }

    public double calculateFee(int duration) {  
        return paymentFeesStrategy.paymentCharges(vehicleType, duration);
    }
    
    public VehicleType getVehicleType() {
        return vehicleType;
    }

     

}

class CarVehicle extends Vehicle {
    public CarVehicle(String license, PaymentFeesStrategy paymentFeesStrategy) {
        super(license, VehicleType.CAR, paymentFeesStrategy);
    }
}

class BikeVehicle extends Vehicle {
    public BikeVehicle(String license, PaymentFeesStrategy paymentFeesStrategy) {
        super(license, VehicleType.BIKE, paymentFeesStrategy);
    }
}
