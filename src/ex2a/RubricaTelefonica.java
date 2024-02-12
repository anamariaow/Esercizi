package ex2a;

import java.util.ArrayList;

public class RubricaTelefonica {
    /**
     * Classe RubricaTelefonica con ArrayList di Contatto
     */

    private ArrayList<Contatto> contattoArrayList;

    public RubricaTelefonica() {
        this.contattoArrayList = new ArrayList<>();
    }

    public ArrayList<Contatto> getContattoArrayList() {
        return contattoArrayList;
    }

    public void setContattoArrayList(ArrayList<Contatto> contattoArrayList) {
        this.contattoArrayList = contattoArrayList;
    }

    /**
     * metodo per aggiungere i contatti
     * @param contatto
     */

    public void aggiungiContatto(Contatto contatto) {
        contattoArrayList.add(contatto);
    }

    /**
     * metodo per rimuovere i contatti
     * @param contatto
     */

    public void rimuoviContatto(Contatto contatto) {
        contattoArrayList.remove(contatto);
    }

    /**
     * metodo per visualizzare l'elenco telefonico
     */
    public void visualizzaElencoContatti() {
        System.out.println("Elenco telefonico: ");
        for(Contatto contatto : contattoArrayList) {
            contatto.stampaDettagliContatto();
        }
    }

    /**
     * metodo per cercare i contatti per nome
     * @param nome
     */
    public void cercaPerNome(String nome) {
        System.out.println("Ricerca contatto per nome: ");
        for(Contatto contatto : contattoArrayList) {
            if(contatto.getNome().equals(nome)) {
                contatto.stampaDettagliContatto();
            }
        }
    }

    /**
     * metodo per ceracre i contatti per numero di telefono
     * @param numeroTelefono
     */
    public void cercaPerNumeroTelefono(String numeroTelefono) {
        System.out.println("Ricerca contatto per numero di telefono: ");
        for (Contatto contatto : contattoArrayList) {
            if(contatto.getNumeroTelefono().equals(numeroTelefono)) {
                contatto.stampaDettagliContatto();
            }
        }
    }
}
