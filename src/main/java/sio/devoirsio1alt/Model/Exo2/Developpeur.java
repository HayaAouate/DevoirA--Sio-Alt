package sio.devoirsio1alt.Model.Exo2;

public class Developpeur
{
    private int idDeveloppeur;
    private String nomDeveloppeur;

    public Developpeur(int idDeveloppeur, String nomDeveloppeur) {
        this.idDeveloppeur = idDeveloppeur;
        this.nomDeveloppeur = nomDeveloppeur;
    }

    public int getIdDeveloppeur() {
        return idDeveloppeur;
    }

    public String getNomDeveloppeur() {
        return nomDeveloppeur;
    }
}
