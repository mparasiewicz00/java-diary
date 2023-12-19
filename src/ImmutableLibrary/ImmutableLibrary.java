package ImmutableLibrary;

public class ImmutableLibrary {
    private final ImmutableBook[] books;

    public ImmutableLibrary (ImmutableBook[] books) {
        this.books = new  ImmutableBook[books.length];

        for (int i = 0; i < books.length; i++) {
            this.books[i] = books[i];
        }
    }
    public ImmutableBook[] getbooks() {
        ImmutableBook[] result = new ImmutableBook[books.length];

        for (int i = 0; i < books.length; i++) {
            result[i] = books[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ImmutableBook[] sztywniutko = {
                new ImmutableBook("Dawno temu w Warszawie", "Jakub Żulczyk", 59.99),
                new ImmutableBook("Ślepnąc od Świateł", "Jakub Żulczyk", 39.99)
        };

        ImmutableLibrary library1 = new ImmutableLibrary(sztywniutko);

        System.out.println("Zawartość biblioteki:");

        for (ImmutableBook book : library1.getbooks()) {
            System.out.println(book);
        }
    }
}
