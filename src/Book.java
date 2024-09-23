interface Borrowable {
    void borrow();
    void returnBook();
}

public class Book implements Borrowable {
    private String Title;
    private String Author;
    private String ISBN;
    private Boolean isAvailable;
    private Genre genre;

    public Book(String title, String author, String ISBN, Genre genre) {
        Title = title;
        Author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        isAvailable = true;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is already borrowed!");
        }
    }

    @Override
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("Book is already returned!");
        }
    }

    public void bookInformation() {
        String _gStr = this.genre.toString();
        String info = "%s , %s , %s";
        String result = String.format(info, Title, Author, _gStr);
        System.out.println(result);
    }
}
