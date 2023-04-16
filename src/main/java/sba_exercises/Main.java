package sba_exercises;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "sample.txt";
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        List<String> lineItem;

        System.out.println("----------- Testing reading sample.txt -----------");
        System.out.printf("%-20s %-20s %-10s %-10s %n", "Name", "Description", "Price", "Available Quantity");

        while (input.hasNextLine()) {
            lineItem = (Arrays.asList(input.nextLine().split("  ")));

            Float linePrice = Float.valueOf(lineItem.get(2));
            Integer lineQty = Integer.valueOf(lineItem.get(3));

            System.out.printf("%-20s %-20s %-10.2f %-10d %n", lineItem.get(0), lineItem.get(1), linePrice, lineQty);
        }
    }
}
