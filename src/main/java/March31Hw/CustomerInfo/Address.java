package March31Hw.CustomerInfo;

public class Address {


    //Fields
    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;

    //Getters and Setters
    public boolean isPrimaryAddress() {

        return isPrimaryAddress;
    }

    public void setPrimaryAddress(boolean primaryAddress) {

        isPrimaryAddress = primaryAddress;
    }

    public int getStreetNumber() {

        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {

        this.streetNumber = streetNumber;
    }

    public String getStreetName() {

        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

}
