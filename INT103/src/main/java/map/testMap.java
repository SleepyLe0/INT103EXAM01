package map;

import java.util.*;

public class testMap {

    public static void main(String[] args) {
        testHashMap();
        testTreeMap();
//        testStock();
    }

    public static void testHashMap() {
        System.out.println("Test HashMap --------------------------------");
        // create a HashMap
        Map<String, Integer> m1 = new HashMap<>();
        // like add() method in ArrayList
        m1.put("ONE", 10);
        m1.put("TWO", 20);
        m1.put("TRHEE", 30);
        m1.put("FOUR", 40);
        // print the HashMap
        System.out.println(m1);
    }

    public static void testTreeMap() {
        System.out.println("Test TreeMap --------------------------------");
        // create a TreeMap
        Map<String, Integer> m1 = new TreeMap<>();
        // like add() method in ArrayList
        m1.put("ONE", 10);
        m1.put("TWO", 20);
        m1.put("TRHEE", 30);
        m1.put("FOUR", 40);
        // print the TreeMap
        System.out.println(m1);
    }

    public static void testStock() {
        StockManager inventoryManager = new StockManager();
        inventoryManager.addStock("Shirt", 10);
        inventoryManager.addStock("Pants",5);
        inventoryManager.removeStock("Shirt", 6);
        inventoryManager.displayStock();
    }
}
