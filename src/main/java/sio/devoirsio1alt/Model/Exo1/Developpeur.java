package sio.devoirsio1alt.Model.Exo1;

public class Developpeur implements ISalaire,Comparable<Developpeur> {
    protected int idDeveloppeur;
    protected String nomDeveloppeur;

    public Developpeur(int idDeveloppeur, String nomDeveloppeur) {
        this.idDeveloppeur = idDeveloppeur;
        this.nomDeveloppeur = nomDeveloppeur;
    }

    @Override
    public double calculerSalaire() {
        return 1500;
    }

    @Override
    public int compareTo(Developpeur o) {
        return Double.compare(o.calculerSalaire(), this.calculerSalaire());
    }
    public String getInfo(){
        return nomDeveloppeur + " - " ;
    }

    public int getIdDeveloppeur() {
        return idDeveloppeur;
    }

    public String getNomDeveloppeur() {
        return nomDeveloppeur;
    }
}
