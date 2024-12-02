public class Eroe extends Personaggio {

    private int puntiGuarigione;

    public Eroe(String nome, int puntiVita, int puntiAttacco, int puntiGuarigione) {
        super(nome, puntiVita, puntiAttacco);
        this.puntiGuarigione = puntiGuarigione;
    }

    public void guarisci(){
        if (true) {
            System.out.println(" Il tuo eroe si cura e la sua salute è ora a " + getPuntiVita());
        }
    }
}
