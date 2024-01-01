package Personal;

public class PersonalUsage {
    public static void main(String[] args) {

        Personal personA = new Personal();

        try {
            personA.newAge(-1);
        } catch (IllegalAgeException e) {
            System.out.println("Wystąpił błąd! Komunikat błędu: " + e.getMessage());
        }
        personA.setFirstName("Mateusz");
        personA.setSecondName("Parasiewicz");

        System.out.println(personA);
    }
}


