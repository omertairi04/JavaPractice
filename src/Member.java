import java.util.ArrayList;

public class Member {

    String name;
    String id;
    ArrayList<Book> borrowedBooks;

    public Member(String name, String id, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

}
