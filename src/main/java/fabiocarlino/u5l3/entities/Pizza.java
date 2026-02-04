package fabiocarlino.u5l3.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends Prodotto {
    private List<Ingrediente> ingrediente = new ArrayList<>();

    public Pizza(String name, int calories, double price) {
        super(name, calories, price);
    }

    public List<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void addIngrediente(Ingrediente ingrediente) {
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
