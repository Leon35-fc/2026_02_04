package fabiocarlino.u5l3.entities;

public class Ingrediente extends Prodotto {

    public Ingrediente(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return "\n" + this.getName() + ", "
                + this.getCalories() + " Cal, "
                + this.getPrice();
    }
}
