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
        
        grid.add(daysLabel, 0, 1);
        grid.add(daysField, 1, 1);

        grid.add(airfareLabel, 0, 2);
        grid.add(airfareField, 1, 2);

        grid.add(carRentalLabel, 0, 3);
        grid.add(carRentalField, 1, 3);

        grid.add(milesLabel, 0, 4);
        grid.add(milesField, 1, 4);

        grid.add(parkingLabel, 0, 5);
        grid.add(parkingField, 1, 5);

        grid.add(taxiLabel, 0, 6);
        grid.add(taxiField, 1, 6);

        grid.add(conferenceLabel, 0, 7);
        grid.add(conferenceField, 1, 7);

        grid.add(lodgingLabel, 0, 8);
        grid.add(lodgingField, 1, 8);

        grid.add(calculateBtn, 0, 9);
        grid.add(clearBtn, 1, 9);

        grid.add(totalLabel, 0, 11);
        grid.add(allowableLabel, 0, 12);
        grid.add(excessLabel, 0, 13);
        grid.add(savedLabel, 0, 14);
        grid.add(messageLabel, 0, 15);

        root.setCenter(grid);
        
        calculateBtn.setOnAction(event -> {
            int days = Integer.parseInt(daysField.getText());
            double airfare = 0;
            double carRental = 0;
            double miles = 0;
            double parking = 0;
            double taxi = 0;
            double conference = 0;
            double lodging = Double.parseDouble(lodgingField.getText());

            if (airfareField.getText().length() > 0)
                airfare = Double.parseDouble(airfareField.getText());

            if (carRentalField.getText().length() > 0)
                carRental = Double.parseDouble(carRentalField.getText());
            
            if (milesField.getText().length() > 0)
                 miles = Double.parseDouble(milesField.getText());

            if (parkingField.getText().length() > 0)
                parking = Double.parseDouble(parkingField.getText());

            if (taxiField.getText().length() > 0)
                taxi = Double.parseDouble(taxiField.getText());

            if (conferenceField.getText().length() > 0)
                conference = Double.parseDouble(conferenceField.getText());

            double meals = days * 37;
            double mileage = miles * 0.27;

            double parkingAllowed = parking;
            if (parking > days * 10)
                parkingAllowed = days * 10;

            double taxiAllowed = taxi;
            if (taxi > days * 20)
                taxiAllowed = days * 20;

            double lodgingAllowed = lodging;
            if (lodging > 95)
                lodgingAllowed = 95;
            
            double totalExpenses = meals + airfare + carRental + mileage + parking + taxi + conference + lodging * days;
            double totalAllowable = meals + airfare + carRental + mileage + parkingAllowed + taxiAllowed + conference + lodgingAllowed * days;
            double excess = totalExpenses - totalAllowable;
            double saved = totalAllowable - totalExpenses;

            if (excess < 0)
                excess = 0;

            if (saved < 0)
                saved = 0;

        });
        
        clearBtn.setOnAction(event -> {
            daysField.setText("");
            airfareField.setText("");
            carRentalField.setText("");
            milesField.setText("");
            parkingField.setText("");
            taxiField.setText("");
            conferenceField.setText("");
            lodgingField.setText("");

            totalLabel.setText("Total expenses:");
            allowableLabel.setText("Total allowable expenses:");
            excessLabel.setText("Excess to be paid:");
            savedLabel.setText("Amount saved:");

            messageLabel.setText("");
        });
                
        Scene scene = new Scene(root, 500, 600);
        stage.setTitle("Business Travel Expense Calculator");
        stage.setScene(scene);
        stage.show();
    }
    
     public static void main(String[] args) {
        launch(args);
    }
}
