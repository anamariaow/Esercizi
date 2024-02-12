package ex2a;

public class Contatto {
    /**
     * Classe Contatto con attributi e metodo di stampa
     */
    private String nome;
    private String cognome;
    private String numeroTelefono;
    private String email;

    public Contatto(String nome, String cognome, String numeroTelefono, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * metodo di stampa dettagli
     */

    public void stampaDettagliContatto() {
        System.out.println("Nome: " + nome + " - Cognome: " + cognome + " - Telefono: " + numeroTelefono + " - Email: " + email);
    }
}
