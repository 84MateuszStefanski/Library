import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Reservation {

    private static final BigDecimal PRICE_PER_WEEK = BigDecimal.valueOf(20);
    private static final BigDecimal PENALTY_PER_WEEK_AFTER_TWO_WEEKS = BigDecimal.valueOf(30);


    private Map<Client, Book> borrowedBooks;
    private LocalDate dateOfborrow;
    private Client client;
    private Book book;

    public Reservation(Client client, Book book) {
        this.client = client;
        this.book = book;
        this.dateOfborrow = LocalDate.now();
        this.borrowedBooks = new LinkedHashMap<>();
    }

    public void borrowBook(Client client, Book book, LocalDate dateOfborrow) {
        if(book.getNumOfCopy() == 0) {
            System.out.println("We don't have this book at the moment");
        }else {
        client.getListOfBooksBorrowed().add(book);
        book.setNumOfCopy(book.getNumOfCopy() - 1);
        borrowedBooks.put(client, book);
        client.setCharges(PRICE_PER_WEEK);
        }
    }

    public  void bookGiveBack(Client client, Book book) {
        client.getListOfBooksBorrowed().remove(book);
        book.setNumOfCopy(book.getNumOfCopy() + 1);
        borrowedBooks.remove(client, book);
    }

    public void chargePenalty(Client client, Book book) {
        if(LocalDate.now().isAfter(getDateOfborrow().plusDays(14))) {
            client.setPenalty(PENALTY_PER_WEEK_AFTER_TWO_WEEKS);
        }

    }

    public static BigDecimal getPricePerWeek() {
        return PRICE_PER_WEEK;
    }

    public static BigDecimal getPenaltyPerWeekAfterTwoWeeks() {
        return PENALTY_PER_WEEK_AFTER_TWO_WEEKS;
    }

    public Map<Client, Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public LocalDate getDateOfborrow() {
        return dateOfborrow;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "dateOfborrow=" + dateOfborrow +
                ", dateOfGiveBack=" +
                '}';
    }
}
