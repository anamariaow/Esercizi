package ex1a;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("Titolo1", "Regista1", 2000, 10.0);
        Film film2 = new Film("Titolo2", "Regista2", 2001, 9.0);
        Film film3 = new Film("Titolo3", "Regista3", 2002, 9.5);

        CatalogoFilm catalogoFilm = new CatalogoFilm();

        catalogoFilm.aggiungiFilm(film1);
        catalogoFilm.aggiungiFilm(film2);
        catalogoFilm.aggiungiFilm(film3);

        //catalogoFilm.rimuoviFilm(film2);

        catalogoFilm.visualizzaElencoFilm();

        catalogoFilm.cercaPerRegista("Regista3");
        catalogoFilm.cercaPerAnnoUscita(2000);
    }
}
