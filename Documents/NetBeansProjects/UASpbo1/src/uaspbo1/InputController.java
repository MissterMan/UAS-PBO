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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Prayogi
 */
public class InputController implements Initializable {

    @FXML
    private TextField txtNama;
    @FXML
    private TextArea txtAreaAlamat;
    @FXML
    private TextField txtTelfon;
    @FXML
    private TextField txtBerat;
    @FXML
    private Button btnInput;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}
