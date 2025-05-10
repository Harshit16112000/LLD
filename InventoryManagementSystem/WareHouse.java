import java.util.HashMap;
import java.util.Map;

public class WareHouse {

    Map<Product, Integer> products = new HashMap<>();

    public void addProducts(Product product, int count) {
        if (products.get(product) != null)
            products.put(product, products.get(product) + count);
        else
            products.put(product, count);

    }

    public void removeProducts(Product product, int count) {
        System.out.println("Before removing the count is " + products.get(product));
        products.put(product, products.get(product) - count);
        if (products.get(product) < 0) {
            System.out.println("All the element are removed");
            products.remove(product);
        }
        System.out.println("After removing the elemnt the count is " + products.get(product));
    }

    public void getList() {
        products.forEach((product, count) -> {
            System.out.println(product + " => " + count);
        });
    }

}
