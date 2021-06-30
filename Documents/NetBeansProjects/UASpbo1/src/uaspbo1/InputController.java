/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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

    private Alert alertWarning = new Alert(Alert.AlertType.WARNING);
    private Alert alertInfo = new Alert(Alert.AlertType.INFORMATION);

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void OnActionHandleButtonInput(ActionEvent event) throws IOException {

        String file = "src/Data.txt";
        FileWriter write = new FileWriter(file, true);

        String nama = txtNama.getText();
        String alamat = txtAreaAlamat.getText();
        String telfon = txtTelfon.getText();
        String berat = txtBerat.getText();

        write.write(nama + " ");
        write.write(alamat + " ");
        write.write(telfon + " ");
        write.write(berat + " ");
        write.close();

        if (txtNama.getText().equals("")) {
            alertWarning.setContentText("Nama tidak boleh kosong!!!");
            alertWarning.showAndWait();
        } else if (txtAreaAlamat.getText().equals("")) {
            alertWarning.setContentText("Alamat tidak boleh kosong!!!");
            alertWarning.showAndWait();
        } else if (txtTelfon.getText().equals("")) {
            alertWarning.setContentText("Nomor Telfon tidak boleh kosong!!!");
            alertWarning.showAndWait();
        } else if (txtBerat.getText().equals("")||txtBerat.getText().equals("0")) {
            alertWarning.setContentText("Berat tidak boleh kosong!!!");
            alertWarning.showAndWait();
        } else {
            alertInfo.setContentText("Data berhasil di isi!!!");
            alertInfo.showAndWait();
            txtNama.setText("");
            txtAreaAlamat.setText("");
            txtTelfon.setText("");
            txtBerat.setText("");
        }
    }
}
