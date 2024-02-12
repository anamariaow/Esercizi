package Carrello;

public class Prodotto {
    private String nome;
    private Double prezzo;

    public Prodotto(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void stampaDettagliProdotto() {
        System.out.println(nome + " - " + prezzo);
    }
}
