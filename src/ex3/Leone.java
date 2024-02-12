package ex3;

public class Leone extends Animale {


    public Leone(String nome, Integer eta) {
        super(nome, eta);
    }

    @Override
    public void emettiSuono() {
        System.out.println("Il leone ruggisce.");
    }
}
