package ex1;

public class Main {
    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio("rosso", 3.0);
        Quadrato quadrato1 = new Quadrato("blu", 4.0);
        Quadrato quadrato2 = new Quadrato("verde", 5.0);


        GestoreForme gestoreForme = new GestoreForme();

        gestoreForme.aggiungiForma(cerchio);
        gestoreForme.aggiungiForma(quadrato1);

        gestoreForme.rimuoviForma(quadrato2);

        gestoreForme.visualizzaElencoForme();

        System.out.println("Area cerchio: " + cerchio.calcolaArea());
        System.out.println("Area quadrato: " + quadrato1.calcolaArea());

        System.out.println("Area totale: " + gestoreForme.calcolaAreaTotale());
    }
}
