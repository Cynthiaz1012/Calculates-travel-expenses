package com.mycompany.lab04_cynthia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        
        Label daysLabel = new Label("Number of days:");
        Label airfareLabel = new Label("Airfare:");
        Label carRentalLabel = new Label("Car rental:");
        Label milesLabel = new Label("Miles driven:");
        Label parkingLabel = new Label("Parking fees:");
        Label taxiLabel = new Label("Taxi charges:");
        Label conferenceLabel = new Label("Conference fees:");
        Label lodgingLabel = new Label("Lodging per night:");
        
        TextField daysField = new TextField();
        TextField airfareField = new TextField();
        TextField carRentalField = new TextField();
        TextField milesField = new TextField();
        TextField parkingField = new TextField();
        TextField taxiField = new TextField();
        TextField conferenceField = new TextField();
        TextField lodgingField = new TextField();
        
        Button calculateBtn = new Button("Calculate");
        Button clearBtn = new Button("Clear");

        Label totalLabel = new Label("Total expenses:");
        Label allowableLabel = new Label("Total allowable expenses:");
        Label excessLabel = new Label("Excess to be paid:");
        Label savedLabel = new Label("Amount saved:");

        Label messageLabel = new Label();
        
        Scene scene = new Scene(root, 500, 600);
        stage.setTitle("Business Travel Expense Calculator");
        stage.setScene(scene);
        stage.show();
    }
    
     public static void main(String[] args) {
        launch(args);
    }
}
