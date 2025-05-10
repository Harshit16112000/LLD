import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
    List<WareHouse> warehouseList;
    private static InventoryManagement instance;

    private InventoryManagement() {
        warehouseList = new ArrayList<>();
    }

    public static synchronized InventoryManagement logger() {
        if (instance != null)
            return instance;
        return new InventoryManagement();
    }

    public void addWarehouse(WareHouse warehouse) {
        warehouseList.add(warehouse);
    }

    public void removeWarehouse(WareHouse warehouse) {
        warehouseList.remove(warehouse);
    }

    public void getList(WareHouse wareHouse) {
        wareHouse.getList();
    }
}
