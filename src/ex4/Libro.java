package ex4;

public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private Boolean disponibilita;

    public Libro(String titolo, String autore, String genere, Boolean disponibilita) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.disponibilita = disponibilita;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Boolean getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(Boolean disponibilita) {
        this.disponibilita = disponibilita;
    }
    public void stampaDettagliLibro() {
        System.out.println("Titolo: " + titolo + " - autore: " + autore + " - genere: " + genere + " - disponibilità: " + disponibilita);
    }
}
