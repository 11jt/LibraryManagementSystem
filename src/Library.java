
import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void lendBook(String title) {
        Book book = searchByTitle(title);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
        }
    }

    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if (book != null) book.setAvailable(true);
    }

    public String booksList() {
        if (books.isEmpty()) return "No books have been added.";

        StringBuilder booksString = new StringBuilder();
        for (Book book : books) {
            String tempString = book.getTitle() + " (Author: " + book.getAuthor() + " Available: " + book.isAvailable() + "), ";
            booksString.append(tempString);
        }
        return booksString.toString();
    }
}
