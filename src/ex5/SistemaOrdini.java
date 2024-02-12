package ex5;

import java.util.ArrayList;

public class SistemaOrdini {
    ArrayList<Ordine> ordineArrayList;

    public SistemaOrdini() {
        this.ordineArrayList = new ArrayList<>();
    }

    public ArrayList<Ordine> getOrdineArrayList() {
        return ordineArrayList;
    }

    public void setOrdineArrayList(ArrayList<Ordine> ordineArrayList) {
        this.ordineArrayList = ordineArrayList;
    }

    public void aggiungiOrdine(Ordine ordine) {
        ordineArrayList.add(ordine);
    }

    public void rimuoviOrdine(Ordine ordine) {
        ordineArrayList.remove(ordine);
    }

    public void visualizzaElencoOrdini() {
        System.out.println("Elenco completo degli ordini: ");
        for(Ordine ordine : ordineArrayList) {
            ordine.stampaDettagliOrdine();
        }
    }

    public void aggiornaStatoOrdine(int numeroOrdine, String nuovoStato) {
        for (Ordine ordine : ordineArrayList) {
            if (ordine.getNumeroOrdine() == numeroOrdine) {
                ordine.setStatoElaborazione(nuovoStato);
                return;
            }
        }
        System.out.println("Nessun ordine trovato con il numero specificato: " + numeroOrdine);
    }
}
