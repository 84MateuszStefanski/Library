import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Book {



    private String title;
    private String authorFirstName;
    private String authorSecondName;
    private int numOfCopy;
    public List<Book> allBooksList = new ArrayList<>();

    public Book(String title, String authorFirstName, String authorSecondName, int numOfCopy) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
        this.numOfCopy = numOfCopy;
    }

    public void addBookToList(Book book){
        allBooksList.add(book);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public int getNumOfCopy() {
        return numOfCopy;
    }

    public void setNumOfCopy(int numOfCopy) {
        this.numOfCopy = numOfCopy;
    }

    public List<Book> getAllBooksList() {
        return allBooksList;
    }

    @Override
    public String toString() {
        return "Book: " +
                "title: " + title + '\'' +
                " author: " + authorFirstName + '\'' +
                authorSecondName + '\'';
    }
}
