package com.swantech.stocktakev2;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public abstract class confirmBase extends javafx.scene.layout.AnchorPane
{
  private final Button yes;
  private final Button no;
  private final Label msg;
  
  public confirmBase()
  {
    yes = new Button();
    no = new Button();
    msg = new Label();
    
    setId("AnchorPane");
    setPrefHeight(150.0D);
    setPrefWidth(300.0D);
    
    yes.setLayoutX(33.0D);
    yes.setLayoutY(77.0D);
    yes.setMnemonicParsing(false);
    yes.setPrefHeight(35.0D);
    yes.setPrefWidth(81.0D);
    yes.setText("Yes");
    yes.setFont(new Font("System Bold Italic", 15.0D));
    
    no.setLayoutX(185.0D);
    no.setLayoutY(77.0D);
    no.setMnemonicParsing(false);
    no.setPrefHeight(35.0D);
    no.setPrefWidth(81.0D);
    no.setText("No");
    no.setFont(new Font("System Bold Italic", 15.0D));
    
    msg.setLayoutX(122.0D);
    msg.setLayoutY(32.0D);
    msg.setText("Label");
    msg.setFont(new Font("System Bold Italic", 14.0D));
    
    getChildren().add(yes);
    getChildren().add(no);
    getChildren().add(msg);
  }
}
