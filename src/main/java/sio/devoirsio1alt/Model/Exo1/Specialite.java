package sio.devoirsio1alt.Model.Exo1;

public class Specialite
{ private String nomSpecialite;
    private double tarif;
    private int idSpecialite;

    public Specialite(String nomSpecialite, double tarif, int idSpecialite) {
        this.nomSpecialite = nomSpecialite;
        this.tarif = tarif;
        this.idSpecialite = idSpecialite;
    }

    public String getNomSpecialite() {
        return nomSpecialite;
    }

    public double getTarif() {
        return tarif;
    }
}
