public class ProductFactory {
    public static Product createProduce(String type, int count, int price, String types) {
        if (type == "Earphone") {
            return new Earphone(count, types, price);
        }
        return new Phone(count, types, price);
    }
}
