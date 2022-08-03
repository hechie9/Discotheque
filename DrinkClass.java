public class DrinkClass implements Drink {
    private int id;
    private String description;
    private float cost;

    public DrinkClass(int id, String description, float cost){
        this.id = id;
        this.description = description;
        this.cost = cost;
    }

    @Override
    void addDrink(int id, String description, float cost) {

    }

    @Override
    void grabDrink(int clientId, int drinkId) {
        
    }
}
