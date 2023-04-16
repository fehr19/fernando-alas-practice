package slack_homework.march_31_homework;

public class MainHomework {
    public static void main(String[] args) {

        Product product1 = new Product("TV", 1499.99);
        Product product2 = new Product("Monitor", 249.98);

        Customer customer1 = new Customer();
        customer1.setCustomerName("Fernando");
        customer1.setAddress("123 Mystreet");
        customer1.setEmail("fern@ndo.com");

        Product[] products = new Product[10];
        products[0] = new Product("TV", 1499.99);
        products[1] = new Product("Monitor", 329.99);
        customer1.setProducts(products);
        customer1.setNumberOfValidProducts(2);

        String customerInfo = customer1.getCustomerInfo();
        System.out.println(customerInfo);


    }

}
