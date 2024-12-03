public class Guerriero extends Eroe{
    private int modificatoreGuerriero;

    public Guerriero(String nome, int puntiVita, int puntiAttaco, int puntiGuarigione, int modificatoreGuerriero) {
        super( nome, puntiVita, puntiAttaco, puntiGuarigione);
        this.modificatoreGuerriero = modificatoreGuerriero;
    }

    public void spadataGuerriero (){
        int attaccoTotale = getPuntiAttacco() + modificatoreGuerriero;
        super.attacca();
        System.out.println(getNome() + " usa un attacco speciale! Danno totale: " + attaccoTotale);

    }

}
