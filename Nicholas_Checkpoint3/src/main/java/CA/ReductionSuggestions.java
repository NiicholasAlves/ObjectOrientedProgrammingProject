/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA;

/**
 *
 * @author nicho
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReductionSuggestions {
    private List<String> suggestions;

    public ReductionSuggestions() {
        suggestions = new ArrayList<>();
        initializeSuggestions();
    }

    private void initializeSuggestions() {
        // Add 10 suggestions to reduce the carbon footprint
        suggestions.add("1)Use public transportation or carpooling whenever possible.");
        suggestions.add("2)Reduce energy consumption by turning off lights when not in use.");
        suggestions.add("3)Opt for reusable bags instead of single-use plastic bags.");
        suggestions.add("4)Conserve water by fixing leaks and using water-saving appliances.");
        suggestions.add("5)Plant trees or support reforestation efforts.");
        suggestions.add("6)Eat a plant-based diet or reduce meat consumption.");
        suggestions.add("7)Use energy-efficient appliances and light bulbs.");
        suggestions.add("8)Invest in renewable energy sources like solar or wind power.");
        suggestions.add("9)Recycle paper, plastic, glass, and other recyclable materials.");
        suggestions.add("10)Support eco-friendly businesses and products.");

        // You can add more suggestions as needed
    }

    public void writeSuggestionsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String suggestion : suggestions) {
                writer.write(suggestion);
                writer.newLine();
            }
            System.out.println("Suggestions have been written to the file: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing suggestions to the file: " + e.getMessage());
        }
    }
    
    public void readSuggestionsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Suggestions to reduce carbon footprint from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading suggestions from the file: " + e.getMessage());
        }
    }
    
    public void displaySuggestions() {
        System.out.println("List of Suggestions to Reduce Carbon Footprint:");
        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }

    public void searchAndDisplay(String keyword) {
        System.out.println("Search results for keyword '" + keyword + "':");
        boolean found = false;
        for (String suggestion : suggestions) {
            if (suggestion.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(suggestion);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No suggestions found for the keyword '" + keyword + "'.");
        }
    }

    public void deleteSuggestion(String suggestionToDelete) {
        if (suggestions.remove(suggestionToDelete)) {
            System.out.println("Suggestion '" + suggestionToDelete + "' has been deleted.");
        } else {
            System.out.println("Suggestion '" + suggestionToDelete + "' not found in the list.");
        }
    }
}
