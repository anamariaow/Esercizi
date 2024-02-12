package ex5;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Prodotto pantalone = new Prodotto("Pantalone", 1, 30.0);
        Prodotto maglietta = new Prodotto("Maglietta", 4, 40.0);
        Prodotto giacca = new Prodotto("Giacca", 1, 100.0);
        Prodotto canotta = new Prodotto("Canotta", 1, 10.0);
        Prodotto sciarpa = new Prodotto("Sciarpa", 1, 15.0);
        Prodotto scarpe = new Prodotto("Scarpe", 2, 60.0);


        Ordine ordine1 = new Ordine(1, OffsetDateTime.now(), maglietta, "In lavorazione");
        Ordine ordine2 = new Ordine(2, OffsetDateTime.now(), pantalone, "In lavorazione");
        Ordine ordine3 = new Ordine(3, OffsetDateTime.now(), giacca, "In lavorazione");
        Ordine ordine4 = new Ordine(4, OffsetDateTime.now(), scarpe, "In lavorazione");
        Ordine ordine5 = new Ordine(5, OffsetDateTime.now(), scarpe, "In lavorazione");


        SistemaOrdini sistemaOrdini = new SistemaOrdini();

        sistemaOrdini.aggiungiOrdine(ordine1);
        sistemaOrdini.aggiungiOrdine(ordine2);
        sistemaOrdini.aggiungiOrdine(ordine3);
        sistemaOrdini.aggiungiOrdine(ordine4);
        sistemaOrdini.aggiungiOrdine(ordine5);

        sistemaOrdini.rimuoviOrdine(ordine4);

        sistemaOrdini.visualizzaElencoOrdini();

        sistemaOrdini.aggiornaStatoOrdine(1, "Spedito");

        //elenco aggiornato
        sistemaOrdini.visualizzaElencoOrdini();
    }
}
