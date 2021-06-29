/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author Prayogi
 */
public class DataController implements Initializable {

    @FXML
    private TableColumn<?, ?> colNama;
    @FXML
    private TableColumn<?, ?> colAlamat;
    @FXML
    private TableColumn<?, ?> colTelfon;
    @FXML
    private TableColumn<?, ?> colBerat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
