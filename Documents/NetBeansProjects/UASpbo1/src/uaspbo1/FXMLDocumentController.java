/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Prayogi
 */
public class FXMLDocumentController implements Initializable {

    Parent root;
    private Label label;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button sideInputBtn;
    @FXML
    private Button sideDataBtn;
    @FXML
    private Button sideExitBtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void OnClickHandleButtonActionInput(MouseEvent event) {
        sideInputBtn.setStyle("-fx-background-color:#FD9941");
        sideDataBtn.setStyle("-fx-background-color:#FC6A03");
        sideExitBtn.setStyle("-fx-background-color:#FC6A03");
    }

    @FXML
    private void onClickHandleButtonActionData(MouseEvent event) {
        sideInputBtn.setStyle("-fx-background-color:#FC6A03");
        sideDataBtn.setStyle("-fx-background-color:#FD9941");
        sideExitBtn.setStyle("-fx-background-color:#FC6A03");
    }

    @FXML
    private void OnHandleButtonActionInput(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Input.fxml"));
        borderPane.setCenter(root);
    }

}
