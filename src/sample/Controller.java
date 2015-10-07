package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable, ControlledScreen{

    ScreenController myController;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void actionButton1(ActionEvent event){
        myController.setScreen(Main.screen2ID);
    }

    @FXML
    public void actionButton2(ActionEvent event){
        myController.setScreen(Main.screen3ID);
    }

    @Override
    public void setScreenParent(ScreenController screenPage) {
        myController = screenPage;
    }
}
