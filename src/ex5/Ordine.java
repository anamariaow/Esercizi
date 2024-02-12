package ex5;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Ordine {
    private Integer numeroOrdine;
    private OffsetDateTime dataCreazione;
    private ArrayList<Prodotto> prodottiOrdinatiArrayList;
    private String statoElaborazione;

    public Ordine(Integer numeroOrdine, OffsetDateTime dataCreazione, Prodotto prodottiOrdinatiArrayList, String statoElaborazione) {
        this.numeroOrdine = numeroOrdine;
        this.dataCreazione = dataCreazione;
        this.prodottiOrdinatiArrayList = new ArrayList<>();
        this.statoElaborazione = statoElaborazione;
    }

    public Integer getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(Integer numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public OffsetDateTime getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(OffsetDateTime dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public ArrayList<Prodotto> getProdottiOrdinatiArrayList() {
        return prodottiOrdinatiArrayList;
    }

    public void setProdottiOrdinatiArrayList(ArrayList<Prodotto> prodottoArrayList) {
        this.prodottiOrdinatiArrayList = prodottiOrdinatiArrayList;
    }

    public String getStatoElaborazione() {
        return statoElaborazione;
    }

    public void setStatoElaborazione(String statoElaborazione) {
        this.statoElaborazione = statoElaborazione;
    }

    public void stampaDettagliOrdine() {
        System.out.println("Numero ordine: " + numeroOrdine + " - Data creazione: " + dataCreazione + " - Prodotti: " + " - Stato elaborazione ordine: " + statoElaborazione);
    }
}
