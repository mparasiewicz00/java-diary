package ImmutableLibrary;

public class ImmutableBook {
    private final String title;
    private final String author;

    private final double price;


    public ImmutableBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "ImmutableBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
