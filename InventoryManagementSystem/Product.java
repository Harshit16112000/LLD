public abstract class Product {
    private int count;
    private String name;
    private int price;

    int getCount() {
        return count;
    }

    int getPrice() {
        return price;
    }
}

class Earphone extends Product {
    private int count;
    private String name;
    private int price;

    public Earphone(int count, String name, int price) {
        super();
        this.count = count;
        this.name = name;
        this.price = price;
    }

    int getCount() {
        return count;
    }

    int getPrice() {
        return price;
    }
}

class Phone extends Product {
    private int count;
    private String name;
    private int price;

    public Phone(int count, String name, int price) {
        super();
        this.count = count;
        this.name = name;
        this.price = price;
    }

    int getCount() {
        return count;
    }

    int getPrice() {
        return price;
    }
}
