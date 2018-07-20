/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swantech.stocktakev2;


import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

import javax.swing.*;
/**
 *
 * @author alpha
 */
public class WelcomeController implements Initializable{

    @FXML 
    private TreeView <String> treeView ;
    @FXML
    private Tab mainTab;
    @FXML private TabPane tabPane;
    
    private TreeItem<String> root;
    private static Model model = new Model();
    @FXML 
    private FlowPane flowPane;
    private List<List<TreeItem<String>>> lst = new LinkedList<>();
    //Image icon = new Image(getClass().getResourceAsStream("C:\\Users\\alpha\\Documents\\NetbeansProjects\\newTheta\\src\\newtheta\\img\\folder.png"));
    @FXML
    private MenuBar menuBar;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       root = new TreeItem<>("Main");
       mainTab.setClosable(false);
       root.setExpanded(true);
       
       
       
        try {
            createChildren(root);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       treeView.setRoot(root);
       
       treeView.setVisible(true);
       
    }
    private final List<String> lstNames = new LinkedList<>();
    
    private void createChildren(TreeItem<String> branch)  {
        
        
        List<TreeItem<String>> localList;
        String bName = branch.getValue();
        
        
        
        if(bName.endsWith("b")){
            System.out.println("in create childs "+ bName);
            localList = model.getTreeItems(bName.substring(0,bName.length()-1));
        }else
            localList = model.getTreeItems(bName);

         lst.add(localList);
        if(!lstNames.contains(bName))
            branch.getChildren().addAll(localList);
        
        populate(localList);
        
        lstNames.add(bName);
        
        
        
    
    
    
    
    }
    
    
    private void populate(List<TreeItem<String>> lst){
        flowPane.setPadding(new Insets(15));
        
        
        
        flowPane.getChildren().clear();
        
        
        for (TreeItem<String> i : lst){
            flowPane.getChildren().add(btnListener(new Button(i.getValue())));
        
        }
        
    
    }
    
    
    private Button btnListener(Button btn){
        btn.setEffect(new DropShadow());
        btn.setId("button");
        String bName = btn.getText();
        if(bName.endsWith("l"))
            btn.setGraphic(new ImageView(model.file));
        else
            btn.setGraphic(new ImageView(model.folder));
        
        
        btn.setWrapText(true);
        
        btn.setPrefWidth(125);
        btn.setPrefHeight(100);
        
        
            
        
        btn.setOnAction((ActionEvent event) -> {
            if(bName.endsWith("l")){
                System.out.println("leaf clicked");
                
                
                
                
                makeTab(bName);
                
                

            }else
                try {
                    btnClick(btn.getText());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        });
        
        return btn;
    }
    
    @FXML
    public void mouseClick(MouseEvent event){
    
        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
        tabPane.getSelectionModel().select(mainTab);
        
        item.setExpanded(true);
        
        if(item != null){
            String name = item.getValue();

                if(name.endsWith("l")){
                    makeTab(name);
                }else
                    try {
                        createChildren(item);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());                    }
            btnClick++;

        }
    }
    private int btnClick =0;
    public void btnClick(String btn){
        
        TreeItem<String> item = new TreeItem<>(btn);
        TreeItem<String> current = treeView.getSelectionModel().getSelectedItem();
        
        
        try{
            
        if(btnClick==0){
        
            
            for (TreeItem<String> i : root.getChildren()){
            
            System.out.println(i.getValue());
            if(i.getValue().equals(btn)){
                
                i.getParent().setExpanded(true);
                createChildren(i);
                i.setExpanded(true);
                break;
            }
        }}else
            for (TreeItem<String> i : current.getChildren()){
                if(i.getValue().equals(btn)){

                    i.getParent().setExpanded(true);
                    createChildren(i);
                    i.setExpanded(true);
                    break;
                }
        }

        if(item.getValue().endsWith("l")){
           System.out.println("leaf clicked");
           flowPane.getChildren().clear();
        }else
            
        
        btnClick++;
        
        
        }catch(Exception e){System.out.println(e.getMessage());}
    }

    @FXML
    private void close(ActionEvent event) {
        
        
        System.exit(1);
    }

   private void makeTab(String bName){
   
       bName = bName.substring(0,bName.length()-1);
       if(bName.contains(" "))
           bName= bName.replace(" ","_");
       Tab tab = new Tab(bName);
       
       
                
       tab.setContent(new Text(bName));
       
       try{
       
       SwingNode sn = new SwingNode();
       RecievingServices rs = new RecievingServices();
       sn.setContent(rs.getComps());
       tab.setContent(sn);
       tabPane.getTabs().add(tab);
       
       tabPane.getSelectionModel().select(tab);
       tab.setClosable(true);
       
       }catch(Exception e){
           System.out.println(e.getMessage());
       }

   }
     
}
