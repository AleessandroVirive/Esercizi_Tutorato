public abstract class Eroe extends Personaggio {

    private int puntiGuarigione;

    public Eroe(String nome, int puntiVita, int puntiAttacco, int puntiGuarigione) {
        super(nome, puntiVita, puntiAttacco);
        this.puntiGuarigione = puntiGuarigione;
    }

    public void guarisci(int cura) {
        if (getPuntiVita()>=getPuntiVitaMassimi()) {
            return;
        }
        this.getPuntiVita() += cura;
        System.out.println(" Il tuo eroe si cura e la sua salute è ora a " + getPuntiVita());
    }
}
