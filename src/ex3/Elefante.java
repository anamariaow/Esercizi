package ex3;

public class Elefante extends Animale {
    public Elefante(String nome, Integer eta) {
        super(nome, eta);
    }

    @Override
    public void emettiSuono() {
        System.out.println("L'elefante barrita.");
    }
}
