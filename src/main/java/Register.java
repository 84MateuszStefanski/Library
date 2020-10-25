import java.util.ArrayList;
import java.util.List;

public class Register {

    public List<Client> clientList = new ArrayList<>();
    private Client client;

    public Register(Client client) {
        this.client = client;
    }

    public void registerClient(Client client) {
        if(clientList.contains(client)) {
            System.out.println("You are all ready registered .");
        }else{
        clientList.add(client);
        }
    }

    public List<Client> getClientList() {
        return clientList;
    }
}
