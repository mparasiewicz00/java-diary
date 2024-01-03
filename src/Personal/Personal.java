package Personal;

public class Personal {
    private int age;
    private String firstName;
    private String secondName;


    public Personal (int age, String firstName, String secondName) throws IllegalAgeException,
            IllegalNameException, IllegalSecondNameException {
        if (age <=0 ) {
            throw new IllegalAgeException("Wiek musi być większy od 0!");
        }
        if ( firstName == null ) {
            throw new IllegalNameException("Nie podano imienia.");
        }
        if (secondName == null ) {
            throw new IllegalSecondNameException("Nie podano nazwiska.");
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

    public void setAge(int age) throws IllegalAgeException {
        if (age <=0 ) {
            throw new IllegalAgeException("Wiek musi być większy od 0!");
        }
        this.age = age;
    }

    public void setFirstName(String firstName) throws IllegalNameException {
        if ( firstName == null ) {
            throw new IllegalNameException("Pole imię jest puste.");
        }
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) throws IllegalSecondNameException {
        if (secondName == null ) {
            throw new IllegalSecondNameException("Pole nazwisko jest puste.");
        }
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


