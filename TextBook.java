package aggregation;

public class TextBook {
    private String title;
    private String author;
    private String publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public TextBook(TextBook other) {
        this.title = other.title;
        this.author = other.author;
        this.publisher = other.publisher;
    }

    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {
        return ("Book title: " + this.title + ", author: " + this.author + ", publisher: " + this.publisher);
    }

}
