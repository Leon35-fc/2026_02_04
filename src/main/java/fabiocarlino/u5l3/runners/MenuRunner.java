package fabiocarlino.u5l3.runners;

import fabiocarlino.u5l3.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements CommandLineRunner {

    @Value("${costo.coperto}")
    private double fissoCoperto;

    @Autowired
    private Pizza margherita;

    @Autowired
    private Pizza salami;

    @Autowired
    private Pizza hawaiana;


    @Autowired
    private Bevanda limonata;

    @Override
    public void run(String... args) throws Exception {
        Tavolo tavolo = new Tavolo(10, StatoTavolo.OCCUPATO);

        Ordine ordine = new Ordine(StatoOrdine.IN_CORSO, 8, tavolo, fissoCoperto);

        ordine.addProdottoList(margherita);
//        ordine.getProdottoList().add(margherita);
//        ordine.getProdottoList().add(salami);
//        ordine.getProdottoList().add(limonata);

        System.out.println("N. ordine: " + ordine.getIdOrdine());
        System.out.println("Tavolo: " + tavolo.getId());
        System.out.println("Costo coperto(a persona): " + fissoCoperto);
        System.out.println("Costo totale: " + ordine.costoOrdine());
    }
}
