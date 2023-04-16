package slack_homework.march_31_homework;

public class Customer {

    //Fields
    private String customerName;
    private String address;
    private String email;
    private Product[] products = new Product[10];
    private int numberOfValidProducts = 0;

    //Constructors
    public Customer() {

    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    public String getCustomerInfo() {
        String result = "Customer name: " + customerName + " "
                + "\nAddress: " + address + " "
                + "\nemail: " + email + "\nProduct names: ";
        /*for (Product product : products) {
            result += "\n" + "Product = " + product.getName();
        }*/
        for (int i = 0; i < numberOfValidProducts; i++) {
            result += "\n - " + products[i].getName();
        }
        return result;
    }


    //Setters and Getters
    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Product[] getProducts() {

        return products;
    }

    public void setProducts(Product[] products) {

        this.products = products;
    }

    public int getNumberOfValidProducts() {
        return numberOfValidProducts;
    }

    public void setNumberOfValidProducts(int numberOfValidProducts) {
        this.numberOfValidProducts = numberOfValidProducts;
    }
}

