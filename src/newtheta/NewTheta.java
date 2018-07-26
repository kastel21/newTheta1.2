/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtheta;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author alpha
 */
public class NewTheta extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
       
        
        Parent root = FXMLLoader.load(getClass().getResource("newTheta4.fxml"));
        primaryStage.setTitle("Hello User");
        Scene scene = new Scene(root, 1200, 670);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false); 
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
