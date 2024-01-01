package Personal;

public class PersonalUsage {
    public static void main(String[] args) {

        try {
            Personal person = new Personal(22,"Adam", "Abacki");
            System.out.println(person);
        } catch (IllegalArgumentException e){
            System.out.println("Wystąpił błąd. Komunikat błędu: " + e.getMessage());
        }
    }
}


