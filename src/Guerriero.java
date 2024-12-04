public class Guerriero extends Eroe{
    private double modificatoreGuerriero;

    public Guerriero(String nome, int puntiVita, int puntiAttacco, int puntiGuarigione, double modificatoreGuerriero) {
        super( nome, puntiVita, puntiAttacco, puntiGuarigione);
        this.modificatoreGuerriero = modificatoreGuerriero;
    }

    public int spadataGuerriero (double danno, Personaggio personaggio){
        int danno = (int) (getPuntiAttacco() * modificatoreGuerriero);
        System.out.println(getNome() + " usa un attacco speciale! Danno totale: " + danno);
    }
}
