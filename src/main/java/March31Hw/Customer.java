package March31Hw;

import java.util.Arrays;

public class Customer {
    String customerName;
    String address;
    String email;
    String[] purchasedProducts;

    public Customer(String customerName, String[] purchasedProducts) {
        this.customerName = customerName;
        this.purchasedProducts = purchasedProducts;
    }

    public Customer(String customerName, String address, String email, String[] purchasedProducts) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

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

    public String[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(String[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public void customerSummary() {
        System.out.println("Customer: " + customerName);
        System.out.println("Address:" + address);
        System.out.println("Email: " + email);
        System.out.println("Products purchased: " + Arrays.toString(purchasedProducts));
    }

}
