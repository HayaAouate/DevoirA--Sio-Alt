module sio.devoirsio1alt {
    requires javafx.controls;
    requires javafx.fxml;
    opens sio.devoirsio1alt.Model.Exo2;
    opens sio.devoirsio1alt.Model.Exo1;
    opens sio.devoirsio1alt to javafx.fxml;
    exports sio.devoirsio1alt;
}