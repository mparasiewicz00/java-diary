package Personal;

public class Personal {
    private int age;
    private String firstName;
    private String secondName;


    public Personal (int age, String firstName, String secondName) throws IllegalArgumentException {
        if (age <=0 ) {
            throw new IllegalArgumentException("Wiek musi być większy od 0!");
        }
        if ( firstName == null ) {
            throw new IllegalArgumentException("Nie podano imienia.");
        }
        if (secondName == null ) {
            throw new IllegalArgumentException("Nie podano nazwiska.");
        }
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Personal.Personal{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}


