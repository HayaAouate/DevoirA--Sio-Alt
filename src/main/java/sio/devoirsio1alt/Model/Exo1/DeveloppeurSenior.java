package sio.devoirsio1alt.Model.Exo1;

import java.util.ArrayList;

public class DeveloppeurSenior extends Developpeur implements ISalaire
{
    private ArrayList<Mission> lesMissions;
    private  Specialite laSpecialite;

    public DeveloppeurSenior(int idDeveloppeur, String nomDeveloppeur, Specialite laSpecialite) {
        super(idDeveloppeur, nomDeveloppeur);
        this.lesMissions = new ArrayList<>();
        this.laSpecialite = laSpecialite;
    }

    public void ajouterMission(Mission m){
        lesMissions.add(m);
    }
    @Override
    public String getInfo() {
        return super.getInfo() + getIdDeveloppeur()+ " - " + laSpecialite.getNomSpecialite();
    }
    @Override
    public double calculerSalaire() {
        double salaire = 1500;

        for(Mission m : lesMissions){
            salaire += m.getDuree() * laSpecialite.getTarif();
        }

        return salaire;

    }

}
