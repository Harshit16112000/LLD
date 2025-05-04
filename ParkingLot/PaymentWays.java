public interface PaymentWays {
    void pay(double amount);
}

class CreditCardPayment implements PaymentWays {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentWays {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

class CashPayment implements PaymentWays {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}
