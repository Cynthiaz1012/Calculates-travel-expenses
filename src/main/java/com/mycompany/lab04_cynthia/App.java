package com.mycompany.lab04_cynthia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        
        Scene scene = new Scene(root, 500, 600);
        stage.setTitle("Business Travel Expense Calculator    ");
        stage.setScene(scene);
        stage.show();
    }
    
     public static void main(String[] args) {
        launch(args);
    }
}
