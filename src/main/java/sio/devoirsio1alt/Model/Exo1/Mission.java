package sio.devoirsio1alt.Model.Exo1;

public class Mission
{
    private int idMission;
    private String nomMission;
    private int duree;


    public Mission(int idMission, String nomMission, int duree) {
        this.idMission = idMission;
        this.nomMission = nomMission;
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }
}
