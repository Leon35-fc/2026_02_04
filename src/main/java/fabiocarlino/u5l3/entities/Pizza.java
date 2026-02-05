package fabiocarlino.u5l3.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Prodotto {
    private List<String> ingrediente = new ArrayList<>();

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void addIngrediente(String ingrediente) {
        this.ingrediente.add(ingrediente);
    }

    @Override
    public String toString() {
        return "\n" + getName() +
                ", " + getIngrediente() +
                ", " + getCalories() +
                "Cal, " + getPrice();
    }
}
