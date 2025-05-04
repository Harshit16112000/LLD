public interface PaymentFeesStrategy {
    double paymentCharges(VehicleType vehicleType, int duration);
}

class EachHourPayment implements PaymentFeesStrategy {

    public double paymentCharges(VehicleType vehicleType, int duration) {
        if(vehicleType == VehicleType.BIKE)
        {
            return 100 * duration;
        }
        else {
            return 200 * duration;
        }
    }
}

class PriemiumHoursBasedPayment implements PaymentFeesStrategy {

    public double paymentCharges(VehicleType vehicleType, int duration) {
        if(vehicleType == VehicleType.BIKE)
        {
            return 150 * duration;
        }
        else {
            return 250 * duration;
        }
    }
}
