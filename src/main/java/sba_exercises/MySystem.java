package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MySystem {
    private static Map<String, Item> myItemsInHashMap;

    // Constructor
    public MySystem() throws FileNotFoundException {
        this.myItemsInHashMap = new HashMap<>();
        String fileName = "sample.txt";
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        List<String> lineItem;

        while (input.hasNextLine()) {
            lineItem = (Arrays.asList(input.nextLine().split("  ")));
            String name = lineItem.get(0);
            String description = lineItem.get(1);
            Double price = Double.valueOf(lineItem.get(2));
            Integer quantity = Integer.valueOf(lineItem.get(3));

            Item item = new Item(name, description, price, quantity);
            myItemsInHashMap.put(name, item);
        }
    }

    //methods
    public static Item addItem(Item item) {
        if (myItemsInHashMap.containsKey(item.getItemName())) {
            System.out.println(item.getItemName() + " is already present.  Cannot be added.");
        } else {
            myItemsInHashMap.put(item.getItemName(), item);
        }
        return item;
    }

    public static Item removeItem(String itemName) {
        if (myItemsInHashMap.containsKey(itemName)) {
            myItemsInHashMap.remove(itemName);
            return myItemsInHashMap.get(itemName);
        } else return null;

    }

    public static Item reduceAvailableQuantity(String itemName) {
        if (myItemsInHashMap.get(itemName).getAvailableQuantity() == 1) {
            myItemsInHashMap.remove(itemName);
            return myItemsInHashMap.get(itemName);
        } else if (myItemsInHashMap.containsKey(itemName)) {
            Integer updateQuantity = myItemsInHashMap.get(itemName).getAvailableQuantity();
            myItemsInHashMap.get(itemName).setAvailableQuantity(updateQuantity - 1);
            return myItemsInHashMap.get(itemName);
        } else return null;
    }


    // Setters and Getters
    public Map<String, Item> getMyItemsInHashMap() {
        return myItemsInHashMap;
    }

    public void setMyItemsInHashMap(Map<String, Item> myItemsInHashMap) {
        this.myItemsInHashMap = myItemsInHashMap;
    }
}
