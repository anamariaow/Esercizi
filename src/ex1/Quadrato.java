package ex1;

public class Quadrato extends FormaGeometrica{
    private Double lato;

    public Quadrato(String colore, Double lato) {
        super(colore);
        this.lato = lato;
    }

    public Double getLato() {
        return lato;
    }

    public void setLato(Double lato) {
        this.lato = lato;
    }

    @Override
    public void stampaDettagliForma() {
        System.out.println("Forma: quadrato");
        super.stampaDettagliForma();
        System.out.println(" - lato: " + lato);
    }

    @Override
    public Double calcolaArea() {
        return lato * lato;
    }
}
