package fxml;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public abstract class CorrectionsBase extends AnchorPane {

    protected final TableView tableView;
    protected final TableColumn tableColumn;
    protected final TableColumn tableColumn0;
    protected final TableColumn tableColumn1;
    protected final TableColumn tableColumn2;
    protected final TableColumn tableColumn3;
    protected final TableColumn tableColumn4;
    protected final TableColumn tableColumn5;
    protected final MenuBar menuBar;
    protected final Menu menu;
    protected final MenuItem menuItem;
    protected final Menu menu0;
    protected final MenuItem menuItem0;
    protected final MenuItem menuItem1;
    protected final Menu menu1;
    protected final MenuItem menuItem2;
    protected final MenuItem menuItem3;
    protected final MenuItem menuItem4;
    protected final Menu menu2;
    protected final MenuItem menuItem5;

    public CorrectionsBase() {

        tableView = new TableView();
        tableColumn = new TableColumn();
        tableColumn0 = new TableColumn();
        tableColumn1 = new TableColumn();
        tableColumn2 = new TableColumn();
        tableColumn3 = new TableColumn();
        tableColumn4 = new TableColumn();
        tableColumn5 = new TableColumn();
        menuBar = new MenuBar();
        menu = new Menu();
        menuItem = new MenuItem();
        menu0 = new Menu();
        menuItem0 = new MenuItem();
        menuItem1 = new MenuItem();
        menu1 = new Menu();
        menuItem2 = new MenuItem();
        menuItem3 = new MenuItem();
        menuItem4 = new MenuItem();
        menu2 = new Menu();
        menuItem5 = new MenuItem();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(650.0);
        setPrefWidth(1000.0);

        AnchorPane.setBottomAnchor(tableView, 0.0);
        AnchorPane.setLeftAnchor(tableView, 0.0);
        AnchorPane.setRightAnchor(tableView, 0.0);
        AnchorPane.setTopAnchor(tableView, 34.0);
        tableView.setLayoutX(28.0);
        tableView.setLayoutY(34.0);
        tableView.setPrefHeight(616.0);
        tableView.setPrefWidth(1000.0);

        tableColumn.setPrefWidth(75.0);
        tableColumn.setText("File No");

        tableColumn0.setPrefWidth(75.0);
        tableColumn0.setText("Location");

        tableColumn1.setPrefWidth(290.0);
        tableColumn1.setText("Description");

        tableColumn2.setPrefWidth(207.0);
        tableColumn2.setText("Barcode");

        tableColumn3.setMinWidth(0.0);
        tableColumn3.setPrefWidth(123.0);
        tableColumn3.setText("EAN Code");

        tableColumn4.setPrefWidth(109.0);
        tableColumn4.setText("Prices");

        tableColumn5.setPrefWidth(120.0);
        tableColumn5.setText("Count");

        menuBar.setLayoutX(-1.0);
        menuBar.setLayoutY(2.0);
        menuBar.setPrefHeight(26.0);
        menuBar.setPrefWidth(1000.0);

        menu.setMnemonicParsing(false);
        menu.setText("File");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Close");

        menu0.setMnemonicParsing(false);
        menu0.setText("Scanner");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Read From Scanner File");

        menuItem1.setMnemonicParsing(false);
        menuItem1.setText("Read From Scanner");

        menu1.setMnemonicParsing(false);
        menu1.setText("Save");

        menuItem2.setMnemonicParsing(false);
        menuItem2.setText("Print And Save");

        menuItem3.setMnemonicParsing(false);
        menuItem3.setText("Save");

        menuItem4.setMnemonicParsing(false);
        menuItem4.setText("Cancel");

        menu2.setMnemonicParsing(false);
        menu2.setText("Help");

        menuItem5.setMnemonicParsing(false);
        menuItem5.setText("About");

        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);
        tableView.getColumns().add(tableColumn1);
        tableView.getColumns().add(tableColumn2);
        tableView.getColumns().add(tableColumn3);
        tableView.getColumns().add(tableColumn4);
        tableView.getColumns().add(tableColumn5);
        getChildren().add(tableView);
        menu.getItems().add(menuItem);
        menuBar.getMenus().add(menu);
        menu0.getItems().add(menuItem0);
        menu0.getItems().add(menuItem1);
        menuBar.getMenus().add(menu0);
        menu1.getItems().add(menuItem2);
        menu1.getItems().add(menuItem3);
        menu1.getItems().add(menuItem4);
        menuBar.getMenus().add(menu1);
        menu2.getItems().add(menuItem5);
        menuBar.getMenus().add(menu2);
        getChildren().add(menuBar);

    }
}
