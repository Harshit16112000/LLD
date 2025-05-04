import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10, 10);
        PaymentWays creditcard = new CreditCardPayment();
        PaymentWays cash = new CashPayment();

        Vehicle car1 = VehicleFactory.createVehicle("ABC123", new EachHourPayment(), VehicleType.CAR);
        
        int carSpot = parkingLot.parkVehicle(car1.getVehicleType());
        System.out.println("Car parked at spot number: " + carSpot);
        
        System.out.println("Is spot available? " + parkingLot.isSpotAvailable(carSpot));
        parkingLot.leaveSpot(carSpot);
        System.out.println("Payment Fees is " + car1.calculateFee(100));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method: 1. Credit Card 2. Cash");
        System.out.println("Enter 1 for Credit Card or 2 for Cash: ");
    
        if(scanner.nextInt() == 1) {
            creditcard.pay(car1.calculateFee(100));
        } else {
            cash.pay(car1.calculateFee(100));
        }


        System.out.println(parkingLot.isSpotAvailable(carSpot));
        
        int carSpot2 = parkingLot.parkVehicle(car1.getVehicleType());
        System.out.println("Car parked at spot number: " + carSpot2);
        int carSpot3 = parkingLot.parkVehicle(car1.getVehicleType());
        System.out.println("Car parked at spot number: " + carSpot3);
        
        scanner.close();
    }
}
