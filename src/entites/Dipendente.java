package entites;

public class Dipendente {
    // Attributi statici
    private static double stipendioBase = 1000;

    // Attributi di istanza
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    // Enumerazioni per Livello e Dipartimento
    public enum Livello {
        OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
    }

    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    // Costruttore che accetta solo la matricola e il dipartimento
    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    // Costruttore che accetta tutti i parametri
    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    // Metodi getter
    public String getMatricola() {
        return matricola;
    }
    public double getStipendio() {
        return stipendio;
    }
    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Metodi setter per Dipartimento e importoOrarioStraordinario
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    // Metodo override toString
    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    // Metodo per stampare i dati del dipendente
    public void stampaDatiDipendente() {
        System.out.println(this.toString());
    }

    // Metodo per promuovere il dipendente
    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO:
                this.livello = Livello.IMPIEGATO;
                this.stipendio = stipendioBase * 1.2;
                break;
            case IMPIEGATO:
                this.livello = Livello.QUADRO;
                this.stipendio = stipendioBase * 1.5;
                break;
            case QUADRO:
                this.livello = Livello.DIRIGENTE;
                this.stipendio = stipendioBase * 2;
                break;
            case DIRIGENTE:
                System.out.println("Ottimo: Il dipendente è già un dirigente");
                break;
        }
        return this.livello;
    }

    // Metodo statico per calcolare la paga
    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.getStipendio();
    }

    // Metodo statico per calcolare la paga con ore straordinarie
    public static double calcolaPaga(Dipendente dipendente, int oreStraordinario) {
        return dipendente.getStipendio() + (dipendente.getImportoOrarioStraordinario() * oreStraordinario);
    }

}
