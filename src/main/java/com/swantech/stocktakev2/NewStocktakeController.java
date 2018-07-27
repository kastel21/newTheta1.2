package com.swantech.stocktakev2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TextField;

public class NewStocktakeController implements Initializable
{
  @FXML
  private Spinner<Integer> spinner;
  @FXML
  private CheckBox answer;
  @FXML
  private Label l1;
  @FXML
  private Label l2;
  @FXML
  private Label l3;
  @FXML
  private TextField tf1;
  @FXML
  private TextField tf2;
  
  public NewStocktakeController() {}
  
  public void initialize(URL url, ResourceBundle rb)
  {
    SpinnerValueFactory<Integer> intFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 4);
    spinner.setValueFactory(intFactory);
    
    boolean check = answer.isSelected();
    
    l1.setVisible(check);
    l2.setVisible(check);
    l3.setVisible(check);
    tf1.setVisible(check);
    tf2.setVisible(check);
  }
  





  public void toogleCheck(ActionEvent event)
  {
    boolean check = answer.isSelected();
    
    l1.setVisible(check);
    l2.setVisible(check);
    l3.setVisible(check);
    tf1.setVisible(check);
    tf2.setVisible(check);
  }
}
