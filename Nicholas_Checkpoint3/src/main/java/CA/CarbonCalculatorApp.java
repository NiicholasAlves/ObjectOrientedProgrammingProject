/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA;

/**
 *
 * @author nicho
 */
import java.util.Scanner;

public class CarbonCalculatorApp {
    public static void main(String[] args) {
        // Example usage of the classes
        TransportationData transportation = new TransportationData();
        transportation.gatherTransportationData();
        transportation.calculateCarbonFootprint();
        System.out.println("Transportation Carbon Footprint: " + transportation.getTotalCarbonFootprint() + " tons CO2");

        EnergyData energy = new EnergyData();
        energy.gatherEnergyData();
        energy.calculateCarbonFootprint();
        System.out.println("Energy Carbon Footprint: " + energy.getTotalCarbonFootprint() + " tons CO2");
        
        double totalCarbonFootprint = transportation.getTotalCarbonFootprint() + energy.getTotalCarbonFootprint();
        System.out.println("Total Carbon Footprint: " + totalCarbonFootprint + " tons CO2");
        
        ReductionSuggestions suggestions = new ReductionSuggestions();
        suggestions.writeSuggestionsToFile("carbon_footprint_suggestions.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to read the suggestions from the file? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            suggestions.readSuggestionsFromFile("carbon_footprint_suggestions.txt");
        } else {
            System.out.println("Thank you. Exiting the program.");
        }
        
        //Display, Search and Delete
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Display all suggestions");
            System.out.println("2. Search for a suggestion");
            System.out.println("3. Delete a suggestion");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    suggestions.displaySuggestions();
                    break;
                case 2:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    suggestions.searchAndDisplay(keyword);
                    break;
                case 3:
                    System.out.print("Enter suggestion to delete: ");
                    String suggestionToDelete = scanner.nextLine();
                    suggestions.deleteSuggestion(suggestionToDelete);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 4);
    }
}
