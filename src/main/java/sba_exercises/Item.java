package sba_exercises;


public class Item {
    String itemName;
    String itemDescription;
    Double itemPrice;
    Integer availableQuantity;

    // Constructors
    public Item() {
        this.availableQuantity = 1;
    }

    public Item(String itemName, String itemDescription, Double itemPrice, Integer availableQuantity) {
        this();
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.availableQuantity = availableQuantity;
    }

    // Getters and setters

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
