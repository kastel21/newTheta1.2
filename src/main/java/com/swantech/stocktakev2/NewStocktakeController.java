/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swantech.stocktakev2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author theta
 */
public class NewStocktakeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Spinner<Integer> spinner;
    @FXML private CheckBox answer;
    @FXML private Label l1,l2,l3;
    @FXML private TextField tf1,tf2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        SpinnerValueFactory<Integer> intFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,100,4);
        this.spinner.setValueFactory(intFactory);
        
        boolean check =  answer.isSelected();

        l1.setVisible(check);
        l2.setVisible(check);
        l3.setVisible(check);
        tf1.setVisible(check);
        tf2.setVisible(check);
        
        
        
            
    }
    
    
    public void toogleCheck(ActionEvent event){
        
        boolean check =  answer.isSelected();

        l1.setVisible(check);
        l2.setVisible(check);
        l3.setVisible(check);
        tf1.setVisible(check);
        tf2.setVisible(check);
    
    }
    
    
    
    
    
    
    
}
