package Personal;

public class PersonalUsage {
    public static void main(String[] args) {

        try {
            Personal personA = new Personal(22,null, "Abacki");
            System.out.println(personA);
        } catch (Exception e) {
            System.out.println("Wystąpił błąd. Komunikat błędu: " + e.getMessage());
        }
    }
}


