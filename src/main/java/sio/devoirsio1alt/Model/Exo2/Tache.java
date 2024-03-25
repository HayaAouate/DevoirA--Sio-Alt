package sio.devoirsio1alt.Model.Exo2;

public class Tache
{
    private int idTache;
    private String nomTache;
    private String prioriteTache;
    private boolean estTerminee;
    private Developpeur leDeveloppeur;

    public Tache(int idTache, String nomTache, String prioriteTache, boolean estTerminee, Developpeur leDeveloppeur) {
        this.idTache = idTache;
        this.nomTache = nomTache;
        this.prioriteTache = prioriteTache;
        this.estTerminee = estTerminee;
        this.leDeveloppeur = leDeveloppeur;
    }

    public int getIdTache() {
        return idTache;
    }

    public String getNomTache() {
        return nomTache;
    }

    public String getPrioriteTache() {
        return prioriteTache;
    }

    public boolean isEstTerminee() {
        return estTerminee;
    }

    public Developpeur getLeDeveloppeur() {
        return leDeveloppeur;
    }

    public void setEstTerminee(boolean estTerminee) {
        this.estTerminee = estTerminee;
    }
}
