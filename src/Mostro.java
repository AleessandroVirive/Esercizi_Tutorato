public class Mostro {
    private int puntiVita;
    private int puntiAttacco;

    public Mostro (int puntiVita, int puntiAttacco) {
        this.puntiVita = puntiVita;
        this.puntiAttacco = puntiAttacco;
    }

    public void attacca(Eroe eroe){
        eroe.subisciDanno(puntiAttacco);
        System.out.println("Il tuo eroe attacca il mostro causando " + puntiAttacco +" danni");
    }
    
    public void subisciDanno(int danno) {
        this.puntiVita = this.puntiVita - danno;
        System.out.println("L'eroe ha "+this.puntiVita+" punti salute dopo l'attacco del mostro");
    }
}