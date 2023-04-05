package March31Hw.CustomerInfo;

import March31Hw.Product;

public class Customer {


    //Constructors
    public Customer(String customerName) {
        this.customerName = customerName;
        addressCount = 0;
    }

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
        addressCount = 0;
    }

    //Fields
    private String customerName;
    private String email;
    private Product[] purchasedProducts;
    //private Address[] address;

    private int addressCount;

    //Setters and Getters
    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public Product[] getPurchasedProducts() {

        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {

        this.purchasedProducts = purchasedProducts;
    }

    public int getAddressCount() {

        return addressCount;
    }

    //methods
    public void getCustomerInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Email: " + email);

        for (Product productName : purchasedProducts) {
            System.out.println(productName);
        }
    }


    public Address addAddress(Address address) {
        addressCount++;
        return address;

    }
}

