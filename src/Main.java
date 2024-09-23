import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467", Genre.FICTION);
        Book book2 = new Book("1984", "George Orwell", "9780451524935", Genre.FICTION);
        Book book3 = new Book("A Brief History of Time", "Stephen Hawking", "9780553380163", Genre.SCIENCE);
        Book book4 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", Genre.FICTION);
        Book book5 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "9780062316097", Genre.NON_FICTION);
        Book book6 = new Book("The Art of War", "Sun Tzu", "9781590302255", Genre.HISTORY);
        Book book7 = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", Genre.FICTION);
        Book book8 = new Book("The Selfish Gene", "Richard Dawkins", "9780199291151", Genre.SCIENCE);
        Book book9 = new Book("Moby Dick", "Herman Melville", "9781503280786", Genre.FICTION);
        Book book10 = new Book("Educated", "Tara Westover", "9780399590504", Genre.NON_FICTION);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        // Borrow Book
        int counter = 1;
        for (int i=0; i<books.size(); i++) {
            if (books.get(i).getAvailable()) {
                System.out.print(counter);
                System.out.print(" ");
                books.get(i).bookInformation();
                counter++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index of book you want to borrow");

        int bookIndex = scanner.nextInt();

        books.get(bookIndex).borrow();


    }
}