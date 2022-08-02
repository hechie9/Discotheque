public interface Client {
    void addGuest(int id, String name);
    void addVip(int id, String name);
    void payEntry(int id);
    void payExit(int id);
}
