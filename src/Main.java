import entites.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente("123", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente dip2 = new Dipendente("456", 2000, 40, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.AMMINISTRAZIONE);
       //PRIMO DIP
        System.out.println("prima della promozione "+ dip1);
        dip1.promuovi();
        System.out.println("dopo l PROMOZIONE" + dip1);
       // SEC DIP
        System.out.println("prima della promozione "+ dip2);
        dip2.promuovi();
        System.out.println("dopo l PROMOZIONE" + dip2);

    }
}


