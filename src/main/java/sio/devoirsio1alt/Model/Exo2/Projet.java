package sio.devoirsio1alt.Model.Exo2;

import javafx.scene.control.skin.TableColumnHeader;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Projet
{
    private int idProjet;
    private String nomProjet;
    private ArrayList<Tache> lesTaches;

    public Projet(int idProjet, String nomProjet) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.lesTaches = new ArrayList<>();
    }

    public ArrayList<Tache> getLesTaches() {
        return lesTaches;
    }

    public void ajouterUneTache(Tache tache)
    {
        lesTaches.add(tache);
    }

    // Cette méthode permet de savoir si le projet est terminé ou pas
    // Un projet est terminé si toutes ses tâches sont terminées
    public boolean projetTermine()
    {
        // A vous de jouer
        boolean projetTermine = false;
        int unProjet = 0;
        for (Tache uneTache : lesTaches) {
            if (uneTache.isEstTerminee()) {
                unProjet++;
            }
        }
        if (unProjet == lesTaches.size()) {
            projetTermine = true;
        }


        return projetTermine;
    }

    // Cette méthode permet de déterminer le taux (en pourcentage)
    // d'avancement du projet.
    // Pour le calculer on détermine le nombre de tâches terminées
    // par rapport au nombre de tâches total
    // Le pourcentage sera arrondi à 2 chiffres après la virgule
    public double avancementProjet()
    {
        // A vous de jouer
        double avancementProjet = 0;
        boolean tacheTermine = false;
//        calcule moi // d'avancement du projet.
//    // Pour le calculer on détermine le nombre de tâches terminées
//    // par rapport au nombre de tâches total
//    // Le pourcentage sera arrondi à 2 chiffres après la virgule
        for (Tache uneTache : lesTaches) {
            if (uneTache.isEstTerminee()) {
                tacheTermine = true;
            }
        }
        if (tacheTermine) {
            avancementProjet = 100;
        }



        return  avancementProjet;
    }
}
