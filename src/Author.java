import java.util.ArrayList;

public class Author {

    String name;
    ArrayList<Book> books;

    public Author(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
