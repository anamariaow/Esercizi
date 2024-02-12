package ex3;

import java.util.ArrayList;

public class GestoreAnimali {
    private ArrayList<Animale> animaleArrayList;

    public GestoreAnimali() {
        this.animaleArrayList = new ArrayList<>();
    }

    public ArrayList<Animale> getAnimaleArrayList() {
        return animaleArrayList;
    }

    public void setAnimaleArrayList(ArrayList<Animale> animaleArrayList) {
        this.animaleArrayList = animaleArrayList;
    }

    public void aggiungiAnimale(Animale animale) {
        animaleArrayList.add(animale);
    }

    public void rimuoviAnimale(Animale animale) {
        animaleArrayList.remove(animale);
    }

    public void visualizzaElencoAnimali() {
        System.out.println("Elenco animali: ");
        for(Animale animale : animaleArrayList) {
            animale.stampaInformazioniAnimale();
        }
    }

    public void emettiSuonoAnimali() {
        System.out.println("Suono emesso da tutti gli animali presenti: ");
        for(Animale animale : animaleArrayList) {
            animale.emettiSuono();
        }
    }
}
