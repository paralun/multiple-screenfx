package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static String screen1ID = "main";
    public static String screen1Fle = "sample.fxml";
    public static String screen2ID = "form1";
    public static String screen2Fle = "form1.fxml";
    public static String screen3ID = "form2";
    public static String screen3Fle = "form2.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception{
        ScreenController mainController = new ScreenController();
        mainController.loadScreen(Main.screen1ID, Main.screen1Fle);
        mainController.loadScreen(Main.screen2ID, Main.screen2Fle);
        mainController.loadScreen(Main.screen3ID, Main.screen3Fle);

        mainController.setScreen(Main.screen1ID);

        Group root = new Group();
        root.getChildren().addAll(mainController);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
