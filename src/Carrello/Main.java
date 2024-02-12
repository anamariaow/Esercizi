package Carrello;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Prodotto1", 10.0);
        Prodotto prodotto2 = new Prodotto("Prodotto2", 20.0);
        Prodotto prodotto3 = new Prodotto("Prodotto3", 30.0);
        Prodotto prodotto4 = new Prodotto("Prodotto4", 40.0);

        Carrello carrello = new Carrello();

        carrello.addProdotto(prodotto1);
        carrello.addProdotto(prodotto2);
        carrello.addProdotto(prodotto3);
        carrello.addProdotto(prodotto4);

        carrello.visualizzaProdotti();

        carrello.sconto(20.0);

        carrello.visualizzaProdotti();


    }
}
