package March31Hw.CustomerInfo;

import March31Hw.Product;

import java.util.Arrays;

public class Customer {
    private String customerName;
    private String email;
    private Product[] purchasedProducts;
    private Address[] address;
    public void addAddress(Address address) {

    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public Customer(String customerName, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.purchasedProducts = purchasedProducts;
    }

    public Customer(String customerName, String address, String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

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

    public void customerSummary() {
        System.out.println("Customer: " + customerName);
        System.out.println("Email: " + email);
        System.out.println("Products purchased: " + Arrays.toString(purchasedProducts));
    }

    private String getCustomerInfo() {
        return null;

    }
}
