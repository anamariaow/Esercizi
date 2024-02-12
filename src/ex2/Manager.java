package ex2;

public class Manager extends Dipendente{

    public Manager(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double calcolaSalarioAnnuo() {
        return getSalario() * 14 + 2000;
    }
}
