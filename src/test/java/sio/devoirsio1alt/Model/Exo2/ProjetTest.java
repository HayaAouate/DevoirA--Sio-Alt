package sio.devoirsio1alt.Model.Exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetTest {

    Projet projet1;
    Projet projet2;
    Developpeur developpeur1;
    Developpeur developpeur2;
    Tache tache1;Tache tache2;Tache tache3;Tache tache4;Tache tache5;
    @BeforeEach
    void setUp()
    {
        projet1 = new Projet(1,"Projet SLAM");
        projet2 = new Projet(2,"Projet SISR");

        developpeur1 = new Developpeur(1,"Enzo");
        developpeur2 = new Developpeur(2,"Noa");

        tache1 = new Tache(1,"Finir la feuille CSS","Faible",false,developpeur1);
        tache2 = new Tache(2,"Finir la page index.php","Urgente",false,developpeur1);
        tache3 = new Tache(3,"Modifier la BDD","Urgente",true,developpeur1);
        tache4 = new Tache(4,"Configurer DNS","Urgente",false,developpeur2);
        tache5 = new Tache(5,"Configurer DHCP","Moyenne",false,developpeur2);

        projet1.ajouterUneTache(tache1);projet1.ajouterUneTache(tache2);projet1.ajouterUneTache(tache3);
        projet2.ajouterUneTache(tache4);projet2.ajouterUneTache(tache5);
    }

    @Test
    void projetTermine()
    {
        // Cas n°1 : le projet n'est pas terminé
        tache3.setEstTerminee(false);
        boolean expected = false;
        boolean result = projet1.projetTermine();
        assertEquals(expected,result);


        // Cas n°2 : le projet est terminé
        tache4.setEstTerminee(true);tache5.setEstTerminee(true);

        expected = true;
        result = projet2.projetTermine();
        assertEquals(expected,result);

    }

    @Test
    void avancementProjet()
    {
        //Cas n°1 : 33.33%


        //Cas n°2 : 66.67%


        //Cas n°3 : 100%

    }
}