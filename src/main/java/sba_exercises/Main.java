package sba_exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "sample.txt";
        //Create File object from fileName var
        File file = new File(fileName);
        // create Scanner for file
        Scanner input = new Scanner(file);
        //Create List to store line Items
        List<String> lineItem;

        System.out.println("----------- Testing reading sample.txt -----------");
        System.out.printf("%-20s %-20s %-10s %-10s %n", "Name", "Description",
                "Price", "Available Quantity");

        while (input.hasNextLine()) {
            lineItem = (Arrays.asList(input.nextLine().split("  ")));
            // Autoboxing primitive numbers in order to add to List
            Double linePrice = Double.valueOf(lineItem.get(2));
            Integer lineQty = Integer.valueOf(lineItem.get(3));
            // Print each line with specified formatting
            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    lineItem.get(0), lineItem.get(1), linePrice, lineQty);
        }

        Item item1 = new Item("French Fries", "the best",
                2.99, 5);

        System.out.println("----------- Testing the constructor of Item class -----");

        System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                item1.getItemName(), item1.getItemDescription(),
                item1.getItemPrice(), item1.getAvailableQuantity());

        System.out.println("------ Testing the constructor of MySystem class ------");
        MySystem mySystem = new MySystem();

        for (String keyName : mySystem.getMyItemsInHashMap().keySet()) {
            Item mapItem = mySystem.getMyItemsInHashMap().get(keyName);
            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    mapItem.getItemName(), mapItem.getItemDescription(),
                    mapItem.getItemPrice(), mapItem.getAvailableQuantity());
        }
        System.out.println("-------------- Testing addItem(..) method --------------");
        System.out.println("size before adding a new item = " +
                mySystem.getMyItemsInHashMap().size());

        MySystem.addItem(new Item("reuben", "a classic",
                12.49, 17));

        System.out.println("size after adding a new item = " +
                mySystem.getMyItemsInHashMap().size());

        for (String keyName : mySystem.getMyItemsInHashMap().keySet()) {
            Item mapItem = mySystem.getMyItemsInHashMap().get(keyName);
            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    mapItem.getItemName(), mapItem.getItemDescription(),
                    mapItem.getItemPrice(), mapItem.getAvailableQuantity());
        }
        MySystem.addItem(new Item("reuben", "a classic",
                12.49, 17));

        System.out.println("size after adding an existing item = " +
                mySystem.getMyItemsInHashMap().size());

        System.out.println("----------- Testing reduceAvailableQuantity(..) method -----------");

        MySystem.removeItem("pizza");

        for (String keyName : mySystem.getMyItemsInHashMap().keySet()) {
            Item mapItem = mySystem.getMyItemsInHashMap().get(keyName);
            System.out.printf("%-20s %-20s %-10.2f %-10d %n",
                    mapItem.getItemName(), mapItem.getItemDescription(),
                    mapItem.getItemPrice(), mapItem.getAvailableQuantity());
        }

        System.out.println("size after removing an existing item = " +
                mySystem.getMyItemsInHashMap().size());
    }
}
