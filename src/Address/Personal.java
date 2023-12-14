package Address;

public class Personal {
    public String firstName;
    public String secondName;
    public final int birthYear;
    public  Address address;

    public Personal(String firstName, String secondName, int birthYear, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.address = address;
    }

    public Personal(String firstName, String secondName, int birthYear, String city, String postalCode, String street, int houseNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.address = new Address(city, postalCode, street, houseNumber);
    }
    @Override
    public String toString() {
        return "Personal{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthYear=" + birthYear +
                ", address=" + address +
                '}';
    }
}
