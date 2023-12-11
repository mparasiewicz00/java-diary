package Personal;

public class Personal {
    private int age;
    private String firstName;
    private String secondName;

    public void newAge(int ageValue){
        age = ageValue;
    }

    public void setFirstName(String nameOfPerson){
        firstName = nameOfPerson;
    }

    public void setSecondName(String secNameOfPerson){
        secondName = secNameOfPerson;
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
