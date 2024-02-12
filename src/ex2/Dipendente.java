package ex2;

public abstract class Dipendente {
    private String nome;
    private Double salario;

    public Dipendente(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void stampaDettagliDipendente() {
        System.out.println("Nome dipendente: " + nome + " - Salario mensile: €" + salario);
    }

    public abstract Double calcolaSalarioAnnuo();
}
