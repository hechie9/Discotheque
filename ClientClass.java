import java.util.LinkedList;

public class ClientClass implements Client {
    private int id;
    private String name;
    private float balance;
    private boolean isVip;

    private float entryPrice = 20f;
    private LinkedList<ClientClass> client;

    public ClientClass(int id, String name, boolean status){
        this.id = id;
        this.name = name;
        this.isVip = status;
        this.balance = 0f;
        this.client = new LinkedList<>();
    }

    @Override
    void addGuest(int id, String name){
        client.add(new ClientClass(id, name, false));
    }

    @Override
    void addVip(int id, String name){
        client.add(new ClientClass(id, name, true));
    }

    @Override
    void payEntry(int id){
        if(isVip){
            entryPrice = 50%entryPrice;
        }
        balance -= entryPrice;
    }

    @Override
    void payExit(int id){

    }
}