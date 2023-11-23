import java.util.ArrayList;
import java.util.List;

public class FrequentNames {
    private final List<String> frequentNames;

    public FrequentNames() {
        this.frequentNames = new ArrayList<>();
    }

    public String choose() {
        if (frequentNames.isEmpty()) {
            return null;
        }

        String mostFrequentName = null;
        int maxFrequency = 0;

        for (String name : frequentNames) {
            int frequency = countFrequency(name);
            if (frequency > maxFrequency) {
                mostFrequentName = name;
                maxFrequency = frequency;
            }
        }

        frequentNames.remove(mostFrequentName);

        return mostFrequentName;
    }

    public void insert(String name) {
        frequentNames.add(name);
    }

    private int countFrequency(String name) {
        int count = 0;
        for (String n : frequentNames) {
            if (n.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FrequentNames frequentNames = new FrequentNames();

        frequentNames.insert("Anna");
        frequentNames.insert("Bartek");
        frequentNames.insert("Anna");
        frequentNames.insert("Anna");
        frequentNames.insert("Cezary");
        frequentNames.insert("Bartek");

        String mostFrequentName = frequentNames.choose();
        if (mostFrequentName != null) {
            System.out.println("Najczęściej występujące imię: " + mostFrequentName);
        } else {
            System.out.println("Brak imion do wyboru.");
        }

        System.out.println("Zawartość listy frequentNames po operacjach:");
        for (String name : frequentNames.frequentNames) {
            System.out.println("Imię: " + name);
        }
    }
}
