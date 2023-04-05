package april_05_exercise;

import april_05_exercise.customer_info.Address;
import april_05_exercise.customer_info.CustomerName;

public class MainHomeworkApril05 {
    public static void main(String[] args) {

        Product product1 = new Product("Book", 7.99);
        Product product2 = new Product("Hardcover", 14.99);

        CustomerName customerName1 = new CustomerName("Tim", "Berners", "Lee");

        Customer customer1 = new Customer(new CustomerName[]{customerName1},
                "genericemail@isp.com",
                new Product[]{product1, product2});

        Address[] addresses = new Address[10];
        customer1.setAddresses(addresses);

        Address address1 = new Address(true,
                123,
                "Waterfall",
                "Night City",
                "TX");

        Address address2 = new Address(false,
                545,
                "elm st",
                "Boston",
                "MA");

        customer1.addAddress(address1);
        customer1.addAddress(address2);

        System.out.println(customer1.getCustomerInfo());

    }
}
