package sio.devoirsio1alt.Model.Exo1;

public class DeveloppeurJunior extends Developpeur implements ISalaire {
    private  double tarifHoraire;
    private  int nbHeurs;

    public DeveloppeurJunior(int idDeveloppeur, String nomDeveloppeur, double tarifHoraire, int nbHeurs) {
        super(idDeveloppeur, nomDeveloppeur);
        this.tarifHoraire = tarifHoraire;
        this.nbHeurs = nbHeurs;
    }

    public double getTarifHoraire() {
        return tarifHoraire;
    }

    public int getNbHeurs() {
        return nbHeurs;
    }
    @Override
    public double calculerSalaire() {
        return 1500+  tarifHoraire*nbHeurs;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.getTarifHoraire() + " - " + this.getNbHeurs();
    }
}
