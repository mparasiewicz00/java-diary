import java.util.HashMap;
import java.util.Map;

//        Napisz program, który będzie wybierał najczęściej występujące imiona klientów z listy a na stępnie je usuwał.
//        Dokładniej, zaimplementuj klasę FrequentNames z obiektowym atrybutem frequentNames i z obiektową metodą choose(),
//        która zwraca najczęściej występujące imię z frequentNames usuwając je jednocześnie, oraz metodę insert(String name) wstawiającą imię

public class FrequentNames {
    private final Map<String, Integer> frequentNames;

    public FrequentNames() {
        this.frequentNames = new HashMap<>();
    }

    public String choose() {
        if (frequentNames.isEmpty()) {
            return null;
        }

        String mostFrequentName = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequentNames.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentName = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        if (mostFrequentName != null) {
            frequentNames.remove(mostFrequentName);
        }

        return mostFrequentName;
    }

    public void insert(String name) {
        frequentNames.put(name, frequentNames.getOrDefault(name, 0) + 1);
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
    }
}
