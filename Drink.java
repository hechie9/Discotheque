public interface Drink {
    void addDrink(int id, String description, float cost);
    void grabDrink(int clientId, int drinkId);
}
