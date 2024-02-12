package ex2a;

public class Main {
    public static void main(String[] args) {
        Contatto contatto1 = new Contatto("Nome1", "Cognome1", "3456789012", "nome1cognome1@mail.it");
        Contatto contatto2 = new Contatto("Nome2", "Cognome2", "3567890123", "nome2cognome2@mail.it");
        Contatto contatto3 = new Contatto("Nome3", "Cognome3", "3678901234", "nome3cognome3@mail.it");
        Contatto contatto4 = new Contatto("Nome4", "Cognome4", "3789012345", "nome4cognome4@mail.it");
        Contatto contatto5 = new Contatto("Nome5", "Cognome5", "3890123456", "nome5cognome5@mail.it");

        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();

        rubricaTelefonica.aggiungiContatto(contatto1);
        rubricaTelefonica.aggiungiContatto(contatto2);
        rubricaTelefonica.aggiungiContatto(contatto3);
        rubricaTelefonica.aggiungiContatto(contatto4);
        rubricaTelefonica.aggiungiContatto(contatto5);

        rubricaTelefonica.rimuoviContatto(contatto2);

        rubricaTelefonica.visualizzaElencoContatti();

        rubricaTelefonica.cercaPerNome("Nome4");

        rubricaTelefonica.cercaPerNumeroTelefono("3678901234");
    }
}
