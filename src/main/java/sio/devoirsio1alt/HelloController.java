package sio.devoirsio1alt;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.devoirsio1alt.Model.Exo1.*;


import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    ArrayList<Developpeur> lesDeveloppeurs;
    ArrayList<Mission> lesMissions;
    
    @FXML
    private TableView<Developpeur> tvDeveloppeurs;
    @FXML
    private TableColumn <Developpeur,String>tcInfosDeveloppeur;
    @FXML
    private TableColumn<Developpeur,Integer>tcNumeroDeveloppeur;
    @FXML
    private TableColumn<Developpeur,Double> tcSalaireDeveloppeur;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        // Code à décommenter une fois les classes créées.

        lesDeveloppeurs = new ArrayList<>();
        lesMissions = new ArrayList<>();

        Specialite specialite1 = new Specialite("Web", 15.5, 1);
        Specialite specialite2 = new Specialite("Mobile", 18.3, 2);
        Mission mission1 = new Mission(1,"Mission 1",4);
        Mission mission2 = new Mission(2,"Mission 2",2);
        Mission mission3 = new Mission(2,"Mission 3",1);
        Mission mission4 = new Mission(2,"Mission 4",1);
        Developpeur developpeur1 = new Developpeur(1,"Enzo");
        DeveloppeurJunior developpeurJunior1 = new DeveloppeurJunior(2,"Noa",16.23,35);
        DeveloppeurJunior developpeurJunior2 = new DeveloppeurJunior(3,"Lilou",18.72,39);
        DeveloppeurSenior developpeurSenior1 = new DeveloppeurSenior(4,"Milo",specialite1);
        DeveloppeurSenior developpeurSenior2 = new DeveloppeurSenior(5,"Virginie",specialite2);

        developpeurSenior1.ajouterMission(mission1);
        developpeurSenior1.ajouterMission(mission2);
        developpeurSenior1.ajouterMission(mission3);
        developpeurSenior2.ajouterMission(mission4);

        lesDeveloppeurs.add(developpeur1);
        lesDeveloppeurs.add(developpeurJunior1);lesDeveloppeurs.add(developpeurJunior2);
        lesDeveloppeurs.add(developpeurSenior1);lesDeveloppeurs.add(developpeurSenior2);
        Collections.sort(lesDeveloppeurs);

        // Remplir le TABLVIEW
        tcNumeroDeveloppeur.setCellValueFactory(new PropertyValueFactory<>("idDeveloppeur"));
        tcInfosDeveloppeur.setCellValueFactory(data-> {
            SimpleStringProperty property = new SimpleStringProperty();
            property.setValue(data.getValue().getInfo());
            return property;
        });
        tcSalaireDeveloppeur.setCellValueFactory(data->{
            SimpleDoubleProperty property =new SimpleDoubleProperty();
            property.setValue(data.getValue().calculerSalaire());
            return property.asObject();
        });
        tvDeveloppeurs.setItems(FXCollections.observableArrayList(lesDeveloppeurs));




    }
}