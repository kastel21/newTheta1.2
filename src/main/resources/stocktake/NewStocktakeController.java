/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktake;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author theta
 */
public class NewStocktakeController implements Initializable {

    @FXML
    private SplitPane slitPane;
    @FXML
    private AnchorPane leftPane;
    @FXML
    private DatePicker date;
    @FXML
    private Spinner<?> spinner;
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private TextField tf1;
    @FXML
    private Label l3;
    @FXML
    private TextField tf2;
    @FXML
    private CheckBox answer;
    @FXML
    private AnchorPane rightPane;
    @FXML
    private Label infoLabel;
    @FXML
    private Button btnFolders;
    @FXML
    private Button btnFolders1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void toogleCheck(ActionEvent event) {
    }
    
}
