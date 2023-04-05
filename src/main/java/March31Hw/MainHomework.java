package March31Hw;

import March31Hw.CustomerInfo.Customer;

public class MainHomework {
    public static void main(String[] args) {

        Product product1 = new Product("TV", 1499.99);
        Product product2 = new Product("Monitor", 249.98);

        Customer customer1 = new Customer("Jenny Jones", "jenny@jonesshow.com");
        Product[] customer1Products = {product1, product2};
        customer1.setPurchasedProducts(customer1Products);

        //customer1.addAddress();

        customer1.getCustomerInfo();


    }

}
