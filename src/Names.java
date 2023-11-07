import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Names {
    private final List<String> names;
    private final Random random;

    public Names(List<String> names) {
        this.names = new ArrayList<>(names); // Tworzymy kopię listy, aby nie modyfikować oryginalnej
        this.random = new Random();
    }

    public String choose() {
        if (names.isEmpty()) {
            return null; // Zwracamy null, jeśli lista jest pusta
        }

        int randomIndex = random.nextInt(names.size());
        String chosenName = names.remove(randomIndex); // Usuwamy wybrane nazwisko z listy
        return chosenName;
    }

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Kowalski");
        nameList.add("Nowak");
        nameList.add("Smith");
        nameList.add("Johnson");
        nameList.add("   ");


        Names nameChooser = new Names(nameList);

        for (int i = 0; i < nameList.size(); i++) {
            String chosenName = nameChooser.choose();
            if (chosenName != null) {
                System.out.println("Wybrane nazwisko: " + chosenName);
            } else {
                System.out.println("Brak dostępnych nazwisk.");
            }
        }


    }
}
