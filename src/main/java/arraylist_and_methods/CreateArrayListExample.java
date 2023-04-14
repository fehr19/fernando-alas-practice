package arraylist_and_methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Add an element at index 2
        animals.add(2, "Elephant");
        System.out.println(animals);
    }
}
