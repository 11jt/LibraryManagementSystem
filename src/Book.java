public class Book {

    public String title;
    public String author;
    public boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public boolean isAvailable() { return this.isAvailable; }
    public void setAvailable(boolean available) { this.isAvailable = available; }
}
