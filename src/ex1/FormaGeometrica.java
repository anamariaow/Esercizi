package ex1;

public abstract class FormaGeometrica {
    private String colore;

    public FormaGeometrica(String colore) {
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void stampaDettagliForma() {
        System.out.println(" - colore: " + colore);
    }

    public abstract Double calcolaArea();
}
