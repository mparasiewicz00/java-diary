package Personal;

public class PersonalUsage {
    public static void main(String[] args) {

        Personal personA = new Personal();

        personA.newAge(23);
        personA.setFirstName("Mateusz");
        personA.setSecondName("Parasiewicz");

        System.out.println(personA);
    }
}
