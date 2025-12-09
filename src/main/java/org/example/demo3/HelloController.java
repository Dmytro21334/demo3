package org.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button btnAdd;

    @FXML
    void onAddClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("2view.fxml"));
            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) btnAdd.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert btnAdd != null : "fx:id=\"btAdd\" was not injected: check your FXML file '1view.fxml'.";
    }
}
