package ex3;

public class Main {
    public static void main(String[] args) {
        Leone leone = new Leone("Leone", 5);
        Elefante elefante1 = new Elefante("Elefante1", 20);
        Elefante elefante2 = new Elefante("Elefante2", 25);

        GestoreAnimali gestoreAnimali = new GestoreAnimali();

        gestoreAnimali.aggiungiAnimale(leone);
        gestoreAnimali.aggiungiAnimale(elefante1);
        gestoreAnimali.aggiungiAnimale(elefante2);

        gestoreAnimali.rimuoviAnimale(elefante1);

        gestoreAnimali.visualizzaElencoAnimali();

        gestoreAnimali.emettiSuonoAnimali();

    }
}
