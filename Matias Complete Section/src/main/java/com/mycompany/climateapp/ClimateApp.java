/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.climateapp;

/**
 *
 * @author ivanr
 */
public class ClimateApp {

    public static void main(String[] args) {
        // Initialization of classes
        DataHandler dataHandler = new DataHandlerImp();
        UserInterface ui = new UserInterface(dataHandler);
        
        // Connect to the database
        dataHandler.connectToDatabase();
        
        // Start the application
        ClimateApp app = new ClimateApp();
        app.start(ui, dataHandler);
    }
     public void start(UserInterface ui, DataHandler dataHandler) {
        // Application start logic
        ui.getInput();

        // Example: Retrieve and display data
        ClimateData climateData = dataHandler.retrieveData(ui.getSelectedContinent(), ui.getSelectedRegion(), ui.getSelectedDate());
        ui.showOutput(climateData);
    }
     
     public void displayData(ClimateData data) {
        // Display data to the user
    }
}
