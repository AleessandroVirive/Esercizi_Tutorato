public class Mago extends Eroe{
    private int modificatoreMago;

    public Mago(String nome, int puntiVita, int puntiAttaco, int puntiGuarigione, int modificatoreMago) {
        super( nome, puntiVita, puntiAttaco, puntiGuarigione);
        this.modificatoreMago = modificatoreMago;
    }

    public void incantesimoMago(){

    }

}