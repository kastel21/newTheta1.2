package com.swantech.stocktakev2;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application
{
  public static Stage stage;
  
  public MainApp() {}
  
  public void start(Stage stage) throws Exception
  {
    Parent root = (Parent)javafx.fxml.FXMLLoader.load(getClass().getResource("/fxml/welcome.fxml"));
    stage = stage;
    Scene scene = new Scene(root);
    scene.getStylesheets().add("/styles/Styles.css");
    
    stage.setTitle("Kapitol KAS");
    stage.setScene(scene);
    stage.show();
  }
  







  public static void main(String[] args)
  {
    launch(args);
  }
}
