package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerForm1 implements Initializable, ControlledScreen{

    ScreenController myController;

    @FXML
    private Button btnFormUtama;

    @FXML
    private Button btnForm3;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void buttonUtama(ActionEvent event){
        myController.setScreen(Main.screen1ID);
    }

    @FXML
    public void buttonForm3(ActionEvent event){
        myController.setScreen(Main.screen3ID);
    }

    @Override
    public void setScreenParent(ScreenController screenPage) {
        myController = screenPage;
    }
}
