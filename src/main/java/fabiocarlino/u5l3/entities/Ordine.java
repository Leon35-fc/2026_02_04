package fabiocarlino.u5l3.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ordine {
    private int idOrdine;
    private Tavolo tavolo;
    private int numeroCoperti;
    private List<Prodotto> prodottoList;
    private StatoOrdine statoOrdine;
    private LocalTime orarioAcquisizione;
    private double fissoCoperto;

    public Ordine(StatoOrdine statoOrdine, int numeroCoperti, Tavolo tavolo, double fissoCoperto) {
        Random rndm = new Random();
        this.idOrdine = rndm.nextInt(1000, 100000);
        if (numeroCoperti > tavolo.getMaxCoperti())
            throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        this.numeroCoperti = numeroCoperti;
        this.prodottoList = new ArrayList<>();
        this.statoOrdine = statoOrdine;
        this.tavolo = tavolo;
        this.fissoCoperto = fissoCoperto;
    }

    public int getIdOrdine() {
        return idOrdine;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public List<Prodotto> getProdottoList() {
        return prodottoList;
    }

    public void setProdottoList(List<Prodotto> prodottoList) {
        this.prodottoList = prodottoList;
    }

    public void addProdotto(Prodotto prodotto) {
        this.prodottoList.add(prodotto);
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }


    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public LocalTime getOrarioAcquisizione() {
        return orarioAcquisizione;
    }

    public void setOrarioAcquisizione(LocalTime orarioAcquisizione) {
        this.orarioAcquisizione = orarioAcquisizione;
    }

    public double costoOrdine() {
        double orderPrice = prodottoList.stream().mapToDouble(prodotto -> prodotto.getPrice()).sum();

        return orderPrice + (fissoCoperto * numeroCoperti);
    }

    @Override
    public String toString() {
        return "-----Ordine-----\n" +
                "idOrdine=" + idOrdine +
                ", tavolo=" + tavolo +
                ", numeroCoperti=" + numeroCoperti +
                ", prodottoList=" + prodottoList +
                ", statoOrdine=" + statoOrdine +
                ", orarioAcquisizione=" + orarioAcquisizione +
                '}';
    }
}
