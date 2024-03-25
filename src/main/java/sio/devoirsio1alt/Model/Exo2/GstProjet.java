package sio.devoirsio1alt.Model.Exo2;

import java.util.ArrayList;

public class GstProjet
{
    private ArrayList<Projet> lesProjets;

    public GstProjet() {
        this.lesProjets = new ArrayList<>();
    }

    public void ajouterProjet(Projet projet)
    {
        lesProjets.add(projet);
    }

    // Cette méthode permet de déterminer le nombre de tâches
    // pour le développeur passé en paramètre et pour la priorité passée en paramètre.
    public int getNbTachesDevPriorite(Developpeur developpeur, String unePriorite)
    {
        // A vous de jouer
        int nbTaches = 0;
        for (Projet projet : lesProjets)
        {
            for (Tache tache : projet.getLesTaches())
            {
                if (tache.getLeDeveloppeur() == developpeur && tache.getPrioriteTache() == unePriorite)
                {
                    nbTaches++;
                }
            }
        }

        return nbTaches;
    }

}
