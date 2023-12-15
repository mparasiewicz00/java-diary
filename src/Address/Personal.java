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
    @Override
    public boolean equals(Object o) {
        if (o == null || (this.getClass() != o.getClass())){
            return false;
        }

        Personal personal1 = (Personal) o;
        return this.firstName.equals(personal1.firstName) &&
                this.secondName.equals(personal1.secondName) &&
                this.birthYear == personal1.birthYear &&
                this.address.equals(personal1.address);

    }
}
