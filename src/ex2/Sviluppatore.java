package ex2;

public class Sviluppatore extends Dipendente{
    public Sviluppatore(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcolaSalarioAnnuo() {
        return getSalario() * 13;
    }
}
