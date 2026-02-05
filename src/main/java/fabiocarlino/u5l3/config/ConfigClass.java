package fabiocarlino.u5l3.config;

import fabiocarlino.u5l3.entities.Bevanda;
import fabiocarlino.u5l3.entities.Ingrediente;
import fabiocarlino.u5l3.entities.Menu;
import fabiocarlino.u5l3.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean
    public Bevanda acqua() {
        return new Bevanda("acqua (0.5l)", 0, 1.29);
    }

    @Bean
    public Bevanda vino() {
        return new Bevanda("vino (0.75l, 13%)", 607, 7.49);
    }

    @Bean
    public Bevanda limonata() {
        return new Bevanda("limonata (0.33l)", 128, 1.29);
    }

    @Bean
    public Ingrediente ananas() {
        return new Ingrediente("ananas", 24, 0.79);
    }

    @Bean
    public Ingrediente cipolla() {
        return new Ingrediente("cipolla", 22, 0.69);
    }

    @Bean
    public Ingrediente mozzarella() {
        return new Ingrediente("mozzarella", 92, 0.69);
    }

    @Bean
    public Ingrediente prosciutto() {
        return new Ingrediente("prosciutto", 35, 0.99);
    }

    @Bean
    public Ingrediente salame() {
        return new Ingrediente("salame", 86, 0.99);
    }

    @Bean
    public Ingrediente pomodoro() {
        return new Ingrediente("pomodoro", 0, 0.99);
    }

    @Bean(name = "margherita")
    public Pizza margherita() {
        Pizza pizza = new Pizza("margherita", 1104, 4.99);

        pizza.addIngrediente(pomodoro().getName());
        pizza.addIngrediente(mozzarella().getName());

        return pizza;
    }

    @Bean
    public Pizza hawaiana() {
        Pizza pizza = new Pizza("hawaiana", 1024, 6.49);
        pizza.addIngrediente(pomodoro().getName());
        pizza.addIngrediente(mozzarella().getName());
        pizza.addIngrediente(prosciutto().getName());
        pizza.addIngrediente(ananas().getName());

        return pizza;
    }

    @Bean(name = "salami")
    public Pizza salami() {
        Pizza pizza = new Pizza("salami", 1160, 5.99);
        pizza.addIngrediente(pomodoro().getName());
        pizza.addIngrediente(mozzarella().getName());
        pizza.addIngrediente(salame().getName());

        return pizza;
    }

//    @Bean
//    public Ordine ordine() {
//        List<Prodotto> ordine = new ArrayList<>();
//        ordine.add(margherita());
//        ordine.add(margherita());
//
//        return new Ordine(StatoOrdine.IN_CORSO, 8, Arrays.asList(margherita(), margherita(), limonata(), acqua()), new Tavolo(10, StatoTavolo.OCCUPATO));
//    }

    @Bean
    public Menu menu() {
        List<Pizza> pizze = new ArrayList<>();

        pizze.add(hawaiana());
        pizze.add(margherita());
        pizze.add(salami());

        List<Ingrediente> ingredienti = new ArrayList<>();

        ingredienti.add(ananas());
        ingredienti.add(cipolla());
        ingredienti.add(mozzarella());
        ingredienti.add(pomodoro());
        ingredienti.add(prosciutto());

        List<Bevanda> bevande = new ArrayList<>();

        bevande.add(acqua());
        bevande.add(limonata());
        bevande.add(vino());

        return new Menu(pizze, ingredienti, bevande);
    }

}
