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
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
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
    @FXML public TabPane tabPane;
    @FXML public Menu helpMenu;
    
    private static List<Kastel> classList = new LinkedList<>();
    
    static {
    
        classList.add(new CorrectionsController());
        classList.add(new DetailedReportController());
        classList.add(new CountsController());
        classList.add(new EnquiryController());
        classList.add(new FirstCountController());
        classList.add(new NewStocktakeController());
        classList.add(new CorrectionsController());
        classList.add(new OverviewEnquiryController());
        
        classList.add(new ReportController());
        classList.add(new StockOnHandByDeptController());
        //classList.add(new EnquiryController());
        //classList.add(new EnquiryController());
    
    
    }
    
    private TreeItem<String> root;
    private static Model model = new Model();
    @FXML 
    private FlowPane flowPane;
    private List<List<TreeItem<String>>> lst = new LinkedList<>();
    //Image icon = new Image(getClass().getResourceAsStream("C:\\Users\\alpha\\Documents\\NetbeansProjects\\newTheta\\src\\newtheta\\img\\folder.png"));
    @FXML
    public MenuBar menuBar;
    
    private int btnClick =0;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       root = new TreeItem<>("Main");
       mainTab.setClosable(false);
       root.setExpanded(true);
       tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.ALL_TABS);
       //tabPane.setTabClosingPolicy(TabClosingPolicy.ALL_TABS);
       ImageView iv = new ImageView(model.folder);
       iv.setId("mainb");
       root.setGraphic(iv);
       
       
       
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
            
            String bName = i.getGraphic().getId();
            
            Button btn = new Button(bName.substring(0, bName.length()-1));
            btn.setUserData(bName);
            //btn.setAlignment(Pos.BOTTOM_CENTER);
            btn.setContentDisplay(ContentDisplay.TOP);
            
            flowPane.getChildren().add(btnListener(btn));
        
        }
        
    
    }
    
    
    private Button btnListener(Button btn){
        btn.setEffect(new DropShadow());
        btn.setId("button");
        String bName =(String) btn.getUserData();
        ImageView file = new ImageView(model.file);
        ImageView folder = new ImageView(model.folder);
        
        
        
        if(bName.endsWith("l"))
            btn.setGraphic(file);
        else
            btn.setGraphic(folder);
        
        
        btn.setWrapText(true);
        
        btn.setPrefWidth(125);
        btn.setPrefHeight(100);
        
        
            
        
        btn.setOnAction( e -> {
            if(bName.endsWith("l")){
                System.out.println("leaf clicked");
                makeTab(bName);
            }else
               
                 btnClick(bName);
               
        });
        
        return btn;
    }
    
    @FXML
    public void mouseClick(MouseEvent event){
    
        TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
        tabPane.getSelectionModel().select(mainTab);
         
        item.setExpanded(true);
        
        
        String name = item.getGraphic().getId();

        if(name.endsWith("l")){
            makeTab(name);
        }else
            try {
                createChildren(item);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());                    }
        btnClick++;

        
    }
    
    
    
    
    
    
    public void btnClick(String btn){
        
        TreeItem<String> item = new TreeItem<>(btn);
        TreeItem<String> current = treeView.getSelectionModel().getSelectedItem();
        
        
        try{
            
        if(btnClick==0){
        
            
            for (TreeItem<String> i : root.getChildren()){
            
            System.out.println(i.getValue());
            if(i.getGraphic().getId().equals(btn)){
                
                i.getParent().setExpanded(true);
                createChildren(i);
                i.setExpanded(true);
                break;
            }
        }}else
            for (TreeItem<String> i : current.getChildren()){
                if(i.getGraphic().getId().equals(btn)){

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
       if(!isAlive(bName)){
          Tab tab = new Tab(bName);
       
            if(bName.contains(" "))
                bName = bName.replace(" ","_");

            try{

                Node n = (Node) FXMLLoader.load(getClass().getResource("/fxml/"+bName+".fxml"));


                 tab.setContent(n);

                 tabPane.getTabs().add(tab);
                 onOpen(bName);
                 tab.setClosable(true);
                 tab.setOnCloseRequest(k -> {

                     menuBar.getMenus().removeIf(kas -> tab.getText().equalsIgnoreCase(kas.getId()));

                 });
                 tabPane.getSelectionModel().select(tab);
                 System.out.println("  "+tab.isClosable());

            }catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
       }else{
           focusTab(bName);
       
       
       }
       
   }
   


    private void onOpen(String bName) {
        //dynamically deal with all this static string 
        //load all the classes in an array or a list and override to toString in each class so ast to use 
        //that to compare and enable dynamic
        menuBar.getMenus().remove(helpMenu);
        
        for(Kastel object : classList){
                if (bName.equalsIgnoreCase(object.toString())){
                    for(Menu m : object.menus()){
                        menuBar.getMenus().add(addList(m));   
                    }
                    
                    break;
                }
                
        }
        menuBar.getMenus().add(helpMenu);
 
    }

        
    private Menu addList(Menu menu){
        menu.setOnAction(e -> focusTab(menu.getId()));
        for(MenuItem i : menu.getItems()){
            i = actOn(i);
        
        }
        
        return menu;
    }
    
    
    private static MenuItem actOn(MenuItem item){
    
        
        item.setOnAction(e -> {
          
              if(item.getText().equals("Read From Scanner File")){
                  System.out.println("com.swantech.stocktakev2.CorrectionsController.actOn() read from scanner file");
              }else if(item.getText().equals("Read From Scanner")){
                  System.out.println("com.swantech.stocktakev2.CorrectionsController.actOn() read from scanner ");

              }else if(item.getText().equals("Print And Save")){
                  System.out.println("com.swantech.stocktakev2.CorrectionsController.actOn() print and save");

              
              }else if(item.getText().equals("Save")){
                    System.out.println("com.swantech.stocktakev2.CorrectionsController.actOn() save");

              
              }else if(item.getText().equals("Cancel")){
                  System.out.println("com.swantech.stocktakev2.CorrectionsController.actOn() cancel");
              
              }
          
          
          });
        
        

          return item;

    }
    
    private void focusTab(String name){
    
        for(Tab tab : tabPane.getTabs()){
            System.out.println(tab.getText());
            if(tab.getText().equalsIgnoreCase(name)){
                tabPane.getSelectionModel().select(tab);
                //thisTab = tab;
                break;
            }
        
        }
    }

    private boolean isAlive(String bName) {
        
        boolean value = false;
        
        for(Tab m : tabPane.getTabs())
            if(m.getText().equalsIgnoreCase(bName)){
                System.out.println(m.getText()+" .isAlive()");
                value = true;
                break;
            }
        return value;
    }
   
     
}
