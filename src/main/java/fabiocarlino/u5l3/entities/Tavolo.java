package fabiocarlino.u5l3.entities;

import java.util.Random;

public class Tavolo {
    private int id;
    private int maxCoperti;
    private StatoTavolo statoTavolo;

    public Tavolo(int maxCoperti, StatoTavolo statoTavolo) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
        this.maxCoperti = maxCoperti;
        this.statoTavolo = statoTavolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                " id= " + id +
                ", maxCoperti= " + maxCoperti +
                ", stato= " + statoTavolo +
                " }";
    }
}
