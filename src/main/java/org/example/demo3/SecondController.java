package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecondController {

    @FXML
    private Button btnBack;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    void onBackClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("1view.fxml"));
            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) btnBack.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onButtonClick(ActionEvent event) {
        try {
            Button clickedButton = (Button) event.getSource();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("3view.fxml"));
            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) clickedButton.getScene().getWindow();

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert btn1 != null : "fx:id=\"bth1\" was not injected: check your FXML file '2view.fxml'.";
        assert btn2 != null : "fx:id=\"bth2\" was not injected: check your FXML file '2view.fxml'.";
        assert btn3 != null : "fx:id=\"bth3\" was not injected: check your FXML file '2view.fxml'.";
        assert btn4 != null : "fx:id=\"bth4\" was not injected: check your FXML file '2view.fxml'.";
        assert btn5 != null : "fx:id=\"bth5\" was not injected: check your FXML file '2view.fxml'.";
        assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file '2view.fxml'.";

    }
}
