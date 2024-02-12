package ex4;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro1", "Autore1", "Genere1", true);
        Libro libro2 = new Libro("Libro2", "Autore2", "Genere2", true);
        Libro libro3 = new Libro("Libro3", "Autore3", "Genere3", true);
        Libro libro4 = new Libro("Libro4", "Autore4", "Genere4", true);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro(libro1);
        biblioteca.aggiungiLibro(libro2);
        biblioteca.aggiungiLibro(libro3);
        biblioteca.aggiungiLibro(libro4);

        biblioteca.rimuoviLibro(libro3);
        biblioteca.visualizzaElencoLibri();

        biblioteca.cercaPerAutore("Autore2");
        biblioteca.cercaPerGenere("Genere4");
    }
}
