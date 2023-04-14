package java_map_hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of contacts to be entered: ");
        int n = in.nextInt();
        in.nextLine();

        Map<String, Contact> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Please enter contact #" + (i + 1) + ": ");
            String name = in.nextLine();
            System.out.print("Please enter " + name + "'s phone number: ");
            int phone = in.nextInt();
            in.nextLine();

            phoneBook.put(name, new Contact(name, phone));
        }

        System.out.println("Now, enter names to display their phone number");

        while (in.hasNext()) {
            String s = in.nextLine();
            Contact query1 = phoneBook.get(s);
            if (phoneBook.get(s) == null) {
                System.out.println("Not Found");

            } else {
                System.out.println(query1.getName() +
                        " = " + query1.getPhoneNumber());
            }
        }
    }
}
