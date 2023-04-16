package slack_homework.april_05_homework;

import slack_homework.april_05_homework.customer_info.Address;
import slack_homework.april_05_homework.customer_info.CustomerName;

public class Customer {
    private CustomerName[] customerName;
    private String email;
    private Product[] purchasedProducts;
    private Address[] addresses;
    private int currentAddressIndex = 0;

    public Customer(CustomerName[] customerName, String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public void addAddress(Address address) {
        int i;
        for (i = 0; i < addresses.length; i++) {
            if (addresses[i] == null) {
                break;
            }
        }
        addresses[i] = address;
        addresses[currentAddressIndex++] = address;

    }

    public String getCustomerInfo() {
        String result = customerName[0].getFullName() + "\n"
                + email + "\n";

        for (int ii = 0; ii < addresses.length; ii++) {
            if (addresses[ii] == null) {
                break;
            }
            result += "\nAddress " + (ii + 1) + ":"
                    + "\n" + addresses[ii].getStreetNumber() + " "
                    + addresses[ii].getStreetName() + "\n"
                    + addresses[ii].getCity() + ", "
                    + addresses[ii].getState() + "\n";
        }

        result += "\n";

        for (int i = 0; i < purchasedProducts.length; i++) {
            result += purchasedProducts[i].getProductName() + " "
                    + purchasedProducts[i].getPrice() + "\n";
        }
        return result;
    }

    public CustomerName[] getCustomerName() {
        return customerName;
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

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

}
