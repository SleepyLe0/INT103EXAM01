package map;

import java.util.*;

public class StockManager {

    private Map<String, Integer> inventory;

    public StockManager() {
        this.inventory = new HashMap<>();
    }

    public void addStock(String item, int quantity) {
        if(inventory.containsKey(item)) {
            inventory.put(item, inventory.get(item) + quantity);
        } else {
            inventory.put(item, quantity);
        }
    }

    public void removeStock(String item, int quantity) {
        int stock = inventory.get(item);
        if(stock > quantity) {
            inventory.put(item, stock - quantity);
        } else {
            inventory.remove(item);
        }
    }

    public void displayStock() {
        System.out.println("Inventory:");
        for (var entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
