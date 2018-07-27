package com.swantech.stocktakev2;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;



















public class CorrectionsController
  implements Initializable
{
  @FXML
  private AnchorPane aPane;
  private Model model;
  private static TabPane tabPane;
  private static MenuBar menuBar;
  
  public CorrectionsController() {}
  
  public List<Menu> menus()
  {
    List<Menu> lst = new LinkedList();
    















    Menu menu0 = new Menu();
    menu0.setId("corrections");
    menu0.setMnemonicParsing(false);
    menu0.setText("Scanner");
    
    Menu menu1 = new Menu();
    menu1.setId("corrections");
    menu1.setMnemonicParsing(true);
    menu1.setText("Save");
    



    MenuItem menuItem0 = new MenuItem();
    menuItem0.setId("corrections");
    menuItem0.setMnemonicParsing(false);
    menuItem0.setText("Read From Scanner File");
    
    MenuItem menuItem1 = new MenuItem();
    menuItem1.setId("corrections");
    menuItem1.setMnemonicParsing(false);
    menuItem1.setText("Read From Scanner");
    
    MenuItem menuItem2 = new MenuItem();
    menuItem2.setId("corrections");
    menuItem2.setMnemonicParsing(false);
    menuItem2.setText("Print And Save");
    
    MenuItem menuItem3 = new MenuItem();
    menuItem3.setId("corrections");
    menuItem3.setMnemonicParsing(false);
    menuItem3.setText("Save");
    
    MenuItem menuItem4 = new MenuItem();
    menuItem4.setId("corrections");
    menuItem4.setMnemonicParsing(false);
    menuItem4.setText("Cancel");
    

    menu0.getItems().add(menuItem0);
    menu0.getItems().add(menuItem1);
    lst.add(menu1);
    
    menu1.getItems().add(menuItem2);
    menu1.getItems().add(menuItem3);
    menu1.getItems().add(menuItem4);
    lst.add(menu0);
    




    return lst;
  }
  



  public void initialize(URL url, ResourceBundle rb)
  {
    model = new Model();
  }
  




  public void onTabClose()
  {
    if (menuBar.getMenus().removeAll(menus())) {}
  }
}
