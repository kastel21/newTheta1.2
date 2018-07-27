package com.swantech.stocktakev2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

public class FXMLController implements javafx.fxml.Initializable
{
  @javafx.fxml.FXML
  private javafx.scene.control.Label label;
  
  public FXMLController() {}
  
  @javafx.fxml.FXML
  private void handleButtonAction(ActionEvent event)
  {
    System.out.println("You clicked me!");
    label.setText("Hello World!");
  }
  
  public void initialize(URL url, ResourceBundle rb) {}
}
