package ex1a;

import java.util.ArrayList;

public class CatalogoFilm {
    private ArrayList<Film> filmArrayList;

    public CatalogoFilm() {
        this.filmArrayList = new ArrayList<>();
    }

    public ArrayList<Film> getFilmArrayList() {
        return filmArrayList;
    }

    public void setFilmArrayList(ArrayList<Film> filmArrayList) {
        this.filmArrayList = filmArrayList;
    }

    public void aggiungiFilm(Film film) {
        filmArrayList.add(film);
    }

    public void rimuoviFilm(Film film) {
        filmArrayList.remove(film);
    }

    public void visualizzaElencoFilm() {
        System.out.println("Elenco film: ");
        for(Film film : filmArrayList) {
            film.stampaDettagliFilm();
        }
    }

    public void cercaPerRegista(String regista) {
        System.out.println("Ricerca film per regista: ");
        for(Film film : filmArrayList) {
            if(film.getRegista().equals(regista)) {
                film.stampaDettagliFilm();
            }
        }
    }

    public void cercaPerAnnoUscita(Integer annoUscita) {
        System.out.println("Ricerca film per anno di uscita: ");
        for(Film film : filmArrayList) {
            if(film.getAnnoUscita().equals(annoUscita)) {
                film.stampaDettagliFilm();
            }
        }
    }

}
