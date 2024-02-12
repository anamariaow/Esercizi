package Carrello;

import java.util.ArrayList;

public class Carrello {
    private ArrayList<Prodotto> prodottoArrayList;
    public Carrello() {
        this.prodottoArrayList = new ArrayList<>();
    }

    public ArrayList<Prodotto> getProdottoArrayList() {
        return prodottoArrayList;
    }

    public void setProdottoArrayList(ArrayList<Prodotto> prodottoArrayList) {
        this.prodottoArrayList = prodottoArrayList;
    }

    public void addProdotto(Prodotto prodotto) {
        prodottoArrayList.add(prodotto);
    }

    public void removeProdotto(Prodotto prodotto) {
        prodottoArrayList.remove(prodotto);
    }

    public void visualizzaProdotti() {
        for(Prodotto prodotto : prodottoArrayList) {
            prodotto.stampaDettagliProdotto();
        }
    }

    public void sconto(Double percentualeSconto) {
        for(Prodotto prodotto : prodottoArrayList) {
            Double prezzoScontato = prodotto.getPrezzo() * (percentualeSconto/100);
            prodotto.setPrezzo(prodotto.getPrezzo() - prezzoScontato);
        }
    }

    public void svuotaCarrello() {
        prodottoArrayList.clear();
    }
}
