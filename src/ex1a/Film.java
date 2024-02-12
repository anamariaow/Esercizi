package ex1a;

public class Film {
    private String titolo;
    private String regista;
    private Integer annoUscita;
    private Double valutazione;

    public Film(String titolo, String regista, Integer annoUscita, Double valutazione) {
        this.titolo = titolo;
        this.regista = regista;
        this.annoUscita = annoUscita;
        this.valutazione = valutazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public Integer getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(Integer annoUscita) {
        this.annoUscita = annoUscita;
    }

    public Double getValutazione() {
        return valutazione;
    }

    public void setValutazione(Double valutazione) {
        this.valutazione = valutazione;
    }

    public void stampaDettagliFilm() {
        System.out.println("Titolo: " + titolo + " - Regista: " + regista + " - Anno di uscita: " + annoUscita + " - Valutazione: " + valutazione);
    }
}
