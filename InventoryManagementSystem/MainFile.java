public class MainFile {
    public static void main(String[] args) {
        System.out.println("Hello WOrld");
        InventoryManagement inventoryManagement = InventoryManagement.logger();

        Product earphone1 = ProductFactory.createProduce("Earphone", 20, 45, null);
        Product phone1 = ProductFactory.createProduce("Phone", 2, 50, null);

        // System.out.println(earphone1.getCount());
        WareHouse wareHouse = new WareHouse();
        inventoryManagement.addWarehouse(wareHouse);

        wareHouse.addProducts(earphone1, earphone1.getCount());
        wareHouse.removeProducts(earphone1, 3);

        wareHouse.addProducts(phone1, phone1.getCount());
        inventoryManagement.getList(wareHouse);

    }
}
