package hashmap_exercise;

import java.util.HashMap;
import java.util.Map;

public class HashmapMain {
    public static void main(String[] args) {
        Item book = new Item("SciFi Book", "Any item from book section",
                7.99, 241);
        Item comic = new Item("Comic", "Any item from comic section",
                4.99, 5032);

        Map<String, Item> storeInventory = new HashMap<>();

        storeInventory.put("book", book);
        storeInventory.put("comic", comic);

        int size = storeInventory.size();
        System.out.println(size);

        Item query1 = storeInventory.get("book");
        System.out.println(query1.getName());

        storeInventory.remove("book");

        int size2 = storeInventory.size();
        System.out.println(size2);

        storeInventory.put("book", book);
        size2 = storeInventory.size();
        System.out.println(size2);

        System.out.println(storeInventory.keySet());


        storeInventory.putIfAbsent("comic", comic);
        size2 = storeInventory.size();
        System.out.println(size2);

    }
}
