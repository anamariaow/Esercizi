package ex1;

import java.util.ArrayList;

public class GestoreForme {
    private ArrayList<FormaGeometrica> formaGeometricaArrayList;

    public GestoreForme() {
        this.formaGeometricaArrayList = new ArrayList<>();
    }

    public ArrayList<FormaGeometrica> getFormaGeometricaArrayList() {
        return formaGeometricaArrayList;
    }

    public void setFormaGeometricaArrayList(ArrayList<FormaGeometrica> formaGeometricaArrayList) {
        this.formaGeometricaArrayList = formaGeometricaArrayList;
    }

    public void aggiungiForma(FormaGeometrica formaGeometrica) {
        formaGeometricaArrayList.add(formaGeometrica);
    }

    public void rimuoviForma(FormaGeometrica formaGeometrica) {
        formaGeometricaArrayList.remove(formaGeometrica);
    }

    public void visualizzaElencoForme() {
        for (FormaGeometrica formaGeometrica : formaGeometricaArrayList) {
            formaGeometrica.stampaDettagliForma();
        }
    }

    public Double calcolaAreaTotale() {
        Double area = 0.0;
        for (FormaGeometrica formaGeometrica : formaGeometricaArrayList) {
            area += formaGeometrica.calcolaArea();
        }
        return area;
    }

}
