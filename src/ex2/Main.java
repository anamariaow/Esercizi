package ex2;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 3000.0);
        Sviluppatore sviluppatore1 = new Sviluppatore("Sviluppatore1", 2000.0);
        Sviluppatore sviluppatore2 = new Sviluppatore("Sviluppatore2", 2100.0);

        GestoreDipendenti gestoreDipendenti = new GestoreDipendenti();

        gestoreDipendenti.aggiungiDipendente(manager);
        gestoreDipendenti.aggiungiDipendente(sviluppatore1);
        gestoreDipendenti.aggiungiDipendente(sviluppatore2);

        gestoreDipendenti.rimuoviDipendente(sviluppatore2);
        gestoreDipendenti.visualizzaElencoDipendenti();

        System.out.println("Stipendio annuale manager: €" + manager.calcolaSalarioAnnuo());
        System.out.println("Stipendio annuale sviluppatore: €" + sviluppatore1.calcolaSalarioAnnuo());

        System.out.println("Stipendio totale dipendenti: " + gestoreDipendenti.calcolaTotaleSalari());
    }
}
