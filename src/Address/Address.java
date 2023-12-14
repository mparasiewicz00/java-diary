package Address;

public class Address {
    public String city;
    public String postalCode;
    public  String street;
    public int houseNumber;

    public Address(String city, String postalCode, String street, int houseNumber) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
