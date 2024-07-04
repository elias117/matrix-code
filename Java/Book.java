public class Book {
    private String title;
    private String author;

    // constructor method
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter methods
    public String getTitle() {
        return this.title;
    }

    // getter methods
    public String getAuthor() {
        return this.author;
    }

    // setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    // setter methods
    public void setAuthor(String author) {
        this.author = author;
    }

    public String display() {
        return this.title + " by " + this.author;
    }
}
