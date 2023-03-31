package March31Hw;

public class MainHomework {
    public static void main(String[] args) {

        Product product1 = new Product("TV", 1499.99);
        Product product2 = new Product("Monitor", 249.98);


        Customer customer1 = new Customer("Jenny Jones", new String[] {product1.name, product2.name});
        customer1.setAddress("658 Oliver Dr.");
        customer1.setEmail("jennyjones@jennyshow.com");

        Customer customer2 = new Customer("Ricki Lake", "3124 Boolean Way",
                "RLake@LakeShow.com", new String[] {product1.name});

        customer1.customerSummary();
        System.out.println();
        customer2.customerSummary();
    }
}
