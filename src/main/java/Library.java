import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Library {
    public static void main(String[] args) {

        System.out.println();

        Book book = new Book("Pan Tadeusz ", "Adam ", "Mickiewicz ", 3);
        Book book2 = new Book("Ogniem i mieczem ", "Henryk ", "Sienkiewicz ", 7);
        Book book3 = new Book("Carrie ", "Stephen ", "King ", 2);
        Book book4 = new Book("Harry Potter ", "Joanne Kathleen ", "Rowling ", 3);
        book.addBookToList(book);
        book.addBookToList(book2);
        book.addBookToList(book3);
        book.addBookToList(book4);

        System.out.println("This is list of our books ");
        for(Book el : book.getAllBooksList()){
            System.out.println(el);
        }

        System.out.println();

        Client client = new Client("Ferdynand", "Kiepski");
        Client client2 = new Client("Marian ", "Paździoch ");
        Client client3 = new Client("Arnold ", "Boczek ");
        Register register = new Register(client);
        register.registerClient(client);
        register.registerClient(client2);
        register.registerClient(client3);

        System.out.println("This is our registereg clients list ");
        for (Client el : register.clientList){

            System.out.println(el);
        }

        System.out.println();


        Reservation reservation = new Reservation(client,book);
        reservation.borrowBook(client,book,LocalDate.now());
        System.out.println(client);
        System.out.println(client.getListOfBooksBorrowed());
        System.out.println(book.getNumOfCopy());
        reservation.bookGiveBack(client,book);
        System.out.println(book.getNumOfCopy());





    }

}
