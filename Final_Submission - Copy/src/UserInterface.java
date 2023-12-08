/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
/**
 *
 * @author ivanr
 */
public class UserInterface {
    // Attributes
    private DataHandler dataHandler;
    private String selectedContinent;
    private String selectedRegion;
    private Date selectedDate;
    
    public UserInterface(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }
    
    // Methods
    public void getInput() {
    Scanner scanner = new Scanner(System.in);
    
    showAvailableContinents((List<String>) dataHandler.getAvailableContinents());
    
    System.out.println("Select continent:");
    this.selectedContinent = scanner.nextLine();

    System.out.println("Select region (West, South, East, North):");
    this.selectedRegion = scanner.nextLine();

    System.out.println("Enter year:");
    int year = scanner.nextInt();
    scanner.nextLine();
    this.selectedDate = new Date(year-1900, 0, 1); //Date constructor expects year since 1900
}
    
    // Method to show available continents
    private void showAvailableContinents(List<String> continents) {
        System.out.println("Available Continents:");
        for (String continent : continents) {
            System.out.println(continent);
        }
    }

    public void showOutput(ClimateData data) {
    if (data != null) {
        System.out.println("Climate Data for " + this.selectedContinent + " on " +
                           data.getYear() + "-" + data.getMonth() + "-" + data.getDay() + ":");
        System.out.println("Temperature: " + data.getTemperature() + "°C");
        printVisualRepresentation("Temperature", data.getTemperature(), 50); // 50 is the scale factor for representation

        System.out.println("Humidity: " + data.getHumidity() + "%");
        printVisualRepresentation("Humidity", data.getHumidity(), 100); // 100 is the max humidity percentage

        System.out.println("Rainfall: " + data.getRainfall() + "mm");
        printVisualRepresentation("Rainfall", data.getRainfall(), 200); // Assuming 200mm is a significant rainfall

        System.out.println("CO2 Levels: " + data.getCarbonDioxideLevel() + "ppm");
        printVisualRepresentation("CO2 Levels", data.getCarbonDioxideLevel(), 1000); // Assuming 1000ppm as a scale reference

        float averageTemperature = 20.0f; // Placeholder for average temperature
        float averageRainfall = 50.0f; // Placeholder for average rainfall
        float averageCO2Level = 400.0f; // Placeholder for average CO2 levels

        System.out.println("The temperature is " +
                           ((data.getTemperature() > averageTemperature) ? "above" : "below") +
                           " the historical average for this region.");
        System.out.println("The rainfall is " +
                           ((data.getRainfall() > averageRainfall) ? "above" : "below") +
                           " the historical average for this region.");
        System.out.println("The CO2 levels are " +
                           ((data.getCarbonDioxideLevel() > averageCO2Level) ? "above" : "below") +
                           " the historical average for this region.");
    } else {
        System.out.println("No data available for this region.");
    }
    linkToArticle();
}

private void printVisualRepresentation(String dataType, float dataValue, float scale) {
    int visualLength = (int) (dataValue / scale * 50);
    visualLength = Math.min(visualLength, 50); // Limit the length to 50 characters

    System.out.print(dataType + " trend: ");
    for (int i = 0; i < visualLength; i++) {
        System.out.print("|");
    }
    System.out.println(); //Move to the next line
}

    public void linkToArticle() {
        System.out.println("For more information, visit: [website link]");
        System.out.println("Take a quiz to learn more: [quiz link]");
    }

    // Getters
    public String getSelectedContinent() {
        return selectedContinent;
    }
    
    public String getSelectedRegion() {
        return selectedRegion;
    }
    
    public Date getSelectedDate() {
        return selectedDate;
    }

}