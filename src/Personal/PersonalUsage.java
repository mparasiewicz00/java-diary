package Personal;

public class PersonalUsage {
    public static void main(String[] args) {

        try {
            Personal personA = new Personal(22,null, "Abacki");
            System.out.println(personA);
        } catch (IllegalArgumentException e){
            System.out.println("Wystąpił błąd. Komunikat błędu: " + e.getMessage());
        }
        try {
            Personal personB = new Personal(-1,"Adam", "Abacki");
            System.out.println(personB);
        } catch (IllegalArgumentException e){
            System.out.println("Wystąpił błąd. Komunikat błędu: " + e.getMessage());
        }
    }
}


