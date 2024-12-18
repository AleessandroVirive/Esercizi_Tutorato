//CLASSE PERSONAGGIO
public abstract class Personaggio {
    private boolean vivo;
    private String nome;
    private int puntiVita;
    private int puntiAttacco;
    private final int puntiVitaMassimi;
//COSTRUTTORE PER OGGETTO PERSONAGGIO
    public Personaggio(String nome, int puntiVita, int puntiAttacco) {
        this.nome = nome;
        this.vivo = true;
        this.puntiVita = puntiVitaMassimi = puntiVita;
        this.puntiAttacco = puntiAttacco;
    }

    public void attacca(Personaggio personaggio) {
        if (!vivo){             //CONTROLLA SE IL PERSONAGGIO CHE ATTACCA NON SIA MORTO
           System.out.println("sei già morto!");
           return;
        }

        if (!personaggio.isVivo()){   //CONTROLLA SE IL PERSONAGGIO CHE VIENE ATTACCATO NON SIA MORTO
            System.out.println("è già morto!");
            return;
        }

        personaggio.subisciDanno(puntiAttacco);

        System.out.println("Il tuo eroe attacca il mostro causando " + puntiAttacco +" danni");
    }
    public void subisciDanno(int danno) {
        this.puntiVita -= danno;
        System.out.println("L'eroe ha "+this.puntiVita+" punti salute dopo l'attacco del mostro");

        if (this.puntiVita <= 0) {
            System.out.println("sei morto!");
            vivo = false;
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public int getPuntiVitaMassimi() {
        return puntiVitaMassimi;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;}
}




