package ex4;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libroArrayList;

    public Biblioteca() {
        this.libroArrayList = new ArrayList<>();
    }

    public ArrayList<Libro> getLibroArrayList() {
        return libroArrayList;
    }

    public void setLibroArrayList(ArrayList<Libro> libroArrayList) {
        this.libroArrayList = libroArrayList;
    }

    public void aggiungiLibro(Libro libro) {
        libroArrayList.add(libro);
    }

    public void rimuoviLibro(Libro libro) {
        libroArrayList.remove(libro);
    }

    public void visualizzaElencoLibri() {
        for(Libro libro : libroArrayList) {
            libro.stampaDettagliLibro();
        }
    }

    public void cercaPerAutore(String autore) {
        for (Libro libro : libroArrayList) {
            if (libro.getAutore().equals(autore)) {
                libro.stampaDettagliLibro();
            }
        }
    }

    public void cercaPerGenere(String genere) {
        for (Libro libro : libroArrayList) {
            if (libro.getGenere().equals(genere)) {
                libro.stampaDettagliLibro();
            }
        }
    }
}
