import java.util.ArrayList;
import java.util.List;
public class Department {
    private String name;
    private List<Book> books;

    public Department(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int getBookCount() {
        return books.size();
    }

    public List<Book> searAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "Отдел: " + name + ", Количество книг: " + getBookCount();
    }
}
