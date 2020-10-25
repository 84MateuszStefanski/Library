import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String clientFirstName;
    private String clientSecondName;
    private List<Book> listOfBooksBorrowed;
    private BigDecimal charges;
    private BigDecimal penalty;

    public Client(String clientFirstName, String clientSecondName) {
        this.clientFirstName = clientFirstName;
        this.clientSecondName = clientSecondName;
        this.listOfBooksBorrowed = new ArrayList<>();
        this.charges = new BigDecimal(0);
        this.penalty = new BigDecimal(0);
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public String getClientSecondName() {
        return clientSecondName;
    }

    public List<Book> getListOfBooksBorrowed() {
        return listOfBooksBorrowed;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return "Client " +
                clientFirstName + '\'' +
                clientSecondName + '\'';
    }
}
